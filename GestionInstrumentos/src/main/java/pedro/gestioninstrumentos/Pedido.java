package pedro.gestioninstrumentos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Pedido {

    static int totalAPagar;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {
            System.out.println("------ MENU ------");
            System.out.println("");

            System.out.println("1. Desea pedir instrumentos?");
            System.out.println("2. Desea pedir refinador?");
            System.out.println("3. Desea pedir alguna calcomania?");
            System.out.println("4. Consultar Total");
            System.out.println("5. Salir");
            System.out.println("");

            try {

                System.out.println("Elija una de las opciones: ");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("");
                        System.out.println("Cuantos instrumentos que va a comprar");
                        int cantidad = sn.nextInt();
                        for (int i = 0; i < cantidad; i++) {
                            System.out.println("");
                            System.out.println("Elije 1 guitarra");
                            System.out.println("Elije 2 bajo");
                            System.out.println("Elije 3 piano");
                            System.out.println("Elije 4 aleatorio");
                            int tipoInstrumento = sn.nextInt();

                            totalAPagar = totalAPagar + comprarInstrumento(tipoInstrumento);
                        }
                        System.out.println("Total a pagar por los instrumentos es: " + totalAPagar);
                        System.out.println("");
                        break;
                    case 2:
                        Afinador();
                        break;
                    case 3:
                        Calcomania();
                        break;
                    case 4:
                        TotalConEnvio();
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }

    public static void Afinador() {
        Afinador afinador = Afinador.getAfinador();
        int valorAfinador = afinador.valor;
        totalAPagar = totalAPagar + valorAfinador;

        System.out.println("");
        if (valorAfinador == 0) {
            System.out.println("SOLO PUEDE LLEVAR UN AFINADOR");
        }
        System.out.println("Valor del afinador: " + valorAfinador);
        System.out.println("Total a pagar: " + totalAPagar);
        System.out.println("");
    }

    public static void Calcomania() {
        Calcomania calcomania = Calcomania.getCalcomania();
        int valorCalcomania = calcomania.valor;
        totalAPagar = totalAPagar + valorCalcomania;

        System.out.println("");
        if (valorCalcomania == 0) {
            System.out.println("SOLO PUEDE LLEVAR UNA CALCOMANIA");
        }
        System.out.println("Valor de la calcomania: " + valorCalcomania);
        System.out.println("Total a pagar: " + totalAPagar);
        System.out.println("");
    }

    public static int comprarInstrumento(int tipo) {
        String instrumento = "";
        int valorAPagar = 0;

        Fabrica factory = new Fabrica();

        if (tipo == 1) {
            instrumento = "guitarra";
        } else {
            if (tipo == 2) {
                instrumento = "bajo";
            } else {
                if (tipo == 3) {
                    instrumento = "piano";
                } else {
                    instrumento = funcionRamdon();
                }
            }
        }
        Iinstrumentos nuevoInstrumento = factory.getInstrumento(instrumento);
        String nombre = nuevoInstrumento.fabricarInstrumentoMusical();
        int precio = nuevoInstrumento.getPrecio();
        System.out.println("");
        System.out.println(nombre);
        System.out.println("Valor del instrumento: " + precio);

        return precio;
    }

    public static void TotalConEnvio() {
        String costoEnvio = "5%";

        totalAPagar = totalAPagar + totalAPagar / 20;
        System.out.println("");
        System.out.println(costoEnvio);
        System.out.println("Total a pagar con costo envio: " + totalAPagar);
    }

    public static String funcionRamdon() {

        int num = (int) (Math.random() * 3 + 1);
        if (num == 1) {
            return "GUITARRA";
        } else {
            if (num == 2) {
                return "BAJO";
            } else {
                return "PIANO";
            }
        }
    }
}
