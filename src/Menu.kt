

fun main(args:Array<String>){
    menu()
}

fun menu(){
    println("::Bienvenido a Recipes Maker::")
    var mesagge: String? = """
        1.- Ver Ingredientes Disponibles
        2.- Salir
    """.trimIndent()

    println(mesagge)

    var r: String? = readLine()

    when(r){
        "1" -> showIngredients()
        "2" -> println("Adios!")
        else -> println("Opcion no valida")
    }
}

var category_show = """
    1. Verduras
    2. Frutas
    3. Lacteos
    4. Carnes
    5. Granos
    6. Aceites
    9. Volver al Menu de Inicio
""".trimIndent()



fun showIngredients(){
    println("Hola, estas son las categorias de ingredientes disponibles:")
    println(category_show)
    var r_show: String? = readLine()
    when(r_show){
        "1" -> vegetables()
        "2" -> fruits()
        "3" -> dairy()
        "4" -> meets()
        "5" -> grain()
        "6" -> oils()
        "9" -> menu()
        else -> showIngredients()
    }
}

fun fruits(){
    var message_fruits = """
    Estas son las frutas disponibles:
    1. Fresa
    2. Platano
    3. Uvas
    4. Manzana
    5. Naranja
    
    9. Volver al menu de Inicio
""".trimIndent()
    println(message_fruits)
    var r_fruits: String? = readLine()
    when(r_fruits){
        "9" -> menu()
        else -> fruits()
    }
}

fun vegetables(){
    var message_vegetables = """
        Estas son las verduras disponibles:
        1. Zanahoria
        2. Tomates
        3. Brocoli
        4. Cebolla
        5. Arbejas
        
        9. Volver al menu de Inicio
    """.trimIndent()
    println(message_vegetables)
    var r_vegetables: String? = readLine()
    when(r_vegetables){
        "9" -> menu()
        else -> vegetables()
    }
}

fun dairy(){
    var message_dairy = """
        Estos son los lacteos disponibles:
        1. Leche
        2. Yogurt
        3. Queso
        4. Mantequilla
        5. Quesillos
        
        9. Volver al menu de Inicio
    """.trimIndent()
    println(message_dairy)
    var r_dairy: String? = readLine()
    when(r_dairy){
        "9" -> menu()
        else -> dairy()
    }
}

fun meets(){
    var message_meets = """
        1. Carne de res
        2. Pollo
        3. Carne de cerdo
        4. Pavo
        
        9. Volver al menu de Inicio
    """.trimIndent()
    println(message_meets)
    var r_meets: String? = readLine()
    when(r_meets){
        "9" -> menu()
        else -> meets()
    }
}

fun grain(){
    var message_grain = """
        1. Maiz
        2. Arroz
        3. Pan
        4. Cupcakes
        
        9. Volver al menu de Inicio
    """.trimIndent()
    println(message_grain)
    var r_grain: String? = readLine()
    when(r_grain){
        "9" -> menu()
        else -> grain()
    }
}

fun oils(){
    var message_oils = """
        1. Aceite de oliva
        2. Aceite de almendras
        3. Aceite de coco
        4. Aceite vegetal
        
        9. Volver al menu de Inicio
    """.trimIndent()
    println(message_oils)
    var r_oils: String? = readLine()
    when(r_oils){
        "9" -> menu()
        else -> oils()
    }
}