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
            if (buildNumber % 2 == 0) {
            classBuild.EvenBuild(currentJobName,buildNumber)
            }
            else{
            classBuild.OddBuild(currentJobName,buildNumber)
            }
          }
        }
      }
    }
  }
}
  
