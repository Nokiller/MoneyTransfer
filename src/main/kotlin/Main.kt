fun main() {
    val amount = 100_000 // Сумма перевода в копейках
    val tax = 0.0075 //Ставка по комиссии за перевод 0,75%
    val fee = if (amount * tax >= 3500) amount * tax else 3500
    println("Комиссия за перевод $amount коп. составит: $fee коп.")
}