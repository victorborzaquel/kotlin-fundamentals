package examples.lambdas

data class Student(val name: String, var age: Int) {

}

fun getStudents(): List<Student> {
    return listOf(
        Student("John", 20),
        Student("Jane", 21),
        Student("Joe", 22)
    )
}