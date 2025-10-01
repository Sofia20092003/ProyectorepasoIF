package verificaciondecontrasenha;

import java.util.Scanner;

public class VerificacionContrasenha {
    public static void main(String[] args) {
        String nombreusuario, contrasenhausuario;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido usuario.");
        System.out.println("Ingrese su nombre: ");
        nombreusuario = sc.next();
        System.out.println("Ingrese su contraseña: ");
        contrasenhausuario = sc.next();
        if(contrasenhausuario.equals("javaesincreible")){
            System.out.println("Acceso Concedido");
            System.out.println("Bienvenido " +  nombreusuario);
        }else {
            System.out.println("Acceso Denegado");
        }
    }
}
