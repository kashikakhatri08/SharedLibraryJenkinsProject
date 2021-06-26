package com.sharedLibraryTest

class TestClass implements Serializable {
    // Get the out variable
    Script script;
    def sayHi() {
        
       script.echo("Hi from ClassTest!")
       
        
    }

    def sayHello(name) {
        script.echo("Hello ${name}")
    }
}
