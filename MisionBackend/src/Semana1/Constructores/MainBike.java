package Semana1.Constructores;

public class MainBike {

    public static void main(String[] args) {    show(); }

    public static void show() {

        Bike b= new Bike( "Azul", 6); //Referencia al contructor Bike()
        System.out.println("\n .:: Programa sobre Constructores ::.\n");
        System.out.println("Este es el color: "+b.getColor());
        System.out.println("Este es la velocidad: "+b.getVelocidad());

    }

}