package object_oriented_things

fun main(){

    val display = Display("University of Calcutta")
    display.show()
}
class Display(var name : String){

    fun show() = println(name)
}