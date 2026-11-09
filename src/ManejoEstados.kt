//Manejo de estados
fun incrementador(contador: Int): Int = contador + 1

fun main(){
    val contador = 5
    val estado1 = incrementador(contador)
    val estado2 = incrementador(estado1)
    val estado3 = incrementador(estado2)
    val estado4 = incrementador(estado3)
    println(estado4)
    //siguiente estado = f(estadoActual)
}