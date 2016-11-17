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
