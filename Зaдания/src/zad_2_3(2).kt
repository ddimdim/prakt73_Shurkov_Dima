fun  main() {
    try {
        println("Введите x")
        var x = readLine()!!.toDouble()
        println("Введите K")
        var K = readLine()!!.toInt()
        println("Введите M")
        var M = readLine()!!.toInt()
        println("Введите N")
        var N = readLine()!!.toInt()
        var y:Double
        if (M == Math.max(K, N))
            y = Math.sin(Math.abs(x))/Math.pow(x, 2.0)
        else if (M == Math.min(K, N))
            y = Math.sin(Math.abs(x))/(Math.pow(x, 2.0)+1)
        else y = -1.0
        println("y = $y")

    }
    catch (e: Exception) {
        println("Неверно введено данное")
    }
}