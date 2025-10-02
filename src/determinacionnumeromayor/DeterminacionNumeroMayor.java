package determinacionnumeromayor;

import java.util.Scanner;

public class DeterminacionNumeroMayor {
    public static void main(String[] args) {
        double numero1, numero2, numero3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite tres numeros: ");
        numero1 = sc.nextDouble();
        numero2 = sc.nextDouble();
        numero3 = sc.nextDouble();
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El numero " +  numero1 + " es el mayor.");
        }else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El numero " + numero2 + " es el mayor.");
        }
        else {
            System.out.println("El numero " + numero3 + " es el mayor.");
        }
    }
}
