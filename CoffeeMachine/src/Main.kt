package arnav.CoffeMachine
fun main(){
makeCoffee()//called a function makecoffee

}
fun makeCoffee(){
    println("what is your name?")
    var askName= readln()
    println("Which coffee you want")
    val button= readln()
    println("What kind of beans you want?")
    val beans= readln()
    println("What kind of milk you want?")
    var milk= readln()
    when(beans){
        "Roasted"-> println("OK! Roasted Beans are selected")
        "Classic"-> println("OK! Classic Beans are selected")
    }
    when(milk){
        "Almond"-> println("OK! Almond milk has been selected ")
        "Soy"-> println("OK! Soy milk has been selected")
        "Normal"-> println("OK! Normal milk has been selected")
    }
    when(button) {
        "Americano" -> println("OK! now  your Americano is brewed")
        "Cappuccino" -> println("OK! now your cappuccino is brewed ")

    }}

