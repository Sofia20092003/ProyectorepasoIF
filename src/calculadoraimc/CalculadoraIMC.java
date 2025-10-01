package calculadoraimc;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        System.out.println("Bienvenido a tu calculadora de IMC");
        double alturausuario, pesousuario, IMC;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es su peso en kg?");
        pesousuario = sc.nextDouble();
        System.out.println("Cual es su altura en m?");
        alturausuario = sc.nextDouble();
        IMC=(pesousuario/(alturausuario*alturausuario));
        if(IMC<18.5){
            System.out.println("Tiene bajo peso.");
            System.out.println("Su IMC es de " + IMC + " kg/m2");
        } else if (IMC>=18.5 && IMC<25) {
            System.out.println("Su peso es normal.");
            System.out.println("Su IMC es de " + IMC + " kg/m2");
        }else if (IMC>=25 && IMC<30){
            System.out.println("Usted tiene sobrepeso.");
            System.out.println("Su IMC es de " + IMC + " kg/m2");
        }else {
            System.out.println("Usted tiene obesidad.");
            System.out.println("Su IMC es de " + IMC + " kg/m2");
        }
    }
}
