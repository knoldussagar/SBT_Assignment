package com.knoldus
import scala.math.pow

class Calculator {
  //Add Function
  def add(firstNumber: Int, secondNumber: Int): Int = firstNumber + secondNumber
  //Subtract Function
  def subtract(firstNumber: Int, secondNumber: Int): Int = firstNumber - secondNumber
  //Multiplication Function
  def multiply(firstNumber: Int, secondNumber: Int): Long = firstNumber * secondNumber
  //Division Function
  def divide(numerator: Int, denominator: Int): Any = {
    if (denominator != 0) {
      numerator/ denominator
    } else {
      "ArithmeticException : cant divide by 0"
    }
  }

  //Function to find the power of a number
  def power(number: Int, power: Int): Double = math.pow(number, power)
  //Function to find the absolute value of a number
  def absolute(number: Int): Int = math.abs(number)
  //Function to acquire remainder
  def modulus(firstNumber: Int, secondNumber: Int): Any = {
    if (secondNumber != 0) {
      firstNumber % secondNumber
    } else {
      "ArithmeticException : cant divide by 0"
    }

  }

  //Function to checkout maximum of two numbers
  def getMaximum(firstNumber: Int, secondNumber: Int): Int = {
    if (firstNumber > secondNumber) {
      firstNumber
    }
    else {
      secondNumber
    }
  }
  //Function to checkout minimum of two numbers
  def getMinimum(firstNumber: Int, secondNumber: Int): Int = {
    if (firstNumber < secondNumber) {
      firstNumber
    }
    else {
      secondNumber
    }
  }

}

