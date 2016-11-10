// first class function
def sq( x: Int ) = { x*x }
println(sq(2))


// anonymous functions
(x: Int) => x + 1


// function with multiple parameters
val seq = (x:Int, y:Int) => { (x to y).mkString("-") }
println(seq(1,7))


// function with no parameters
val fileSeq = () => {System.getProperty("file.separator")}


// higher-order funcions
def toLower(args: String*) = {
	args.map( arg => arg.toLowerCase )
}
val lower = toLower("Dash", "THOMAS", "JAmes", "percy")
println(lower)


// placeholder syntax i
val someNumbers = List(-20,-15,-5,0,5,10)
// someNumbers.filter(x => x>0)
someNumbers.filter(_ > 0)
println(someNumbers)


// placeholder syntax ii
val x = (_: Int) + (_: Int)


// partial application of functions i
someNumbers.foreach(println _)


// partial application of functions ii
def sum(a: Int, b: Int, c: Int) = a+b+c
val a = sum _
println(a(40,50,10))
val b = sum(1, 2, _: Int)
println(b(7))


// procedures
def box(s: String) {
	val border = "-" *s.length + "--\n"
	println(border + "|" + s + "|\n" + border)
}
box("hello")


// return higher value
val max = (a:Int, b:Int) => {
	if (a>b) a
	else b
}
println(max(10, 15))


// strings
val palindrome = "A man, a plan, a canal, Panama"
val len = palindrome.length()
println(len)
val str1 = "Hello"
val str2 = "World"
println("Concatenated string " + str1 + str2)
println(palindrome.split(","))


// string interpolation
val num = 20
println(s"The value of x is $num")


// regular expressions
val address = "123 Main Street Suite 101"
var numPattern = "[0-9]+".r
val match1 = numPattern.findFirstIn(address)
println(match1)
val matches = numPattern.findAllIn(address)
matches.foreach(println)


// exercise 
val palindrome2 = "A man, a plan, 1221, a canal, Panama"
println(palindrome2.charAt(5))
println(palindrome2.indexOf("P"))
println(palindrome2.split("plan"))
println(palindrome2.substring(palindrome2.indexOf("Panama")))
val match2 = numPattern.findFirstIn(palindrome2)
println(match2)


// tuples
val t = (4,3,2,1)
val sum2 = t._1 + t._2 + t._3 + t._4
println( "Sum of elements: "  + sum2 )


// exercise
def distance(src: (Int, Int), dest: (Int, Int)): Double = {
	Math.sqrt(sq(src._1 - dest._1) + sq(src._2 - dest._2))
}
println(distance((1,1),(2,2)))

