package parcial;

import java.util.Scanner;

public class PARCIAL {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();
        System.out.println("Hola " + nombre);
        System.out.println("Bienvenid@, a supermercado justo y bueno");
        menu();
    }

    public static void menu() {
        System.out.println("Querido usuario porfavor, seleccione una opción"
                + "\n1.Su compra es mayor a $200.000 pesos "
                + "\n2.Su compra es mayor a $500.000 pesos"
                + "\n3.Su compra es mayor a 1.000.000 pesos");
        int op = leer.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Querido usuario, en el día de hoy tendremos múltiples descuentos para usted");
                    System.out.println("Por favor, ingrese el valor de la compra.");
                    int valor1 = leer.nextInt();
                    if (valor1 <= 100000) {
                        System.out.println("No tiene descuento.El valor a pagar es" + valor1);
                    } else if ((valor1 > 100000)&& (valor1 <500000)) {
                        System.out.println(calcularDiez(valor1));
                    }
                    break;
                case 2:
                    System.out.println("Querido usuario, en el día de hoy tendremos múltiples descuentos para usted");
                    System.out.println("Por favor, ingrese el valor de la compra.");
                    int valor2 = leer.nextInt();
                    if  ( ( valor2 >=500000)&& (valor2 <=1000000)) {
                        System.out.println(calcularQuince(valor2));
                    }
                    break;
                case 3:
                      System.out.println("Querido usuario, en el día de hoy tendremos múltiples descuentos para usted");
                    System.out.println("Por favor, ingrese el valor de la compra,");
                    int valor3 = leer.nextInt();
                    if ((valor3 > 1000000)&&(valor3 <= 2000000)) {
                    System.out.println(calcularVeinte(valor3));    
                    } else if(valor3>2000000){
                        System.out.println("No existe un descuento para este valor.Elvalor a pagar es"+valor3); 
                    }
                    break;
                
            }
    }

    public static String calcularDiez(int valor1) {
        System.out.println("Tienes un descuento del 10%");
        int total = (int) (valor1 * 0.10);
        int total2 = valor1 - total;
        return "El valor inicial a pagar:" + valor1 + ". El valor del descuento tuvo un valor de " + total + " pesos. El valor a pagar es " + total2 + " pesos.";
    }

    public static String calcularQuince(int valor2) {
        System.out.println("Tienes un descuento del 15%");
        int total = (int) (valor2 * 0.15);
        int total2 = valor2 - total;
        return "El valor inicial a pagar:" + valor2 + ". El valor del descuento tuvo un valor de " + total + " pesos. El valor a pagar es " + total2 + " pesos.";
    }

    public static String calcularVeinte(int valor3) {
        System.out.println("Tienes un descuento del 20%");
        int total = (int) (valor3 * 0.20);
        int total2 = valor3 - total;
        return "El valor inicial a pagar:" + valor3 + ". El valor del descuento tuvo un valor de " + total + " pesos. El valor a pagar es " + total2 + " pesos.";
    }

}
