fun  main() {
    try {
        println("Введите высоту в метрах, с которой падает камень")
        var h = readLine()!!.toDouble()
        var g:Double = 9.8
        var t = Math.sqrt(2*h/g)
        println("Время падения камня: $t сек")
    }
    catch (e: Exception) {
        println("Неверно введено данное")
    }
}