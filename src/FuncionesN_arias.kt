//funcion binaria
fun calcularMCD(a: Int,b:Int): Int {
    var x = a
    var y = b
    while(y != 0){
        var residuo = x % y
        x = y
        x = residuo
    }
    return x
}
// se puede usar librerias como math y pow
//desarrollar una funcióon que reciba los coeficientes a b y c de una ecuacion cuadratica, la funcion debe calcularel discriminate b2 - 4ac si tiene soluciones reales diferentes, si tiene una solucion real doble o no tiene soluciones en los reales
fun determinarCuadratica(a: Int, b:Int, c:Int): String {
    val discriminante = (b*b) - 4*a*c
    if(discriminante > 0){
        return "El valor del discrimante es $discriminante y tiene varias soluciones"
    }else if(discriminante < 0){
        return "El valor del discrimante es $discriminante y no tiene solucion en los reales"
    }else{
        return "El valor del discrimante es $discriminante y tiene solucion real doble"
    }
}
//hallar la funcion de punto medio

fun hallarPuntoMedio(punto1x: Double,punto1y:Double,punto2x: Double,punto2y:Double ):List<Double>{
    val mx = (punto1x + punto2x) / 2
    val my = (punto1y + punto2y) / 2
    return listOf(mx,my) // usar pair aquí

}

fun main(){
//1 -5 6
    val cuadrantes = determinarCuadratica(1,-5,6)
    println(cuadrantes)
    val puntoMedio = hallarPuntoMedio(-1.0,-1.0,0.0,0.1)
    println(puntoMedio)
}