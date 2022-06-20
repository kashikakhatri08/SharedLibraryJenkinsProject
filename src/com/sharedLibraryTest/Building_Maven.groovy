package com.sharedLibraryTest

class Building_Maven{
  
  Script script
  
  def MavenCompile(){
     script.echo("MavenCompile")
    script.echo("${script.WORKSPACE}")
   def command = .bat(returnStdout: true, script: """cd ${script.WORKSPACE}/jenkins-control
   mvn compile
   """)
    script.echo(command)
    
    
   
    
  
    
    

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
