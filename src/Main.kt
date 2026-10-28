//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//
fun saludar(){
    println("Bienvenidos a la Programacion funcional")
}
//Invocacion en secuencia
fun iniciar(){
    println("Iniciando")
}
fun procesar(){
    println("Procesando")
}
fun finalizar(){
    println("Finalizando")
}
//METODO CON PARAMETROS: los justos y necesarios
fun imprimirNombre(nombre: String, edad: Int){
    println("El nombre es: $nombre con edad : $edad")
}

//metodos con parametros sin retorno
fun calcularArea(base:Double, altura:Double){
    val area = (base*altura)/2
    println("El area de un triangulo con $base de base y $altura de altura es: $area")
}
// funcion con paramteros y retorno
fun sumar(a:Int, b:Int): Int{
    return a+b //retornar de una, realizar la operación de forma correcta
}
// abreviar funciones con kotlin(la que usaremos en este curso)
fun sumar2(a:Int, b:Int): Int = a+b

fun verificarPar(a: Int): Boolean = a % 2 == 0

fun calcularPromedio(nota1: Double, nota2: Double, nota3: Double): Double = (nota1 + nota2 +nota3)/3

//funciones de orden superior
//operacion puede ser cualquier funcion con 2 enteros de parametro y con retorno entero
fun operar(a:Int, b: Int, operacion: (Int, Int) -> Int):Int{
    return operacion(a, b)
}

fun sumar3(a:Int, b:Int) : Int = a+b

fun multiplicar3(a:Int, b:Int) : Int = a*b

class Calculador{
    //funciones
    fun restar(a:Int, b:Int): Int = a-b
}
class Persona(var nombre:String, var edad:Int){
    //funciones

}

fun main() {

    val respuesta = operar(4,5,::sumar3)
    println(respuesta)

    val respuesta2 = operar(4,5,::multiplicar3)
    println(respuesta2)

    saludar()

    iniciar()
    procesar()
    finalizar()

    imprimirNombre("Alex", 22)

    calcularArea(5.0, 10.0)
    //primera forma
    val resultadoInstancia = sumar(4,3)
    println("Resultado mediante instancia: $resultadoInstancia")
    //segunda forma
    println("Resultado mediante su uso directo ${sumar(3,4)}")
    val resultadoAbreviado = sumar2(3,4)
    println("Resultado mediante abreviacion: ${resultadoAbreviado}")

    val esPar = verificarPar(8)
    println(esPar)
    println(verificarPar(9))

    println("El promedio del estudiante es: ${calcularPromedio(20.0,16.0,10.0)}")

    val calculadora = Calculador()
    val resta = calculadora.restar(5,2)
    println("Resta en calculador: $resta")

    val persona = Persona("Alex", 22)



}
