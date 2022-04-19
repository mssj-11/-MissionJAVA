package Semana1.Herencia;

public class Empleado { //  superclase
    //  Definindo variables vacias
    double salario = 11000;
}

//  clase Area es la subclase de la clase Empleado (usando la palabra clave: extends)
class Area extends Empleado{   //  subclase-->Area
    int bono = 1000;

    //  Metodo Main
    public void main() {
        Area money = new Area();  //Referencia a Area()
        System.out.println("El salario del programador es: " +money.salario);
        System.out.println("El bono es de: " +money.bono);
    }

    //  Metodo Mensaje
    void mensaje(){
        System.out.println("Felicidades por tu bono :)");
        main();
    }
}


//  clase Backend es la subclase de la clase Area (usando la palabra clave: extends)
class Backend extends Area{
    public static void main(String[] args) {
        Backend back = new Backend();
        back.mensaje();
    }
}