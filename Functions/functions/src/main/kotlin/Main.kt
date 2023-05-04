fun main(args: Array<String>) {
//    Write a method called superify which takes a string and adds the word "super" to the start. So given 'woman' it returns 'superwoman', given 'dog' it returns 'superdog'.
//    Then use it to create the ultimate feline superhero, like this:
//    println(superify(superify(superify(superify("cat")))))
//     Should print:
//    "supersupersupersupercat"

    fun superify(word: String):String{
        return "super$word"
    }
    println(superify(superify(superify(superify("cat")))))

//    Define a function revealSecret which takes a passcode in argument, and returns a secret string "The cookies are in the desk drawer" only if the given passcode is the string "HUNGRY".
//    If the given passcode is something else, the function should return null.
//    (What should be the return value type of this function?)
//    val secret = revealSecret("HUNGRY")
//    println(secret) // "The cookies are in the desk drawer"
//    val secret = revealSecret("Hi")
//    println(secret) // null

    fun revealSecret(passcode: String):String?{
        if (passcode==="HUNGRY"){
            return "The cookies are in the desk drawer"
        }
        return null
    }

    val secret1 = revealSecret("HUNGRY")
    println(secret1) // "The cookies are in the desk drawer"
    val secret2 = revealSecret("Hi")
    println(secret2) // null
}