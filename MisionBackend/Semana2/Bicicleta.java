package Semana2;

abstract class Montana{

    Montana(){  System.out.println("Se ha creado una bicicleta de Montana ");   }

    abstract void cambiarVelocidad();

    void cambiarColor(){    System.out.println("Cambiando el color a Rojo");    }

}
//Marca
class Magistroni extends Montana{

    void cambiarVelocidad(){    System.out.println("Se deben modificar las perollas del manubrio"); }

}

public class Bicicleta {

    void cambiarVelocidad(){    System.out.println("Gira la perilla");  }

    public static void main(String[] args) {
        Montana bici1 = new Magistroni();
        bici1.cambiarVelocidad();
        bici1.cambiarColor();

    }

}