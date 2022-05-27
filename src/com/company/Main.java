package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1
        //double a6,b6,c6,d,x1,x2,x;
        //a6=in.nextDouble();
        //b6=in.nextDouble();
        //c6=in.nextDouble();
        //d=b6*b6-4*a6*c6;
        //if (d > 0) {
        //    x1 = (-b6 - Math.sqrt(d)) / (2 * a6);
        //    x2 = (-b6 + Math.sqrt(d)) / (2 * a6);
        //    System.out.println("x1= " + x1 + "x2= " + x2);
        //}
        //else if(d==0){
        //    x=-b6/(2*a6);
        //    System.out.println("Один корень ="+x);
        //}
        //else {
        //    System.out.println("Хуй тебе а не корни");
        //}
        //2)
        //int a1,b1;
        //a1=in.nextInt();
        //b1=in.nextInt();
        //System.out.println("\nРезультат =" +(a1/b1) + "\nЧастное =" +(a1));
        //if(a1%b1>0)
        //    System.out.println("\nОстаток ="+(a1)*0.1);
        //3)
        //int x33;
        //x33=in.nextInt();
        //if (x33>0)
        //    System.out.println("Результат ="+((2*x33)-10));
        //else if (x33==0)
        //    System.out.println("Результат ="+0);
        //else
        //    System.out.println("Результат ="+(Math.abs((2*x33)-1)));
        //4)
        //String color;
        //color=in.next();
        //switch (color) {
        //    case "black" -> System.out.println("Код цвета - 0,0,0");
        //    case "white" -> System.out.println("Код цвета - 255,255,255");
        //    case "red" -> System.out.println("Код цвета - 255,0,0");
        //    case "green" -> System.out.println("Код цвета - 0,128,0");
        //    case "blue" -> System.out.println("Код цвета - 0,0,255");
        //    case "yellow" -> System.out.println("Код цвета - 255,255,0");
        //    case "gold" -> System.out.println("Код цвета - 255,215,0");
        //    case "orange" -> System.out.println("Код цвета - 255,165,0");
        //}
        //6)
        //double pi = Math.PI;
        //int dotY, r,dotX;
        //dotX=in.nextInt();
        //dotY=in.nextInt();
        //r=in.nextInt();
        //if ((double)(dotX) + dotY <= 2 * pi * r)
        //    System.out.println("\nУказанные точки принадлежат окружности");
        //else
        //    System.out.println("\nУказанные точки не принадлежат окружности");
        //7)
        //int a, b, c;
        //System.out.println("\nСторону А:");
        //a = in.nextInt();
        //System.out.println("\nСторону B:");
        //b = in.nextInt();
        //System.out.println("\nСторону C:");
        //c = in.nextInt();
        //if (a + b > c && a + c > b && b + c > a) {
        //    System.out.println("\nТреугольник существует.");
        //    if (a == b & b == c & a == c)
        //        System.out.println("\nТреугольник равносторонний");
        //    if (a == b || b == c || a == c)
        //        System.out.println("\nТреугольник равнобедренный.");
        //    else
        //        System.out.println("\nТреугольник разносторонний.");
        //}
        //8)
        //int year;
        //year=in.nextInt();
        //if ((year%100==0&&year%400==0) || (year%4==0&&year%100>0))
        //    System.out.println("\nГод високосный");
        //else
        //    System.out.println("\n Год невисокосный");
        //9)
        //char symbol;
        //symbol=in.next().charAt(0);
        //if((int)symbol>64&&(int)symbol<91)
        //    System.out.println("Заглавная буква английского языка введён пользователем");
        //else
        //    System.out.println("Иной символ введён пользователем");
        //10)
        //int numberOne, numberTwo, numberThree;
        //numberOne=in.nextInt();
        //numberTwo=in.nextInt();
        //numberThree=in.nextInt();
        //if(numberOne > numberTwo && numberOne < numberThree)
        //    System.out.println(numberOne);
        //else if(numberTwo > numberOne && numberTwo < numberThree)
        //    System.out.println(numberTwo);
        //else
        //    System.out.println(numberThree);
        //11)
        //int speed;
        //speed=in.nextInt();
        //double apos=7.8;
        //double bpos=11.2;
        //double cpos=16.4;
        //if (speed<7.8)
        //    System.out.println("Ракета упала на землю");
        //else if (apos < speed & speed < bpos)
        //    System.out.println("Ракета стала спутником земли");
        //else if (apos < speed & speed < cpos)
        //    System.out.println("Ракета стала спутником солнца");
        //else
        //    System.out.println("Ракета покинула солнецчную систему");
        //12)
        //int num;
        //int numberKol;
        //num=in.nextInt();
        //System.out.println("Введите число 0-1000");
        //numberKol=(int)(Math.log10(num)+1);
        //if (num==0)
        //    System.out.println("1");
        //else
        //    System.out.println(numberKol);
        //2*)
        int a5,b5,c5,d5;
        int quad=2;
        a5=in.nextInt();
        b5=in.nextInt();
        c5=in.nextInt();
        d5=in.nextInt();
        if (a5<=b5&b5<=c5&c5<=d5)
            System.out.println("Получилось: " + (d5) + (d5) + (d5) + (d5));
        else if (a5 > b5 & b5 > c5 & c5 > d5)
            System.out.println("Получилось: " + (a5) + (b5) + (c5) + (d5));
        else
            System.out.println("Получилось: " + "\n"+(int)Math.pow(a5,quad) +"\n"+ (int)Math.pow(b5,quad) + "\n"+(int)Math.pow(c5,quad)+ "\n"+(int)Math.pow(d5,quad));


        }
    }