package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Indboforsikring indbo = new Indboforsikring();
        Scanner input = new Scanner(System.in);

        System.out.println("Hvis du ønsker en pris på indboforsikring, svar venligst på nedenstående spørgsmål: ");

        indbo.metode(input);
        indbo.metode2(input);
        indbo.metode3(input);
        indbo.metode4(input);
        indbo.metode5(input);
        indbo.metode6(input);

        System.out.println("Den beregnede pris for indboforsikring er 2160 kr.-" );

    }


}
