package Semana1.Polimorfismo;
//  SUPER: Palabra reservada para hacer referencia a su subclase con el constructor de la clase PADRE
class Animal2{
    void comida(){
        System.out.println("Comiendo..");
    }
}

class Dog extends Animal{
    void comida(){  System.out.println("Comiendo croquetas");   }
}

class Cachorro extends Animal{
    @Override
    void comida() { //Aplicando el polimorfismo: Redefinir
        System.out.println("Esta tomando agua");
    }
}

public class Polim {

    public static void main(String[] args) {
        Animal boby;

        boby = new Animal();
        boby.comida();

        boby = new Dog();
        boby.comida();

        boby = new Cachorro();
        boby.comida();

    }

}
