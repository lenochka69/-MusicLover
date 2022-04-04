fun main() {
    val isAudiophile = true
    val accumulatedPurchases = 7000
    val discount3 = 0.03
    val discount5 = 0.05
    val discountAudiophile = 0.01
    val totalPrice = 1000

    val finalPrice = if (isAudiophile) {
        if (accumulatedPurchases in 1001..10000) {
            totalPrice * (1 - discount3) * (1 - discountAudiophile)
        } else if (accumulatedPurchases > 10000) {
            totalPrice * (1 - discount5) * (1 - discountAudiophile)
        } else {
            totalPrice
        }
    } else {
        if (accumulatedPurchases in 1001..10000) {
            totalPrice * (1 - discount3)
        } else if (accumulatedPurchases > 10000) {
            totalPrice * (1 - discount5)
        } else {
            totalPrice
        }
    }

    println("Стоимость товара: $totalPrice, Итог с учетом скидки: $finalPrice")
}