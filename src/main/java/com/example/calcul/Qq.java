package com.example.calcul;
import java.util.Scanner; //импортируем класс
//@author ZiganshinaAlsu
public class Qq {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        double a;
        double b;
        String operator1;
        //int anrr[];
        String chose;
        int razmer;
        System.out.println("Выберите программу: ");//выбор программы
        System.out.println("1 - Простой калькулятор");
        System.out.println("2 - Работа с массивом");
        chose = scanner.next();
        if (chose.equals("2")) {
            System.out.print("Введите размерность массива: ");
            razmer = scanner.nextInt();//считывание размерности
            String[] anrr  = new String[razmer];
            for (int i=0; i<anrr.length; i++) {//ввод и считывание элементов массива
                System.out.println("Введите элемент массива: ");
                anrr[i]=scanner.next();
            }
            String stroka = anrr[0]; //строка=первый элемент массива
            for (int i=1; i<anrr.length; i++){
                String stroka2 = anrr[i];
                   if (stroka2.length() > stroka.length()) {//сравнение строк
                       stroka = stroka2;
                   }
                }
            System.out.println("Самое длинное слово: ");
            System.out.println(stroka);
            }

        if (chose.equals("1")) {//программа калькулятор
        System.out.println("Введите 1-ое число:");
        a = scanner.nextDouble();
        System.out.println("Введите 2-ое число:");
        b = scanner.nextDouble();
        System.out.println("Выберите операцию: ");
        System.out.println("1 - Сложение");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Деление");
        System.out.println("4 - Умножение");
        //Scanner sc = new Scanner(System.in);
        operator1 = scanner.next();
        if (operator1.equals("1")) {
            System.out.printf("Cумма чисел равна  %.4f", +(a + b));
        }
        if (operator1.equals("2")) {
            System.out.printf("Разница чисел равна  %.4f", +(a - b));
        }
        if (operator1.equals("3")) {
            System.out.printf("Деление чисел равно  %.4f", +(a / b));
        }
        if (operator1.equals("4")) {
            System.out.printf("Умножение чисел равно  %.4f", +(a * b));
        }}
    }
}







