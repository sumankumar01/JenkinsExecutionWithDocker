::cd D:\****** Framework\******
::java -cp ".;D:\****** Framework\lib\*;D:\****** Framework\******\bin" org.testng.TestNG Copa.xml
::cmd /k

::cd D:\AutonationWithDockerJenkins\ExecutionOnJenkins\target\
::javac -cp ".;jarfile_runner.jar" D:\AutonationWithDockerJenkins\ExecutionOnJenkins\src\test\java\runner\Start.java
::cmd /k

cd D:\AutonationWithDockerJenkins\ExecutionOnJenkins\
mvn test
cmd /k

