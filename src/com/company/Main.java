package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int numeroIf = 8;
        int numeroWhile = 0;
        int numeroDoWhile = 2;
        int numeroFor = 0;
        var estación = "VERANO";

        //IF
        if (numeroIf == 0) {
            System.out.println("El número es 0");
        } else if (numeroIf < 0) {
            System.out.println("El número es menor que 0");
        } else {
            System.out.println("El número es mayor que 0");
        }

        //WHILE
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        //DO WHILE
        do {
            numeroDoWhile++;
        } while (numeroDoWhile < 3);

        //FOR
        for (; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        //SWITCH
        switch (estación.toLowerCase()) {
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No es una estación válida");
        }
    }
}
