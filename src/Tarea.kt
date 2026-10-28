class Producto(var nombre: String, var precio: Double, var cantidad: Int){
    fun obtenerSubtotal(precio: Double, cantidad: Int) : Double = precio*cantidad
    fun aplicarDescuento(subtotal: Double): Double{
        if(subtotal >= 100.00){
            return subtotal*0.1
        }
        return 0.0
    }
    fun obtenerTotal(subtotal: Double, descuento: Double): Double = subtotal - descuento
}

fun main(){
    val producto = Producto("Celular", 0.5,10)
    val subtotal = producto.obtenerSubtotal(producto.precio, producto.cantidad)
    println("Subtotal: $subtotal")
    val descuento = producto.aplicarDescuento(subtotal)
    println("Descuento: $descuento")
    val totalFinal = producto.obtenerTotal(subtotal, descuento)
    println("Total final: $totalFinal")

}