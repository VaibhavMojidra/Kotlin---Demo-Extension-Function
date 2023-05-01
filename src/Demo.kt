//Kotlin extensions provide the ability to extend a class with new functionality without implementing the inheritance concept by a class or using design pattern such as Decorator. These extensions basically add some functionality in an existing class without extending the class.
//In Kotlin, an extension function is a function that can be called as a member function of a class, but is defined outside the class. Extension functions are a powerful feature of Kotlin that allow you to add new functionality to existing classes without having to modify their source code.

class Student(var name: String, var age: Int) {
	fun printName() {
		println("Name: $name")
	}
}


fun main(args: Array<String>) {
	var student=Student("Vaibhav Mojidra",23)
	student.printName()
	println(student.isAdult())
}

fun Student.isAdult()=if(age>=18){"is an Adult"}else{"is not an Adult"}
