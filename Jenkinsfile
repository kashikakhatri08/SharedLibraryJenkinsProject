//Jenkinsfile
@Library('SharedLibraryRepo') _
pipeline {
    agent any
    stages {
        stage('Example') {
            steps {
                cleanWs()
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'RelativeTargetDirectory', relativeTargetDir: 'jenkins-control']], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/kashikakhatri08/Maven_Project_demo.git']]])
               
                welcomeJob 'Devops Team'
                
              
            }
        }
    }
    post { 
        always { 
            echo 'I will always say Hello again!'
        }
    }
}
