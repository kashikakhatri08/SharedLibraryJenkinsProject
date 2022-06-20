package com.sharedLibraryTest

class Building_Maven{
  
  Script script
  
  def MavenCompile(){
    script.echo("MavenCompile")
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