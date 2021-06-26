import com.sharedLibraryTest.BuildClass

def call(int buildNumber,String currentJobName) {
  def classBuild = new BuildClass(script:this)
  if (buildNumber % 2 == 0) {
    pipeline {
      agent any
      stages {
        stage('Even Stage') {
          steps {
             classBuild.EvenBuild(currentJobName,buildNumber)
          }
        }
      }
    }
  } else {
    pipeline {
      agent any
      stages {
        stage('Odd Stage') {
          steps {
            classBuild.OddBuild(currentJobName,buildNumber)
          }
        }
      }
    }
  }
}
  
