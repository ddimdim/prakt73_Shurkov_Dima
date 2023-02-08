fun  main() {
    try {
        println("Введите число а ")
        var a = readLine()!!.toDouble()
        println("Введите число b")
        var b = readLine()!!.toDouble()
        println("Введите число c")
        var c = readLine()!!.toDouble()
        println("Введите число d")
        var d = readLine()!!.toDouble()
        println("Введите число n")
        var n = readLine()!!.toDouble()
        var itog=
            (0.25 * (a - b)) / ((1 / 8) - ((Math.abs(b)) / (Math.pow(10.0, n + 3) + (Math.log(b) / (c - d)))))
        println(itog)
    }
    catch (e:Exception)
    {
        println("Неверно введено данное")
    }
}