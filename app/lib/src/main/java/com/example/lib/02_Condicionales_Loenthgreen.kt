//Ejercicio 02

fun main() {
    val calificaciones = listOf(45, 72, 91, 60, 85, 99, 34,19,24)

    for (cal in calificaciones) {
        val nivel = if (cal < 60) {
            "Reprobado"
        } else if (cal < 70) {
            "suficiente"
        } else if (cal < 80) {
            "bien"
        } else if (cal < 90) {
            "notable"
        } else {
            "excelente"
        }

        println("$cal -> $nivel")
    }
}