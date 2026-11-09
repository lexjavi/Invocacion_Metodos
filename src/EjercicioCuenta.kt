//Data class: una clase con datos, para almacenar transformar y comparar informacion
//Todo esto es funcional
data class Cuenta(
    val saldo: Double
){


}
fun depositar(cuenta: Cuenta, valor: Double ): Cuenta {
    return cuenta.copy(saldo = valor + cuenta.saldo)
}
fun retirar(cuenta: Cuenta, valor: Double) : Cuenta = cuenta.copy(saldo = cuenta.saldo - valor)
 // jugador nombre vidas(5) y puntos
//simular ataque(pierde una vida), obtiene recompensa(recupera una vida)
 data class Jugador(val nombre: String, val vidas: Int, val recompensa: Int){
 }
fun recuperarVida(jugador: Jugador): Jugador = jugador.copy(vidas = jugador.vidas + 1)
fun atacarJugador(jugador: Jugador): Jugador = jugador.copy(vidas = jugador.vidas - 1)
fun obtenerRecompensa(jugador: Jugador): Jugador = jugador.copy( recompensa= jugador.recompensa + 100)
fun main(){
    /*val cuenta = Cuenta(10000.00)
    val cuenta1 = depositar(cuenta, 5000.00)
    val cuenta2 = retirar(cuenta1, 25000.00)
    val cuenta3 = depositar(cuenta2, 50000.00)
    println(cuenta)
    println(cuenta1)
    println(cuenta2)
    println(cuenta3)*/
    val jugadorInicial = Jugador("Alex",5,100)
    println(jugadorInicial)
    val jugador1 = atacarJugador(jugadorInicial)
    println(jugador1)
    val jugador2 = obtenerRecompensa(jugador1)
    println(jugador2)
    val jugador3 = recuperarVida(jugador2)
    println(jugador3)

}