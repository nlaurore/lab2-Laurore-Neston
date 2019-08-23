package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int array[]=new int[10];
        int contPar=0, contImpar=0, contzero=0,c=0,c1=0;
        float media;
        Scanner tc=new Scanner(System.in);
        System.out.print("ingrese los numeros");
        for(int i=0;i<10;i++){
            array[i]=tc.nextInt();
            if(array[i]%2==0 && array[i]!=0) contPar++;
            if(array[i]%2!=0) contImpar++;
            if(array[i]==0) contzero++;
            if(i%2==0){
                c=c+array[i];
                c1++;
            }

        }
        media=c/c1;
        System.out.print("los numeros pares son:"+contPar);
        System.out.print("\nlos numeros pares son:" +contImpar);
        System.out.print("\nlos numeros zeros son:" +contzero);
        System.out.print("en posicion par hay"+c1);
        System.out.print("\nla media de los numeros en posicion pares es:"+media);
    }
}
