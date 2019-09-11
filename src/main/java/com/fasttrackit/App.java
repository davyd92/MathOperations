package com.fasttrackit;


import java.util.Scanner;

public class App {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        System.out.println("Dati numerele x si y");
        System.out.print("x=");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        System.out.print("y=");
        int y = in.nextInt();

        Adunare adunare = new Adunare();
        Scadere scadere = new Scadere();
        Inmultire produs = new Inmultire();
        Impartire impartire = new Impartire();
        adunare.adunare(x,y);
        scadere.scadere(x,y);
        produs.inmultire(x,y);
        impartire.impartire(x,y);


    }
}
