fun  main() {
    try {
        println("Введите x")
        var x = readLine()!!.toInt()
        println("Введите y")
        var y = readLine()!!.toInt()
        println("Введите m")
        var m = readLine()!!.toInt()
        println("Введите n")
        var n = readLine()!!.toInt()
        when {
            x-y<m%n -> println("x = ${x+1}")
            else -> println("x = $x")
        }
    }
    catch (e: Exception) {
        println("Неверно введено данное")
    }
}