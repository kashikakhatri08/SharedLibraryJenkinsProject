package com.sharedLibraryTest

class TestClass {
    def sayHi() {
        dsl.echo "Hi from ClassTest!"
        
    }

    def sayHello(name) {
        print("Hello ${name}")
    }
}
