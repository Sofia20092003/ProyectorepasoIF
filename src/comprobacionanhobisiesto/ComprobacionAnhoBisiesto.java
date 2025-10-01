package comprobacionanhobisiesto;

import java.util.Scanner;

public class ComprobacionAnhoBisiesto {
    public static void main(String[] args) {
        int anho;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que año quiere poner? ");
        anho = sc.nextInt();
        if (anho%100==0){
            if(anho%400==0 && anho%4==0){
                System.out.println("El año que usted digito es bisiesto.");
            }
            else {
                System.out.println("El año que usted digito no es bisiesto.");
            }
        } else if (anho%4==0 && anho%100!=0) {
            System.out.println("El año que digito es bisiesto.");
        }
        else {
            System.out.println("El año que digito no es bisiesto.");
        }
    }
}
