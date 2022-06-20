package com.sharedLibraryTest

class Building_Maven{
  
  Script script
  
  def MavenCompile(){
     script.echo("MavenCompile")
    sh """#!/bin/bash -ex
     echo "WORKSPACE = ${env.WORKSPACE}"
      cd "${env.WORKSPACE}/Maven_Project_demo"
      mvn compile
        """
    
   
    
  
    
    

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
