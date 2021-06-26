import com.sharedLibraryTest.BuildClass

def call(int buildNumber,string JobName) {
  def classBuild = new BuildClass()
  if (buildNumber % 2 == 0) {
    pipeline {
      agent any
      stages {
        stage('Even Build Job') {
          steps {
            classBuild.EvenBuild(JobName,buildNumber)
          }
        }
      }
    }
  } else {
    pipeline {
      agent any
      stages {
        stage('Odd Build Job') {
          steps {
            classBuild.EvenBuild(JobName,buildNumber)
          }
        }
      }
    }
  }
}