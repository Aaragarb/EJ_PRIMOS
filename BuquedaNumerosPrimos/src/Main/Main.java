package Main;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static boolean esPrimo(int num){
        if (num <= 0){
            return false;
        }
        for (int i = 2 ; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.println("Escriba el numero inicial");
            int numIn = scanner.nextInt();

                if (numIn == 0){
                    System.out.println("Programa finalizado");
                    break;
                }

            System.out.println("Escriva el numero final");
            int numFin = scanner.nextInt();

            System.out.println("Buscando numeros primos desde " + numIn + " hasta " + numFin);
            int contadorPrimos = 0;
                for (int i = numIn; i <= numFin; i++) {
                    if (esPrimo(i)) {
                        System.out.println(i);
                        contadorPrimos ++;
                    }
                }

            System.out.println("Se a encontrado " +contadorPrimos+" numeros primos.");
            }
        }
    }

