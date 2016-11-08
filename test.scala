// match expression1
val status = 500
val message1 = status match {
	case 200 => "OK"
	case 404 => "Not Found"
	case 500 => "Internal Server Error"
	case 502 => "Bad Gateway"
	case _ => "Error"
}
println(message1)

// match expression2
val response: String = "I'm using Scala"
val message2 = response match{
	case data if data != null => println(s"Received '$data'")
	case data => println("Error! Received a null response")
}
println(message2)

// if-else expression
// val x = 15 
// val gx = if (x < 10) "Lesser" else "Greater"
// println(gx)

// while loop
var i = 0
val x = while (i < 5) { 
	println(i)
 	i = i + 1 
 }

 // comparing values of types unit
 // var line = ""
 // while ((line = readLine()) != null}) {
 // 	println("Read: " + line)
 // }

 // for-comprehensions
 // normal loop
 for (x <- 1 to 7) println( s"Day $x:" )
 // w/ yield (yield always returns vector type)
 for (x <- 1 to 7) yield ( s"Day $x:" )
 // nested loops 
 for (x <- 1 to 5; y <- 1 to 3) println( s"($x, $y)" )
 // iterator guards 
 val threes = for (x <- 1 to 30 if x % 3 == 0) yield x 
 // variable binding
 val powersof2 = for ( i <- 0 to 8; pow = 1 << i) yield pow 


 // methods and functions
 def sq( x: Int ) = { x * x }
 def area( r: Int ) = 3.14 * sq(r)

