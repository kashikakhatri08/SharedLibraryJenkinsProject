package com.sharedLibraryTest

class TestClass implements Serializable {
    
    Script script;
    
    def sayHi() {
       script.echo("Hi from ClassTest!")  
    }

    def sayHello(name) {
        script.echo("Hello ${name}")
    }
}
