package com.mykotlin.test1

import javax.naming.Context
import javax.print.attribute.AttributeSet

//Kotlin 继承
//Kotlin 中所有类都继承该 Any 类，它是所有类的超类，对于没有超类型声明的类是默认超类：

//class Example // 从 Any 隐式继承

//Any 默认提供了三个函数：
//equals()
//hashCode()
//toString()
//注意：Any 不是 java.lang.Object。
//如果一个类要被继承，可以使用 open 关键字进行修饰。

//open class Base(p: Int) //定义基类
//class Derived(p: Int) : Base(p) {
//
//}

//构造函数
//子类有主要构造函数
//如果子类有主构造函数，则基类必须在主构造函数中立即初始化。
//open class Person(var name: String, var age: Int){//基类
//
//}
//class Student(name: String,age: Int,var no:String,var score:Int):Person(name, age){
//
//}
//
//fun main(args: Array<String>) {
//    var s = Student("runoob", 17, "1900", 79)
//    println("学生名：${s.name}")
//    println("年龄：${s.age}")
//    println("学生号：${s.no}")
//    println("成绩：${s.score}")
//
//}

//子类没有主构造函数
//如果子类没有主构造函数，则必须在每一个二级构造函数中用super，关键字初始化基类
//或者在代理另一个构造函数。初始化基类时，可以调用基类的不同构造方法。
//class Student : Person {
//
//    constructor(ctx: Context) : super(ctx) {
//    }
//
//    constructor(ctx: Context, attrs: AttributeSet) : super(ctx,attrs) {
//    }
//}
//实例
/**
 * 用户基类
 */
//open class Person(name: String) {
//    //    次级构造函数
//    constructor(name: String, age: Int) : this(name) {
////    初始化
//        println("------基类次级构造函数------")
//    }
//
//}
//class Student:Person{
//    constructor(name: String,age: Int,no:String,score:Int):super(name, age){
//        println("-----继承类次级构造函数-----")
//        println("学生名：${name}")
//        println("学生名：$name")
//        println("年龄：${age}")
//        println("学号：${no}")
//        println("成绩：${score}")
//    }
//}
//
//fun main(args: Array<String>) {
//    var s=Student("Runoob",17,"210975",87)
//}
//------基类次级构造函数------
//-----继承类次级构造函数-----
//学生名：Runoob
//学生名：Runoob
//年龄：17
//学号：210975
//成绩：87

//重写
//在基类中，使用fun声明函数时，此函数默认final修饰，不能被子类重写。
//如果允许被子类重写该函数，那么久要动手添加open修饰它，子类重写方法使用override关键字

//用户基类
//open class Person {
//    open fun study() {//open修饰，允许子类重写
//        println("我毕业了.....")
//    }
//}
//
////子类继承 Person类
//class Student : Person() {
//    override fun study() {//重写方法
//        println("我在读大学")
//    }
//}
//
//fun main(args: Array<String>) {
//    val s=Student()
//    s.study()
//}

//如果有多个相同方法（继承或者实现自其它类，如A、B类），
//则必须要重写该方法，使用super范型去选择性的调用父类的实现。

//open class A {
//    open fun f() {
//        println("A")
//    }
//
//    fun a() {
//        println("a")
//    }
//}
//
//interface B {
//    fun f() { //接口的成员变量默认是open的
//        println("B")
//    }
//
//    fun b() {
//        println("b")
//    }
//}
//
//class C() : A(), B {
//    override fun f() {
//        super<A>.f()//调用A.f()
//        super<B>.f()//调用B.f()
//    }
//
//    override fun b() {
//        super.b()
//    }
//}
////C继承自a()或者b(),C不仅可以从A或者B中继承函数，而且可以继承A(),B()中共有的函数，
//// 此时该函数在中只有一个实现 ，为了消除歧义，该函数必须调用A()或者B()中该函数的实现，并提供自己的实现
//fun main(args: Array<String>) {
//    val c=C()
//    c.f()
//    c.b()
//}


//属性重写
//属性重写使用Override关键字，属性必须具有兼容类型，每一个声明的属性都可以通过初始化程序或者getter方法被重写
//open class Foo{
//    open val x:Int get{
//        .....
//    }
//}
//class Bar1:Foo(){
//    override val x:Int=....
//}

//你可以用一个var属性重写一个val属性，但是反过来不行。
// 因为val属性本身定义了getter方法，重写var属性会在衍生类中额外声明一个setter方法
//你可以在主构造函数中使用override关键字作为属性声明的一部分

interface Foo {
    val count: Int
}

class Bar1(override val count: Int) : Foo
class Bar2 : Foo {
    override var count: Int = 0
}





