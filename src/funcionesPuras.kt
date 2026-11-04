//fun nombreFuncionPura(parametros) : Retorno {cuerpo de la funcion y retorno} = operacion y retorno

fun sumarPura(a: Int, b: Int): Int{
    return a + b
}
fun sumarPura2(a: Int, b: Int):Int = a+b
 // calculo de un descuento
//imperativa
var descuento = 10
fun calcularPrecio(precio: Double) : Double = precio - (precio * descuento/100)
//funcional
fun calcularPrecioPuro(precio: Double, descuento: Double) : Double = precio - (precio * descuento/100)

//numero positivo imperativo
var numero = 8
fun esParImperativo(a: Int){
    if(numero > 0){
        println("El numero es positivo ")
    }
    else{
        println("El numero es negativo")
    }

}
fun esPositivoPuro(a: Int) : Boolean = numero > 0
//recibe dos numeros y devuelve el mayor imperativo
fun compararNumeroImperativos(a: Int, b: Int) : Int{
    if(a > b){
        println("El numero $a es mayor a $b")
        return a
    }else{
        println("El numero $b es mayor a $a")
        return b
    }
}
fun compararNumeroFuncional(a: Int, b: Int): Int {
    return if(a > b) a else b
}

//la nota se obtiene con tres calificaciones y su respectivo porcentaje examen 50, proyecto 30 y tareas 20
fun obtenerNotaPuro(examen:Double, proyecto:Double, tarea:Double): Double = (examen*0.5) + (proyecto*0.3) + (tarea*0.20)