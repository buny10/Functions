//TIP Press <shortcut raw="SHIFT"/> twice to open the Search Everywhere dialog and type <b>show whitespaces</b>,
// then press <shortcut raw="ENTER"/>. You can now see whitespace characters in your code.
fun main() {
    sayHelo( "Hulash", 22)

    val hasInternetConnection = true
    if (hasInternetConnection) {
        getData("Some data is true")
    }else {
        showMessage()

    }

}

fun sayHelo(name: String, age: Int) {
    var number = age
    println("hello, $name! Your age is $age")
}

fun getData(data: String) {
    println("Your data is : $data")
}

fun showMessage(){
    println("there is no data")
}