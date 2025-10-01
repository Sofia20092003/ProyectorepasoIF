package calificacionexamen;

import java.util.Scanner;

public class CalificacionExamen {
    public static void main(String[] args) {
        int notaexamen;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite su nota: ");
        notaexamen = sc.nextInt();
        if (notaexamen>=90 && notaexamen<=100){
            System.out.println("Su nota es de A");
        }else if (notaexamen>=80 && notaexamen<=89){
            System.out.println("Su nota es de B");
        }else if (notaexamen>=70 && notaexamen<=79){
            System.out.println("Su nota es de C");
        }else if (notaexamen>=60 && notaexamen<=69){
            System.out.println("Su nota es de D");
        }else if (notaexamen>=0 && notaexamen<=59){
            System.out.println("Su nota es de F");
        }
        else{
            System.out.println("Nota fuera de rango.");
        }
    }
}
