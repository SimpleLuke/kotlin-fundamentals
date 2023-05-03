fun main(args: Array<String>) {
    println("Hello World!")

    //Define a String message and assign the reversed version of it to a new value.
    val message: String = "hello"
    val reversedMessage: String = message.reversed()
    println(message)
    println(reversedMessage)

    //The following code doesn't work - why? Modify it so it runs.
    // val aNumber = 2
    // aNumber = 4

    var aNumber = 2
    aNumber = 4
    println(aNumber)

    //The following code doesn't work - why? Modify it so it runs.
    // val numbers: List<Number> = listOf(3, 4, null)
    val numbers: List<Number?> = listOf(3,4,null)
    println(numbers)

    //The following code doesn't work - why? Modify it so it runs.
    //val otherNames: List<String?> = listOf("Kat", "Marc", null)

    // Loop on each name in the list
    //    for (name in otherNames) {
    //        // Print the length
    //        println(otherNames.length)
    //    }

    val otherNames: List<String?> = listOf("Kat","Marc",null)

    for (name in otherNames){
        if (name != null) {
            println(name.length)
        }
    }






    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}