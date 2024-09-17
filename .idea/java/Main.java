import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String resp;
        do {
            System.out.println("------MENU------" +
                    "1. Abrir una nueva cuenta\n" +
                    "2. Ver un listado de las cuentas disponibles (codigo de cuenta, titular y saldo actual)\n" +
                    "3. Obtener los datos de una cuenta concreta. Realizar un ingreso en una cuenta\n" +
                    "4. Retirar efectivo de una cuenta\n" +
                    "5. Consultar el saldo actual de una cuenta\n" +
                    "6. Salir de la aplicacion\n");
            resp = teclado.nextLine();

            switch (resp) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Elección no valida");
            }
        } while (!resp.equals("6"));
    }
}
