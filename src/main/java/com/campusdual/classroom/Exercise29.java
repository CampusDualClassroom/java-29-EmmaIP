package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
        int number1 = 6;
        int number2 = 0;
        count(number1,number2);
    }
    public static int count(int number, int number1) {
        int result = 0;
        try {
            result = number / number1;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre cero");
        } finally {
            System.out.println("Finalizar programa");
        }

        return result;
    }
}
