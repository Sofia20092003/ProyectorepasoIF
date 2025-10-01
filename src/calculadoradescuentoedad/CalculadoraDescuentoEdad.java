package calculadoradescuentoedad;

import java.util.Scanner;

public class CalculadoraDescuentoEdad {
    public static void main(String[] args) {
        System.out.println("Bienvenido al Warner.");
        int edad;
        double entrada, descuento;
        entrada = 165.5;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();
        if (edad < 5) {
            System.out.println("Bienvenido, su entrada es gratis.");
        } else if (edad>=5 && edad<=12) {
            System.out.println("Usted aplica para el 50% de descuento en su entrada.");
            descuento =entrada*0.5;
            System.out.println("Su descuento es de: "+descuento);
            System.out.println("Con el descuento su entrada cuesta: " + (entrada- descuento) + " euros.");
        }else if (edad>=13 && edad<=64) {
            System.out.println("Usted no aplica para el descuento en su entrada, " +
                    "por lo tanto su entrada cuesta " + entrada + " euros.");
        }else {
            System.out.println("Usted aplica para el 75% de descuento en su entrada.");
            descuento =entrada*0.75;
            System.out.println("Su descuento es de: " +descuento);
            System.out.println("Con el descuento su entrada cuesta: " +(entrada-descuento) + " euros.");
        }
    }
}
