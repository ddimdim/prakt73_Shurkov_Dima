fun  main() {
    try {
        println("Введите x")
        var x = readLine()!!.toDouble()
        println("Введите y")
        var y = readLine()!!.toDouble()
        println("Введите r")
        var r = readLine()!!.toDouble()
        println("Введите R")
        var R = readLine()!!.toDouble()
        when {
            Math.pow(x, 2.0)+Math.pow(y, 2.0)>Math.pow(r, 2.0) && Math.pow(x, 2.0)+Math.pow(y, 2.0)<Math.pow(R, 2.0) -> println("Точка попадает в кольцо")
            else -> println("Точка не попадает в кольцо")
        }
    }
    catch (e: Exception) {
        println("Неверно введено данное")
    }
}