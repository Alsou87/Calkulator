package com.example.calcul;
import java.util.Scanner; //импортируем класс
//@author ZiganshinaAlsu
public class Qq {
    private static Scanner scanner;
    public static void main (String[] args) {
        scanner=new Scanner(System.in);
        double a;
        double b;
        String operator;
        System.out.println("Введите 1-ое слагаемое:");
        a=scanner.nextDouble();
        System.out.println("Введите 2-ое слагаемое:");
        b=scanner.nextDouble();
            System.out.printf("Cумма чисел равна  %.4f",+(a+b)); //округление
        }

    }



