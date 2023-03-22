package code.with.me.kotlin

import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

/**
 *
 * @author andong@xiaomalixing.com
 */

@Serializable
data class Person(val name: String, val age: Int)

fun main() {
    // Serialize a data class
    val json = Json.encodeToString(Person("Alice", 29))
    println(json)

    // Deserialize a data class
    val person = Json.decodeFromString<Person>(json)
    println(person)
}