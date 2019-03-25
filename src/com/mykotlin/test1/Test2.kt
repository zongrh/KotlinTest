package com.mykotlin.test1

//Kotlin 基本数据类型


//Kotlin 的基本数值类型包括 Byte、Short、Int、Long、Float、Double 等。不同于Java的是，字符不属于数值类型，是一个独立的数据类型。
//
//类型	位宽度
//Double	64
//Float	32
//Long	64
//Int	32
//Short	16
//Byte	8
//字面常量
//下面是所有类型的字面常量：
//
//十进制：123
//长整型以大写的 L 结尾：123L
//16 进制以 0x 开头：0x0F
//2 进制以 0b 开头：0b00001011
//注意：8进制不支持
//Kotlin 同时也支持传统符号表示的浮点数值：
//
//Doubles 默认写法: 123.5, 123.5e10
//Floats 使用 f 或者 F 后缀：123.5f
//你可以使用下划线使数字常量更易读：
//
//val oneMillion = 1_000_000
//val creditCardNumber = 1234_5678_9012_3456L
//val socialSecurityNumber = 999_99_9999L
//val hexBytes = 0xFF_EC_DE_5E
//val bytes = 0b11010010_01101001_10010100_10010010
//比较两个数字
//Kotlin 中没有基础数据类型，只有封装的数字类型，你每定义的一个变量，其实 Kotlin 帮你封装了一个对象，这样可以保证不会出现空指针。数字类型也一样，所有在比较两个数字的时候，就有比较数据大小和比较两个对象是否相同的区别了。
//
//在 Kotlin 中，三个等号 === 表示比较对象地址，两个 == 表示比较两个值大小。

fun main1(args: Array<String>) {
    val a: Int = 1000
    println(a === a) // true  ，值相等，对象地址相等

//    经过装箱，创建两个不同的对象
    val boxedA: Int? = a
    val anothterBoxedA: Int? = a

//    虽然经过了装箱，但是值时相等的，都是1000
    println(boxedA === anothterBoxedA) //false  值相等，对象地址不一样
    println(boxedA == anothterBoxedA)//true，值相等

}


//类型转换
//由于不同的表示方式，较小类型并不是较大类型的子类型，较小的类型不能隐式转换为较大的类型。
// 这意味着在不进行显式转换的情况下我们不能把 Byte 型值赋给一个 Int 变量。

//fun main3(args: Array<String>) {
////    val b:Int=1//OK字面值是静态检测的
////    val i: Int = b//错误
////    println(i)
//    val b:Byte=1// OK, 字面值是静态检测的
//    val i:Int=b.toInt()// OK
//    println(i)
////    toByte(): Byte
////    toShort(): Short
////    toInt(): Int
////    toLong(): Long
////    toFloat(): Float
////    toDouble(): Double
////    toChar(): Char
//
//}

// Char 必需是单引号 ' 包含起来的。比如普通字符 '0'，'a'。
//和 Java 不一样，Kotlin 中的 Char 不能直接和数字操作，
//字符
//位操作符
//对于Int和Long类型，还有一系列的位操作符可以使用，分别是：
//
//shl(bits) – 左移位 (Java’s <<)
//shr(bits) – 右移位 (Java’s >>)
//ushr(bits) – 无符号右移位 (Java’s >>>)
//and(bits) – 与
//or(bits) – 或
//xor(bits) – 异或
//inv() – 反向

//fun main(args: Array<String>) {
//    val a = arrayOf(1, 2, 3, 4)
//    val b = Array(3, { i -> (i * 2) })
//
////    读取数组内容
//    println(a[0])
//    println(b[1])
//
//}


//字符串
//和 Java 一样，String 是不可变的。方括号 [] 语法可以很方便的获取字符串中的某个字符，也可以通过 for 循环来遍历：
//
//for (c in str) {
//    println(c)
//}
//Kotlin 支持三个引号 """ 扩起来的字符串，支持多行字符串，比如：
//fun main(args: Array<String>) {
//    val text="""
//        多行字符串
//        多行字符
//    """.trimIndent()
//    println(text)
//}

//fun main(args: Array<String>) {
//    val text = """
//        |多行字符串
//        |长宽
//        |德玛西亚
//        |放逐之刃
//    """.trimMargin()
////    """.trimMargin(">")
//    println(text)//前置空格删除
//}

//字符串模板
//字符串可以包含模板表达式 ，即一些小段代码，会求值并把结果合并到字符串中。
// 模板表达式以美元符（$）开头，由一个简单的名字构成:
//fun main(args: Array<String>) {
//    val i=10
//    val s="i = $i"//求职结果  i = 10
//    println(s)
//}

//或者用花括号扩起来的任意表达式:
//fun main(args: Array<String>) {
//    val s = "runoob"
//    val str="$s.length is ${s.length}"
//    println(str)
//}

//原生字符串和转义字符串内部都支持模板。 如果你需要在原生字符串中表示字面值
//$ 字符（它不支持反斜杠转义），你可以用下列语法：
fun main(args: Array<String>) {
    val price = """
        ${'$'} 9.99
    """.trimIndent()
    println(price)
}













