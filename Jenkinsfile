def network='jenkins-${BUILD_NUMBER}'
def seleniumHub='selenium-hub-${BUILD_NUMBER}'
def chrome='chrome-${BUILD_NUMBER}'
def firefox='firefox-${BUILD_NUMBER}'
def containertest='conatinertest-${BUILD_NUMBER}'
   
pipeline {
  
        agent {
                any {
                    image 'maven:3-alpine'
                    args '-v $HOME/.m2:/root/.m2'
                }
            }
   

   stages{
      stage('Setting Up Selenium Grid') {
         steps{        
            sh "docker network create ${network}"
            sh "docker run -d -p 4444:4444 --name ${seleniumHub} --network ${network} selenium/hub"
            sh "docker run -d -e HUB_PORT_4444_TCP_ADDR=${seleniumHub} -e HUB_PORT_4444_TCP_PORT=4444 --network ${network} --name ${chrome} -p 5900:32768 selenium/node-chrome-debug"
            sh "docker run -d -e HUB_PORT_4444_TCP_ADDR=${seleniumHub} -e HUB_PORT_4444_TCP_PORT=4444 --network ${network} --name ${firefox} -p 5901:32769 selenium/node-firefox-debug"
         }
      }
	stage('Build Jar') {
	
	 
            
           
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }
        stage('Build Image') {
            steps {
                script {
                      // vinsdocker/containertest => organization/application - it could be anything
                  app = docker.build("vagrant/containertest")
					 sh "pwd"
                }
            }
        }
      stage('Run Test') {
         steps{
           
                  // a directory 'search' is created for container test-output
                  sh "docker run --rm -e SELENIUM_HUB=${seleniumHub} -e BROWSER=chrome -e MODULE=runner.Start -v ${WORKSPACE}/AutomationPipeline:/usr/share/suman/test-output --network ${network} vagrant/containertest"
                  //archive all the files under 'search' directory
                  archiveArtifacts artifacts: 'target/**', fingerprint: true
            
                            
            
         }
      }
      stage('Tearing Down Selenium Grid') {
          steps {
             //remove all the containers and volumes
             sh "docker rm -vf ${chrome}"
            sh "docker rm -vf ${firefox}"
            sh "docker rm -vf ${seleniumHub}"
             sh "docker network rm ${network}"
          }
        }   
   }
}