package com.mykotlin.test1

//Kotlin 接口
//Kotlin 接口与 Java 8 类似，使用 interface 关键字定义接口，
//允许方法有默认实现：
//interface MyInterFace {
//    fun bar() //    未实现
//    fun foo() { //    已实现
//        println("foo")//    可选的方法体
//    }
//}
//
////实现接口
////一个类或者对象可以实现一个或者多个接口
//class Child : MyInterFace {
//    override fun bar() {
////        方法体
//        println("bar")
//    }
//}
//
//fun main(args: Array<String>) {
//    val c=Child()
//    c.foo()
//    c.bar()
//}


//接口中的属性
//接口中的属性只能是抽象的，不允许初始化值，接口不会保存属性值，实现接口时，必须重写属性

//interface MyInterface {
//    var name: String //name 属性，抽象的
//}
//
//class Child : MyInterface {
//    override var name: String = "runoob"//重写属性
//}

//interface MyInterface {
//    //    name 属性，抽象的
//    var name: String
//
//    fun bar()
//    fun foo() {
////        可选的方法体
//        println("foo")
//    }
//}
//
//class Child : MyInterface {
//    override var name: String = "runoob"
//    override fun bar() {
//        println("bar")
//    }
//}
//
//fun main(args: Array<String>) {
//    val c = Child()
//    c.foo()
//    c.bar()
//    println(c.name)
//}


////函数重写
////实现多个接口时，可能会遇到同一种方法继承多个实现的问题。
//interface A {
//    fun foo() {
//        print("A")//已实现
//    }
//
//    fun bar()//未实现，没有方法体，是抽象的
//}
//
//interface B {
//    fun foo() {
//        print("B")//已实现
//    }
//
//    fun bar() {
//        print("bar")//已实现
//    }
//}
//
//class C : A {
//    override fun bar() {
//        print("bar")//重写
//    }
//
//}
//
//class D : A, B {
//    override fun foo() {
//        super<A>.foo()
//        super<B>.foo()
//    }
//
//    override fun bar() {
//        super.bar()
//    }
//}
//
//fun main(args: Array<String>) {
//    val d = D()
//    d.foo()
//    d.bar()
//}





































