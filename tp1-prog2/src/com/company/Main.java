package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
       String nombre;
       int edad;
       Scanner teclado=new Scanner(System.in);
       do{
           System.out.print("ingresa un nombre\n");
           nombre=teclado.next();
           System.out.print("ingresa la edad\n");
           edad= teclado.nextInt();
           if(edad>=18){
               System.out.print(nombre+ ", es mayor de edad\n");
           }
           else{
               System.out.print(nombre+ ", es menor de edad\n");
           }
       }
       while (edad!=0);


    }
}
