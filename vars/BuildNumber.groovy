import com.sharedLibraryTest.BuildClass

def call(int buildNumber,String currentJobName) {
  def classBuild = new BuildClass(script:this)
  if (buildNumber % 2 == 0) {
    pipeline {
      agent any
      stages {
        stage('Even Build Job') {
          steps {
            script{
            classBuild.EvenBuild(currentJobName,buildNumber)
            }
          }
        }
      }
    }
  }
}
  
