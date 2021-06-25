package com.sharedLibraryTest
import hudson.model.*



class TestClass {
    // Get the out variable
    
    def sayHi() {
       def out = getBinding().out;
       out.println "Hi from ClassTest!"
       
        
    }

    def sayHello(name) {
        print("Hello ${name}")
    }
}
