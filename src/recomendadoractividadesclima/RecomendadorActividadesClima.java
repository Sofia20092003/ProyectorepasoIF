package recomendadoractividadesclima;

import java.util.Scanner;

public class RecomendadorActividadesClima {
    public static void main(String[] args) {
        String climactual;
        int temperaturaactual;
        Scanner sc = new Scanner(System.in);
        System.out.println("*************************************************");
        System.out.println("***                                           ***");
        System.out.println("***BIENVENIDO A TU RECOMENDADOR SEGUN EL CLIMA***");
        System.out.println("***                                           ***");
        System.out.println("*************************************************");
        System.out.println("                                                 ");
        System.out.println("Que clima esta haciendo hoy?");
        System.out.println("Soleado.");
        System.out.println("Lluvioso.");
        System.out.println("Nublado.");
        climactual = sc.nextLine();
        if (climactual.equals("soleado")) {
            System.out.println("Cual es la temperatura actual?");
            temperaturaactual = sc.nextInt();
            if (temperaturaactual < 15) {
                System.out.println("Podrias ir a la montaña, eso si ve abrigado no te vayas a enfermar.");
            }else if (temperaturaactual >= 15 && temperaturaactual <= 25) {
                System.out.println("Podrias salir a dar un paseo al lugar que mas te guste.");
            }
            else {
                System.out.println("Que calor hace!, es un buen dia para ir a la playa a tomar el sol.");
            }
        }else if (climactual.equals("nublado")) {
            System.out.println("Podrias ir con tu persona favorita o solo a visitar un museo.");
        }else if (climactual.equals("lluvioso")) {
            System.out.println("Es momento de ver una pelicula con una bebida caliente y tu snack favorito en casa.");
        }
        else {
            System.out.println("No tengo ninguna recomendacion para ese clima.");
        }
    }
}
