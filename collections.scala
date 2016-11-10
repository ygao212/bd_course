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