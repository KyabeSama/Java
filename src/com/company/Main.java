package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Algo1();
        System.out.println(" ");
        Algo2();
        System.out.println(" ");
        Algo3();
        System.out.println(" ");
        Algo4();
        System.out.println(" ");
        Algo5();
        System.out.println(" ");
        Algo8();
    }

    public static void Algo1() {
        //Algo 1
        System.out.println("Algo 1");
        int a1 = 1;
        int a2 = a1+3;
        a1 = 3;
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
    }

    public static void Algo2() {
        //Algo 2
        System.out.println("Algo 2");
       int b1 = 5;
       int b2 = 3;
       int b3 = b1 * b2;
       System.out.println("b1 = " + b1 + " b2 = " + b2 + "b3 = " + b3);
       b1 = 2;
       b3 = b2 + b1;
       System.out.println("b1 = " + b1 + " b2 = " + b2 + "b3 = " + b3);
    }

    public static void Algo3() {
        //Algo 3
        System.out.println("Algo 3");
        final int CTE = 30;
        int c1 = -2;
        int c2 = CTE;
        c2 = c2 / 2;
        int c3 = c1 + c2;
        System.out.println("c1 = " + c1 + " c2 = " + c2 + "c3 = " + c3);
        c1 = 2;
        c3 = c3 + CTE;
        c1 = c3 % 3;
        c2 = c1 - c2;
        System.out.println("c1 = " + c1 + " c2 = " + c2 + "c3 = " + c3);
    }

    public static void Algo4() {
        //Algo 4
        System.out.println("Algo 4");
        String s1 = "bonjour";
        String  s2 = "messieurs";
        String s3 = s1 + s2;
        System.out.println(s3);
        s3 = s3 +"-dames";
        System.out.println(" ");
        System.out.println(s3);
    }

    public static void Algo5() {
        //Aglo 5
        System.out.println("Algo 5");
        String s1 = "AB";
        String s2 = " 725 ";
        s2 = s1 + s2;
        System.out.println(s2);
       char c1 = 'F';
        s2 = s2 + c1;
        s2 = s2 + 'R';
        System.out.println(s2);
    }

    public static void Algo8() {
        float rayon, circonference, surface;
        final float PI = 3.14f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisissez le Rayon ");
        rayon = sc.nextFloat();
        circonference = 2*PI*rayon;
        surface = PI*rayon*rayon;
        double volume = (4.0/3.0)*PI*rayon*rayon*rayon;
        System.out.println("rayon = " + rayon + " circonference = " + circonference + " surface = " + " volume = " + volume);
    }

}