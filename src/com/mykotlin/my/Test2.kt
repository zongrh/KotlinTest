package com.mykotlin.my

class Greeter(val name: String){
    fun greet(){
        println("Hello , $name")
    }
}

fun main(args: Array<String>) {
    Greeter("World").greet()
}
