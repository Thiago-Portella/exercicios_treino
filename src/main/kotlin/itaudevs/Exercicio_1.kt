package itaudevs

/* 1. Leia um número de 3 dígitos e gere um novo número composto da inversão dos dígitos: Ex:
123 -> 321 */

fun main() {
    println("Informe um número de três dígitos:")
    var numero = readln()
    println("O número invertido é: ")
    for (it in numero.reversed())
        print(it)
}