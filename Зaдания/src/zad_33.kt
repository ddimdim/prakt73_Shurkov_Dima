fun  main() {
    try {
        println("Введите k")
        var k = readLine()!!.toDouble()
        println("Введите b")
        var b = readLine()!!.toDouble()
        println("Введите R")
        var R = readLine()!!.toDouble()
        var a = Math.pow(k, 2.0) + 1
        var b1 = 2*k*b
        var c = Math.pow(b, 2.0) - Math.pow(R, 2.0)
        var disk = Math.pow(b, 2.0) - 4*a*c
        var x1 = (-b1 + Math.sqrt(disk))/(2*a)
        var x2 = (-b1 - Math.sqrt(disk))/(2*a)
        var y1 = k*x1+b
        var y2 = k*x2+b
        when{
            disk<0 -> println("Нет точек")
            disk==0.0 && x1>0 && y1>0 -> println("Точка ($x1; $y1) входит в 1-ую четверть")
            disk == 0.0 -> println("Точка ($x1; $y1) не входит в 1-ую четверть")
            disk>0 && x1>0 && y1>0 && x2>0 && y2>0 -> println("Точки ($x1; $y1) и ($x2; $y2) входят в 1-ую четверть")
            disk>0 && x1>0 && y1>0 && (x2<=0 || y2<=0) -> println("Точка ($x1; $y1) входит в 1-ую четверть")
            disk>0 && x2>0 && y2>0 && (x1<=0 || y1<=0) -> println("Точка ($x2; $y2) входит в 1-ую четверть")
            else -> println("Точки не входят в 1-ую четверть")
        }

    }
    catch (e: Exception) {
        println("Неверно введено данное")
    }
}