import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        String nombre = "Javier Chavez";
        String tipoDeCuenta = "Ahorro";
        double saldo = 2750;
        int opcion = 0;

        System.out.println("************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Su saldo es: " + "$"  + saldo);

        System.out.println("\n************************");

        String menu = """
                *** Elija el número de la opción deseada ***
                1- Consultar Saldo
                2- Retirar
                3- Depositar
                7- Salir 
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion != 7){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Saldo Actual: " + "$" + saldo);
                    break;
                case 2:
                    System.out.println("Cuanto dinero desea retirar???");
                    double valorARetirar = teclado.nextDouble();
                    if(valorARetirar > saldo){
                        System.out.println("Lo sentimos saldo insuficiente");
                    }else{
                       saldo = saldo - valorARetirar;
                        System.out.println("El saldo actualizado es:  " + "$" + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Cual es el valor que desea depositar");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("El saldo actualizado es: " + "$" + saldo);
                    break;
                case 7:
                    System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("OPCIÓN NO VALIDA, Por Favor, elije otra opción ");






            }

        }

    }
}
