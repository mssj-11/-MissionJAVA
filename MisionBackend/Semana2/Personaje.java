package Semana2;
//  Abstraccion
abstract class Sombra{
    abstract void dibujarSombra();
}

class Arma extends Sombra{
    @Override
    void dibujarSombra(){   //Redefiniendo el metodo --> dibujarSombra
        System.out.println("Dibujando sombras en el arma color Azul");
    }
}

public class Personaje extends Arma{

    public static void main(String[] args) {

        Sombra flecha = new Personaje();
        Sombra arco = new Arma();

        flecha.dibujarSombra();
        arco.dibujarSombra();
    }

    @Override
    void dibujarSombra() {
        System.out.println("Dibuja una sombra blanca");
    }

}