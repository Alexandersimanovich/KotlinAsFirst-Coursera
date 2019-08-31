package lesson1.`own task1`

import lesson1.task1.sqr
import kotlin.math.sqrt

fun quadratEquationRoot (
        a: Double,
        b: Double,
        c: Double
) : Double =
        (-b + sqrt(discriminant(a,b,c))) / (2 *a)

fun discriminant (
        a: Double,
        b: Double,
        c: Double
) : Double = sqr(b) - 4 * a * c

fun main (argr: Array<String>) {
    val answer = quadratEquationRoot(
            1.0, 2.0, 3.0)
    println(answer)
}