//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   val cuenta = Cuenta("Juanma")
    val cuenta2 = Cuenta("Carlos", 1200f)

    cuenta.ingresar(100f)
    println(cuenta.cantidad)

    println(cuenta2.cantidad)
    cuenta2.retirar(1300f)
    println(cuenta2.cantidad)
}