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
}