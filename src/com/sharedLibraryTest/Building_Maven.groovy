package com.sharedLibraryTest

class Building_Maven{
  
  Script script
  
  def MavenCompile(){
     script.echo("MavenCompile")
     def command =''' #!/bin/bash -ex
     echo "WORKSPACE = ${script.WORKSPACE}""
      cd ${script.WORKSPACE}/Maven_Project_demo
      mvn compile
        '''
    bat label: '', script: command
    
    
   
    
  
    
    

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
