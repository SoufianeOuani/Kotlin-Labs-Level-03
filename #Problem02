/*
fill a 3x3 matrix with random numbers, then sum each row in the matrix and print it.
*/

Note : some functions doesn't exist in this file, it's imported from the previous problem.

package com.example.problemsolvinglevel01_kotlin

import android.opengl.Matrix

fun rowSum(matrix: Array<Array<Int>>, rowNumber:Int, cols:Int):Int
{
    var sum = 0
    for (i in 0 until cols)
    {
        sum += matrix[rowNumber][i]
    }
    return sum
}

fun printEachRowSum(matrix: Array<Array<Int>>, rows: Int, cols: Int)
{
    println("\nThe the following are the sum of each row in the matrix: ")
    for (i in 0 until rows)
    {
        println("Row ${i+1} sum = ${rowSum(matrix, i, cols)}")
    }
}

fun main()
{
    val matrix = fillMatrixWithRandomNumbers(3, 3)

    println("The following are the sum of each row in the matrix: ")
    printMatrixElements(matrix, 3, 3)
    printEachRowSum(matrix, 3, 3)
}
