// Example
// User is a class 
// Thomas is an object
// name is a parameter(field)(property)(attribute)
// greet is a parameter(field)(property)(attribute)
// toString is a method
class User (val name: String) {
	val greet: String = s"Hello from $name"
	override def toString = s"User($name)"
}
val u = new User("Thomas")
println(u)
println(toString)
println(u.name)
println(u.greet)
println(u.toString)
println(" ")

// Privacy control
class Time(val hour: Int, val minute: Int){
	val divHours: Int = minute/60
	var m = minute % 60
	var h = (hour+divHours)
	override def toString = s"$h: $m"
}
val t = new Time(59, 1000)
println(t.m)
println(t.toString)
println(" ")

// class Time (val hour: Int, val minute: Int) {  
//   private val divHours: Int = minute/60
//   private val m = minute % 60
//   private var h = (hour+divHours)   
//   override def toString = s"$h:$m"
// }
// val t = new Time(59, 1000)
// // println(t.m) would throw an error
// println(t.toString)
// println(" ")


// Inheritance
class Train {
	def hi = "I am a train"
	override def toString = getClass.getName
}
class Thomas extends Train
class SteamThomas extends Thomas {
	override def hi = super.hi + ", and I have a steam engine"
}
println(new Train().hi)
println(new Thomas().hi)
println(new SteamThomas().hi)
println(" ")


// Exercise
import math.Pi
class Shape {
	def area = 0.0
	override def toString = area.toString
}
class Rectangle (val width: Double, val height: Double) extends Shape {
	override def area: Double = width * height
	override def toString = "I'm a rectangle and my area is " + super.toString
}
class Circle (val radius: Double) extends Shape {
	override def area: Double = radius*radius*Pi
	override def toString = "I'm a circle and my area is " + super.toString
}
println(new Rectangle(5, 10).area)
println(new Rectangle(5, 10).toString)
println(new Circle(2).area)
println(new Circle(2).toString)
println(" ")


// Apply method
val f = (x:Int) => x + 1
println(f)
println(f(2))
println(f.apply(2))

object funObj {
	var y = 5
	def apply(x: Int) = x + y
}
println(funObj(2))
println(" ")


// Exercise
class Rational(n: Int, d: Int) {
	require(d != 0)
	val numer: Int = n
	var denom: Int = d

	override def toString = numer + "/" + denom
	def add(that: Rational): Rational =
	new Rational(
		numer * that.denom + that.numer * denom,
		denom * that.denom
		)
	def sub(that: Rational): Rational = 
	new Rational(
		numer * that.denom - that.numer * denom,
		denom * that.denom
		)
}
val a = new Rational(2,3)
val b = new Rational(4,5)
println(a)
println(b)
println(a.add(b))
println(a.sub(b))


// Command line application
object Cat {
	
}














