package code.with.me.kotlin.basics

/**
 *
 * @author andong@xiaomalixing.com
 */

// Create DTOs (POJOs/POCOs)
//data class Customer(val name: String, val email: String)
//
//
//// Default values for function parameters
//fun foo(a: Int = 0, b: String = "") {
//    println("a = $a, b = $b")
//}

fun main() {
    // Filter a list
//    println(listOf(-1, 1, 2, 3).filter { it > 0 })

    // email list
//    val emails = listOf("john@example.com", "frank@example.com")
//    println("john@example.com" in emails) // true
//    println("jack@exmaple.com" in emails) // false

    // String interpolation
//    val name = "John"
//    println("Name $name")

    // Instance checks
//    when (val animal: Animal = Dog()) {
//        is Dog -> animal.eat()
//        is Cat -> animal.eat()
//        else -> println("Unknown animal")
//    }

    // Read only list
//    val list = listOf("a", "b", "c")
//    println(list)

    // Read only map
//    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
//    println(map) // {a=1, b=2, c=3}
//    println(map["a"]) // 1
//    No set method providing array access, can't change the value
//    map["a"] = 4

    //Traverse a map or a list of pairs
//    for ((k, v) in map) {
//        println("$k -> $v")
//    }

//    for (i in 1..100) {
//        println(i)
//    } // closed range [1, 100]

//    for (i in 1 until 100) {
//        println(i)
//    } // half-open range [1, 100

//    for (x in 2..10 step 2) {
//        println(x)
//    } // 2, 4, 6, 8, 10

//    for (x in 10 downTo 1) {
//        println(x)
//    } // 10, 9, 8, 7, 6, 5, 4, 3, 2, 1


    //Iterate over a range
//    (1..10).forEach { println(it) }
}

//interface Animal {
//    fun eat()
//}
//
//class Dog : Animal {
//    override fun eat() {
//        println("Dog eat")
//    }
//}
//
//class Cat : Animal {
//    override fun eat() {
//        println("Cat eat")
//    }
//}
