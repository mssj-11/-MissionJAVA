package Semana2.Interfaces;

abstract class Hola{
    //Como lo hace
    void Saludar(){ System.out.println("Hola, que tal? ");  }

    abstract void Saludo();

}

interface Mostrar{

    //  Que hace
    void show();
    abstract void despedida();

}



public class Saludos implements Mostrar{

    public static void main(String[] args) {

        public void show(){
            System.out.println("Hola, ¿Como estas?, Espero todo bien..");
        }
        Saludos saludo1 = new Saludos();
        saludo1.show();
    }

    public void despedida(){    System.out.println("EStas despedido");  }

}