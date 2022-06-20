package com.sharedLibraryTest

class Building_Maven{
  
  Script script
  
  def MavenCompile(){
    
    command = '''
    echo "WORKSPACE = ${WORKSPACE}"
    cd ${WORKSPACE}/Maven_Project_demo
    mvn compile
   '''
    script.echo("MavenCompile")
    output = bat(returnStdout: true, script: command)
    echo output
    
    

  }
  
  def MavenPackages(){
    script.echo("MavenPackages")
  }
  
  def RunJavaProject(){
    script.echo("RunJavaProject")
  }
  
def Maven(){
  MavenCompile()
  MavenPackages()
  RunJavaProject()
  
}
}
