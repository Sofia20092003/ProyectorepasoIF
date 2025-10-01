package clasificaciontriangulos;

import java.util.Scanner;

public class ClasificacionTriangulos {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la Clasificacion Triangulos");
        double ladoa,ladob,ladoc;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese las medidas de los dados del triangulo: ");
        ladoa = sc.nextDouble();
        ladob = sc.nextDouble();
        ladoc = sc.nextDouble();
        if(ladoa==ladob && ladoc==ladoa){
            System.out.println("El triangulo es equilatero ya que tiene todos sus lados iguales.");
        }else if(ladoa!=ladob && ladoa==ladoc){
            System.out.println("El triangulo es isoceles ya que tiene dos lados iguales y uno diferente.");
        }else if(ladoa==ladob && ladoa!=ladoc){
            System.out.println("El triangulo es isoceles ya que tiene dos lados iguales y uno diferente.");
        }else {
            System.out.println("El triangulos es escaleno ya que tiene todos sus lados diferentes.");
        }
    }
}
