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
                //  sh "docker run --rm -e SELENIUM_HUB=${seleniumHub} -e BROWSER=chrome -e MODULE=runner.Start -v ${WORKSPACE}/AutomationPipeline:/usr/share/suman/test-output --network ${network} vagrant/containertest"
               //sh "docker run --rm -ti --name zalenium -p 4444:4444 -v /var/run/docker.sock:/var/run/docker.sock -v /tmp/videos:/home/seluser/videos --privileged dosel/zalenium"
               
				sh "docker run -d --rm -i --name zalenium -p 4444:4444  -v /var/run/docker.sock:/var/run/docker.sock -v /tmp/videos:/home/seluser/videos --privileged dosel/zalenium start"
                sleep(time:80,unit:"SECONDS") 
			   sh "docker run --rm -e SELENIUM_HUB=${seleniumHub}  -e BROWSER=chrome -e MODULE=CucumberOptions.TestRunner  -v ${WORKSPACE}/cucumberextentreport:/usr/share/suman/test-output vagrant/containertest"
				//sh './node_modules/.bin/wdio wdio.conf.js'

				//archive all the files under 'search' directory
                  archiveArtifacts artifacts: 'target/**', fingerprint: true
            
                            
            
         }
      }
	  
	  stage ('Stop Zalenium'){
                steps{
                    sh 'docker stop zalenium'
                }
            }
		
      
   }
}