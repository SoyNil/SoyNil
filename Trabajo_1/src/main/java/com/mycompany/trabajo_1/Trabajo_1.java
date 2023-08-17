package com.mycompany.trabajo_1;
import java.util.Scanner;
public class Trabajo_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1;
        int n2;
        int resultado;
        System.out.println("Ingrese el primero número");
        n1=sc.nextInt();
        System.out.println("Ingrese el segundo número");
        n2=sc.nextInt();
        resultado=n1+n2;
        System.out.println("El resultado es "+resultado);
    }
}
