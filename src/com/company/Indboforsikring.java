package com.company;


import java.util.Scanner;

public class Indboforsikring {
    private String Adresse;
    private String Størrelse;
    private String Person;
    private String Forsikringsforhold;
    private String Skader;
    private String CPR;

    public Indboforsikring() {
        /*Adresse = adresse;
        Størrelse = størrelse;
        Person = person;
        Forsikringsforhold = forsikringsforhold;
        Skader = skader;
        this.CPR = CPR;*/
    }


    public void metode(Scanner input)
    {
        System.out.println("Boligens adresse:");
        Adresse = input.next();
    }
    public void metode2(Scanner input)
    {
        System.out.println("Boligens samlede antal m^2:");
        Størrelse = input.next();
    }
    public void metode3(Scanner input)
    {
        System.out.println("Antal personer i din husstand:");
        Person = input.next();
    }
    public void metode4(Scanner input)
    {
        System.out.println("Har du en indboforsikring idag, som vi skal opsige for dig?");
        Forsikringsforhold = input.next();
    }
    public void metode5(Scanner input)
    {
        System.out.println("Har din husstand anmeldt skader/tyverier på din indboforsikring de seneste 3 år?");
        Skader = input.next();
    }
    public void metode6(Scanner input)
    {
        System.out.println("Indtast CPR nummer:");
        CPR = input.next();

    }




}

