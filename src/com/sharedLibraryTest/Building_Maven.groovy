package com.sharedLibraryTest

class Building_Maven{
  
  Script script
  
  def MavenCompile(){
     script.echo("MavenCompile")
    script.echo("${script.WORKSPACE}")
   script.bat(returnStdout: true, script: """#!/bin/bash -e cd ${script.WORKSPACE}/Maven_Project_demo""")
    
    
   
    
  
    
    

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
