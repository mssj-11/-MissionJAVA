package Semana1.Polimorfismo;

class Animal{
    //Caso #1
    String color="Blanco";

    //Caso #2
    void comida(){   System.out.println("Comiendo ....");   }

    //Caso #3
    Animal(){   System.out.println("Se crea un animal");    }

}

class Gato extends Animal{
    //Caso #1 -- Variables de Instancia
    String color="Cafe";
    void printColor(){
        System.out.println("El color del gato es: " +color);
        System.out.println("Color de la clase super (Animal): " +super.color);
    }

    //Caso #2 -- Metodo
    void comida(){  System.out.println("El gato esta comiendo Atun: "); }
    void dormir(){  System.out.println("Ya se durmio el michigan ");    }

    void call(){
        super.comida();
        dormir();
    }

    //Caso #3
    Gato(){
        super();
        System.out.println("Se creo un animal");
    }

}

public class SuperTest {

    public static void main(String[] args) {
        //Caso #1
        new Gato().printColor();

        //Caso #2
        new Gato().call();

        //Caso #3
        new Gato();

    }

}
