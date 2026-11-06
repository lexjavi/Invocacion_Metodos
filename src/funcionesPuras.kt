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

//Duplicar elementos de una lista
fun duplicarLista(lista:List<Int>): List<Int>{
    return lista.map { it*2 } //map transforma los elementos de mi lista gracias a la función lambda dentro de las llasves

}
fun duplicarLista1(lista:List<Int>): List<Int> = lista.map{it*2}
fun filtrarPares(lista: List<Int>): List<Int> = lista.filter { it % 2 == 0 }
fun sumarElementos(lista: List<Int>): Int = lista.sum()
fun calcularPromedio(lista: List<Int>): Double = lista.average()
fun sacarMayor(lista: List<Int>): Int = lista.max()
fun sacarMinimo(lista: List<Int>): Int = lista.min()
 //determinar el cubo de un numero
// encontrar los impares de una lista
//utilizar las dos funciones
fun determinarCuadrado(numero: Int): Int = numero * numero
fun esImpar(numero: Int): Boolean = numero % 2 == 1
fun esPar(numero: Int): Boolean = numero % 2 == 0
fun procesar(lista: List<Int>): List<Int> = lista.map{determinarCuadrado(it)}.filter { esImpar(it) }
//rtransformar temperaturas a un string
fun transformarTemperatura(temperatura: List<Int>): List<String>{
    return temperatura.map {  // hacer con if o con when
        when{
            it < 4 -> "Frío"
            it <= 8 -> "Templado"
            else -> "Caliente"
        }
    }
}
fun contarPares(lista: List<Int>): Int{
    return lista.count{it % 2 == 0}
}
fun main(){
    //Trabajamos ocn una especie de copia para hacer una operación y en la nueva instancia generamos una nueva lista
    val lista1 = listOf(1,2,3,4,5,6,7,8,9,10)
    val resultado = duplicarLista(lista1) // resultado es un estado
    val pares = filtrarPares(lista1)
    val suma = sumarElementos(lista1)
    val procesarEjemplo = procesar(lista1)
    val temperatura = transformarTemperatura(lista1)
    val nPares = contarPares(lista1)
    println(lista1)
    println(pares)
    println(resultado)
    println(suma)
    println(procesarEjemplo)
    println(temperatura)
    println(nPares)
}