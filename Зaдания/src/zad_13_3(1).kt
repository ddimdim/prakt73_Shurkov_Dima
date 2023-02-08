fun  main() {
    try {
        println("Введите x1")
        var x1 = readLine()!!.toDouble()
        println("Введите y1")
        var y1 = readLine()!!.toDouble()
        println("Введите x2")
        var x2 = readLine()!!.toDouble()
        println("Введите y2")
        var y2 = readLine()!!.toDouble()
        println("Введите x3")
        var x3 = readLine()!!.toDouble()
        println("Введите y3")
        var y3 = readLine()!!.toDouble()
        var a = Math.sqrt((Math.pow((x2-x1), 2.0)+(Math.pow((y2-y1), 2.0))))
        var b = Math.sqrt((Math.pow((x3-x2), 2.0)+(Math.pow((y3-y2), 2.0))))
        var c = Math.sqrt((Math.pow((x3-x1), 2.0)+(Math.pow((y3-y1), 2.0))))
        var P = a+b+c
        var p = P/2
        var S = Math.sqrt(p*(p-a)*(p-b)*(p-c))
        println("Периметр треугольника: $P")
        println("Площадь треугольника: $S")

    }
    catch (e: Exception) {
        println("Неверно введено данное")
    }
}