package example;


import java.util.Scanner;

import static org.example.GPS.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int aux = 0;
        Scanner leer = new Scanner(System.in);

        boolean salir = false;
        GPS gps = new GPS();
        while(salir == false) {
            System.out.println("Dime que bus quieres consultar");
            aux = leer.nextInt();
            switch (aux) {
                case 0: // Parado


                case 1: // Parado en estación
                    gps.actualizacionBus1();

                    break;
                case 2: // Lento
                    gps.actualizacionBus2();

                    break;
                case 3: // Medio
                    gps.actualizacionBus3();

                    break;
                case 4: // Rápido
                    salir = true;

                    break;
            }
        }
    }
}