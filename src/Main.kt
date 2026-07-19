import kotlin.random.Random

fun main() {

    println("===================================")
    println("      Kotlin Password Generator")
    println("===================================")

    print("Enter password length: ")
    val length = readLine()?.toIntOrNull()

    if (length == null || length < 4) {
        println("\nPassword length must be at least 4.")
        return
    }

    print("Include uppercase letters? (y/n): ")
    val upper = readLine()?.trim()?.lowercase() == "y"

    print("Include lowercase letters? (y/n): ")
    val lower = readLine()?.trim()?.lowercase() == "y"

    print("Include numbers? (y/n): ")
    val numbers = readLine()?.trim()?.lowercase() == "y"

    print("Include symbols? (y/n): ")
    val symbols = readLine()?.trim()?.lowercase() == "y"

    val uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val lowercase = "abcdefghijklmnopqrstuvwxyz"
    val digits = "0123456789"
    val special = "!@#$%^&*()-_=+[]{}<>?/"

    var characters = ""

    if (upper) characters += uppercase
    if (lower) characters += lowercase
    if (numbers) characters += digits
    if (symbols) characters += special

    if (characters.isEmpty()) {
        println("\nYou must select at least one character type.")
        return
    }

    val password = StringBuilder()

    repeat(length) {
        password.append(characters.random())
    }

    println("\nGenerated Password:")
    println(password.toString())
}