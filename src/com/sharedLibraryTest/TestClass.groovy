package com.sharedLibraryTest
import hudson.model.*
def out = getBinding().out;


class TestClass {
    // Get the out variable
    
    def sayHi() {
       
       out.println "Hi from ClassTest!"
       
        
    }

    def sayHello(name) {
        print("Hello ${name}")
    }
}
