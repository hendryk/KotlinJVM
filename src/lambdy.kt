fun main(){
    println("Posadzili Bace")
    println(najstarszy)
    println(names)
}

data class Person(val imie: String, val wiek:Int)

val people = listOf(Person("Alicja", 29), Person("Bartek", 31))
val najstarszy = people.maxBy { it.wiek }
val names = people.joinToString { it.imie }
