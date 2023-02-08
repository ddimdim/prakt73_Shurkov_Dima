fun  main() {
    try {
        println("Введите x")
        var x = readLine()!!.toDouble()
        println("Введите y")
        var y = readLine()!!.toDouble()
        println("Введите z")
        var z = readLine()!!.toDouble()
        var L = 2*Math.max(x,z) - 3*Math.min(Math.min(x,y), z)
        println("Число L = $L")

        }
    catch (e: Exception) {
        println("Неверно введено данное")
    }
}

