class Cuenta(val titular: String, var cantidad: Float) {

constructor (titular: String): this(titular, 0f)
    init {
            if (cantidad <0)
                cantidad=0f
        }


    fun ingresar(ingreso: Float){
        if (ingreso > 0)
            this.cantidad += ingreso
    }

    fun retirar(retirada: Float){

        this.cantidad-= retirada
        if (cantidad<0)
            cantidad=0f
    }
}


