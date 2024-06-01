package arnav.CoffeeMachine
fun main(){
    println("What is your name?")
    val Name= readln()
    println("how much sugar do you want ")
    val sugarCount:Int= readln().toInt()

    makeCoffee(Name,sugarCount)//called a function makeCoffee

}
fun makeCoffee(Name:String,sugarCount :Int){
    println("$Name took $sugarCount cube of Sugar in their coffee")
    println("Which coffee you want")
    val button= readln()
    println("What kind of beans you want?")
    val beans= readln()
    println("What kind of milk you want?")
    var milk= readln()
    when(button) {
        "Americano" -> println("OK! now  your Americano is brewed")
        "Cappuccino" -> println("OK! now your cappuccino is brewed ")
        else->{
            println("Sorry we do not have that right now")
        }

    }
    when(beans){
        "Roasted"-> println("OK! Roasted Beans are selected")
        "Classic"-> println("OK! Classic Beans are selected")
    }
    when(milk){
        "Almond"-> println("OK! Almond milk has been selected ")
        "Soy"-> println("OK! Soy milk has been selected")
        "Normal"-> println("OK! Normal milk has been selected")
    }
    if(sugarCount==0){
        println( println("$button with $beans beans and $milk milk for $Name with 0 sugar is now ready!!!"))
    }
    else{
    println("$button with $beans beans and $milk milk for $Name with $sugarCount cube of sugar is now ready!!!")
    }}

