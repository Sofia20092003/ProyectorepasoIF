package accesozonarestringida;

import java.util.Scanner;

public class AccesoZonaRestringida {
    public static void main(String[] args) {
        System.out.println("Bienvenido Zona Restringida");
        Scanner sc = new Scanner(System.in);
        boolean esempleado;
        String respuesta;
        int pisoempleado;
        System.out.println("Es usted empleado de esta empresa? si/no");
        respuesta = sc.nextLine();
        if (respuesta.equals("si")) {
            esempleado = true;
            System.out.println(esempleado);
            System.out.println("Acceso concedido.");
            System.out.println("En que piso del 1 al 6 esta asignado usted?");
            pisoempleado = sc.nextInt();
            if (pisoempleado<= 4) {
                System.out.println("Su nivel de acceso es limitado.");
            } else if (pisoempleado>4) {
                System.out.println("Usted tiene acceso total.");
            }
            else  {
                System.out.println("Este numero de piso no existe.");
            }
        }
        else {
            esempleado = false;
            System.out.println(esempleado);
            System.out.println("Acceso denegado");
        }
    }
}
