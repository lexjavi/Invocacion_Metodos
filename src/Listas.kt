class Listas {
    //LIsta de tipo inmutable


}
fun main(){
    val numeros1 = listOf<Int>(1,2,3,4,5)
    //lista de tipo mutable
    var numeros2 = mutableListOf<Int>(1,2,3,4,5)

    //operaciones
    //añadir un elemento
    numeros2.add(4)
    numeros2.add(5)

    //recorrer e imprimir
    //primera forma
    for(numero in numeros1){
        print(numero)
    }
    println()
    //segunda forma
    for(i in numeros2.indices){
        print(numeros2[i])
    }
    println()
    // tercera forma (la funcional y la que se debe usar)
    numeros2.forEach { print(it) }

    //eliminar
    //primera forma
    println()
    //quita el elemento específico,no la posicion
    numeros2.remove(2)
    numeros2.forEach { println(it) }
    //segunda forma
    //elimina la posicion
    println()
    numeros2.removeAt(0)
    numeros2.forEach { print(it) }

    numeros2.parallelStream().forEach { print(it) }
    println()
    //buscar
    println(numeros2[2])
    println(numeros2.get(2))
}