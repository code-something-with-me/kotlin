package code.with.me.kotlin.basics

/**
 *
 * @author andong@xiaomalixing.com
 */

fun main() {

//    val sum = sum(1, 2)
//    println(sum)

//    printSum(1, 2)

//    val div = div(1, 1)
//    println(div)


}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun div(a: Int, b: Int) = a / b