package arnav.CoffeeMachine
data class coffeeDetails(val sugarCount: Int,val Name: String,val size:String,val cream:String,val milk:String){//constructor

}
fun main(){
    //println("What is your name?")
    //val Name= readln()
    //println("how much sugar do you want ")
    //val sugarCount:Int= readln().toInt()

    //makeCoffee(Name,sugarCount)//called a function makeCoffee
    val coffeeforArnav=coffeeDetails(sugarCount=0, Name = "ARNAV", size = "XL", cream = "NONE", milk = "NORMAL")
    makeCoffee(coffeeforArnav)
}
fun makeCoffee(coffeDetails: coffeeDetails) {
    println("${coffeDetails.Name} took ${coffeDetails.sugarCount}  cube of Sugar of ${coffeDetails.size} size with ${coffeDetails.milk} milk in their coffee")
    println("Which coffee you want")
    val button = readln()
    println("What kind of beans you want?")
    val beans = readln()
    println("What kind of milk you want?")
    var milk = readln()
    when (button) {
        "Americano" -> println("OK! now  your Americano is brewed")
        "Cappuccino" -> println("OK! now your cappuccino is brewed ")
        else -> {
            println("Sorry we do not have that right now")
        }

    }
    when (beans) {
        "Roasted" -> println("OK! Roasted Beans are selected")
        "Classic" -> println("OK! Classic Beans are selected")
    }
    when (milk) {
        "Almond" -> println("OK! Almond milk has been selected ")
        "Soy" -> println("OK! Soy milk has been selected")
        "Normal" -> println("OK! Normal milk has been selected")
    }
    if (coffeDetails.sugarCount == 0) {
        println(println("$button with $beans beans and ${coffeDetails.milk} milk for ${coffeDetails.Name} with 0 sugar of ${coffeDetails.size} size with ${coffeDetails.milk} milk is now ready!!!"))
    }
}


