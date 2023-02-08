fun  main() {
    try {
        println("Введите a")
        var a = readLine()!!.toDouble()
        println("Введите b")
        var b = readLine()!!.toDouble()
        println("Введите k")
        var k = readLine()!!.toDouble()
        var disk = Math.pow(b, 2.0) - 4*a*k
        if (disk>0) {
            var x1 = (-b + Math.sqrt(disk)) / (2 * k)
            var x2 = (-b - Math.sqrt(disk)) / (2 * k)
            var y1 = k * x1 + b
            var y2 = k * x2 + b
            println("Точки пересечения:")
            println("($x1, $y1)")
            println("($x2, $y2)")
        }
        else if (disk==0.0)
        {
            var x = -b / (2*k)
            var y = k*x + b
            println("Точка пересечения: ($x, $y)")
        }
        else println("Точек пересечения нет")
    }
    catch (e: Exception) {
        println("Неверно введено данное")
    }
}