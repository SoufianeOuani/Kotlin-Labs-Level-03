/*
fill a 3x3 matrix with random numbers, then print all the elements.
*/

import kotlin.io.print

fun fillMatrixWithRandomNumbers(rows:Int, cols:Int): Array<Array<Int>>
{
    val matrix = Array(rows) { Array(cols) {0} }

    for (i in 0 until rows)
    {
        for (j in 0 until cols)
        {
            matrix[i][j] = randomNumberGenerator(1, 100)
        }
    }
    return matrix
}

fun printMatrixElements(matrix: Array<Array<Int>>, rows:Int, cols:Int)
{
    println("Matrix Elements: ")
    for (i in 0 until rows)
    {
        for (j in 0 until cols)
        {
            print("${matrix[i][j]}\t")
        }
        println()
    }
}

fun main()
{
    print("How many rows? ")
    val rows:Int = readln()?.toInt() ?: 3
    print("How many cols? ")
    val cols: Int = readln()?.toInt() ?: 3

    val matrix = fillMatrixWithRandomNumbers(rows, cols)
    printMatrixElements(matrix, rows, cols)
}
