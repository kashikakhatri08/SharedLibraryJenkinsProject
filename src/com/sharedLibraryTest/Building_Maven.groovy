package com.sharedLibraryTest

class Building_Maven{
  
  Script script
  
  def MavenCompile(){
    script.echo("MavenCompile")
    command = '''#!/bin/bash -ex
    source ${DEVENV}
    echo "WORKSPACE = ${WORKSPACE}"
    cd ${WORKSPACE}/Maven_Project_demo
    mvn compile
   '''
    output = sh(returnStdout: true, script: command)
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
