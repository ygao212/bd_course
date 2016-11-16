// Array
val z1 = new Array[String] (3)
println(z1)
val z2 = Array("apple", "banana", "cherry")
println(z2)
println(z2(1))
z2(1) = "zucchini"
println(z2(1))

val myList1 = Range(10, 20, 2)
// Print all the array elements
for ( x <- myList1 ) {
	println( " " + x )
}


// List
val pets = List("cat", "dog", "iguana")
println(pets.head)
println(pets.tail)
println(pets(1))


// Higher Order Functions
// map takes a function and applies it to every member of collection
// reduce shrinks a list down to a single value
val petsizes = pets.map((p:String) => p.size)
println(petsizes)

val numbers = List(6,2,7,9)
numbers.foreach((p: Int) => println(p))
val total = numbers.reduce((a: Int, b: Int) => a + b)
println(total)


// Examples
val upperCasePets = List("cat","dog","iguana").map(
	_.toUpperCase)
println(upperCasePets)
val numbers2 = List(4,9,6,2)
val maxnum = numbers2.max
println(maxnum)
println(numbers2.sum)
println(numbers2.contains(4))


// More functions
println(1 :: 2 :: Nil)
val newli = List(6,2,7,9)
println(newli.filter(_>6))
println(newli.sortWith(_ < _))
println(newli.reverse)
println(newli.take(2))
println(newli.zip(List("a","b","c","d")))


// Flattening a list
var newli2 = List(List(1,2), List(3), List(), List(4,5))
println(newli2.flatten)


// Zipping and unzipping
val zipped = newli.zip(List("a","b","c","d"))
println(zipped)
val zippedwithindex = List("a","b","c","d").zipWithIndex
println(zippedwithindex)
println(zipped.unzip)


// Displaing lists as strings
println(newli.toString)
println(newli mkString ("{","-","}"))


// Using Map and FlatMap
println(pets.map(_.toList.reverse.mkString))
println(pets.map(_.toList))
println(pets.flatMap(_.toList))


// Folding lists 
val x = List(1,2,3)
println(x.foldLeft(10)(_+_))
println(x.foldRight(10)(_+_))


// Exercise
for (i <- 0 to 9; j = i * 2 + 1) println(j)
println((0 to 20).filter(_ % 2 == 1))
println((0 to 9).map(_ * 2 + 1))

// Set 
val unique = Set(6,2,7,6,7,9)
println(unique)
println(unique.size)
println(unique.contains(3))
println(unique + 5)
println(unique - 2)
println(unique.empty)


// Map
val colorMap = Map("red" -> 0xFF0000, "green" -> 0xFF00, "blue" -> 0xFF)
println(colorMap)
for (pairs <- colorMap) { println(pairs) }
println(colorMap.keys)
println(colorMap.values)
println(colorMap.isEmpty)
println(colorMap + ("purple" -> 0xFFFF00))
colorMap.keys.foreach{ i => 
	print ( "Key = " + i)
	println(" Value = " + colorMap(i) )}
if ( colorMap.contains{ "red" }) {
	println("Red key exists with value :" +
		colorMap("red")) 
} else {
	println("Red key does not exist")
}


// Exercise
import scala.collection.mutable
val sampleText = "Scala is a general-purpose programming language. Scala has full support for functional programming and a strong static type system. Designed to be concise, many of Scala's design decisions were inspired by criticism of Java's shortcomings.  Scala source code is intended to be compiled to Java bytecode, so that the resulting executable code runs on a Java virtual machine. Java libraries may be used directly in Scala code and vice versa (language interoperability). Like Java, Scala is object-oriented, and uses a curly-brace syntax reminiscent of the C programming language. Unlike Java, Scala has many features of functional programming languages like Scheme, Standard ML and Haskell, including currying, type inference, immutability, lazy evaluation, and pattern matching. It also has an advanced type system supporting algebraic data types, covariance and contravariance, higher-order types (but not higher-rank types), and anonymous types. Other features of Scala not present in Java include operator overloading, optional parameters, named parameters, raw strings, and no checked exceptions.  The name Scala is a portmanteau of scalable and language, signifying that it is designed to grow with the demands of its users."
def countWords(text: String) = {
    val counts = mutable.Map.empty[String, Int]
    for (rawWord <- text.split("[ ,!.]+")) {
    	if ( counts.contains{ rawWord } ) {
    	   counts(rawWord) = counts(rawWord) + 1
    		} 
    	else {
    	   counts += (rawWord -> 1)
    		}
    }
    println(counts)
}
countWords(sampleText)



