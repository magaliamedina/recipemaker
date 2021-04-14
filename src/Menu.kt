fun main(args: Array<String>) {
    do {
        println(
            """::Bienvenidos a Recipe Marker::
        | Selecciona la opción deseada:
        | 1.Hacer una receta.
        | 2.Ver mis recetas.
        | 3.Salir.""".trimMargin()
        )
        println("Selecciona la opción deseada:")
        val response: String? = readLine()

        when (response) {
            "1" -> println("Ha ingresado hacer una receta.")
            "2" -> println("Ha ingresado ver mis recetas.")
            "3" -> println("Usted ha decidido salir de la app.")
            else -> println("Ha ingresado una opcion incorrecta.Por favor, ingrese otra vez el numero.")
        }
    } while (response != "3")
}