package menuopcionessencillo;

import java.util.Scanner;

public class MenuOpcionesSencillo {
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("este es su menu de opciones, elige una: ");
        System.out.println("1. Consultar tu saldo");
        System.out.println("2. Ingresar dinero");
        System.out.println("3. Retirar dinero");
        System.out.println("4. Salir");
        opcion = sc.nextInt();
        if (opcion == 1) {
            System.out.println("Ha elegido consultar su saldo.");
        }else if (opcion == 2) {
            System.out.println("Ha elegido ingresar dinero");
        }else if (opcion == 3) {
            System.out.println("Ha elegido retirar dinero");
        }else if (opcion == 4) {
            System.out.println("Saliendo");
        }
        else {
            System.out.println("Opcion no valida.");
        }
    }
}
