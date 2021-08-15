package net.globalr.app.codJoseG;

import java.util.Scanner;

public class menu {



    public void meto()
    {
        int me ;
        Scanner S = new Scanner(System.in);

        do {
            System.out.println("Seleccione una de las opciones en el MenuJoseG.menu");
            System.out.println("1. saludar");
            System.out.println("2. ver triangulo");
            System.out.println("3. Salir");
            System.out.println(" Introduce una opcion: ");
            me = S.nextInt();

        } while (me > 3 || me < 1);
        switch (me) {
            case 1:
                Scanner saludo = new Scanner(System.in);
                String nom;
                System.out.println("saludos ingrese su nombre:");
                nom = saludo.nextLine();
                System.out.println("Saludos y bienvenido " + nom);
                break;
            case 2:
                System.out.println("Has seleccionado la opcion triangulo");
                int a, b, alto;
                alto = 7;
                for (a = 0; a < alto; a++) {
                    for (b = 0; b < alto; b++) {
                        if (b <= a) {
                            System.out.print("*");
                        }
                        if (b == a) {
                            System.out.println("");
                        }
                    }

                }
                break;
            case 3:

                System.out.println("Hasta pronto");
                break;

        }
    }

}
