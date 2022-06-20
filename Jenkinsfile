//Jenkinsfile
@Library('SharedLibraryRepo') _
pipeline {
    agent any
    stages {
        stage('Example') {
            steps {
                cleanws()
                git credentialsId: 'kashikakhatri08', url: 'https://github.com/kashikakhatri08/Maven_Project_demo.git'
                welcomeJob 'Hello Devops Team'
                
              
            }
        }
    }
    post { 
        always { 
            echo 'I will always say Hello again!'
        }
    }
}
