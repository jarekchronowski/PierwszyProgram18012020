package pl.sda.petlaWhile;

import java.awt.*;

public class PetlaWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++; // dokladnie to sano i+=2 lub i=i+2
        }

        int j = 10;
        do {
            System.out.println("wartosc zmeinnej w petli while " + j);
        } while (j < 10);
    }
}
