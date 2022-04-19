package Semana1.Polimorfismo;

class Bike2{
    void run(){ //Metodo para echar a andar la bicicleta
        System.out.println("Running..");
    }
}

public class Polimorfismo extends Bike2{
    //Redifiniendo
    @Override
    void run() {
        System.out.println("Corro a 60 millas x  h.");
    }

    public static void main(String[] args) {
        //Ligadura dinamica es decir, obtiene lo contenido en la clase hija [Polimorfismo]
        Bike2 bike2 = new Polimorfismo();   //Construyendo con lo que contenga Polimorfismo
        bike2.run();
    }
}
