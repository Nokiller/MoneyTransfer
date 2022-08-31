fun main() {
    val amount = 100_000 // Сумма перевода в копейках
    val tax = 0.0075 //Ставка по комиссии за перевод 0,75%
    val minimumFee = 3500 //Минимальый размер комиссии
    val fee = if (amount * tax >= minimumFee) amount * tax else minimumFee
    println("Комиссия за перевод $amount коп. составит: $fee коп.")
}