package Semana1;

public class MainBicicleta {

    public static void main(String[] args) {
        def();
    }

    //  Creacion del metodo para la definicion de las variables
    public static void def() {
        //  Creacion de una nueva intancia
        Bicicleta biciMountain = new Bicicleta();// Apuntando al Objeto Bicicleta

        biciMountain.setColor("Azul");
        biciMountain.setPrin(6);
        biciMountain.setRodada(26);
        biciMountain.setVelocidad(11.24);

        //  Definiendo los valores para las variables indefinidas en el Objeto Bicicleta
        String mensaje = "Esta es una Bicicleta de Montaña";
        mensaje += "\nSu Color es: "+biciMountain.getColor();
        mensaje += "\nSu Velocidad es: "+biciMountain.getVelocidad();
        mensaje += "\nLos Pines son: "+biciMountain.getPrin();
        mensaje += "\nLa Rodada es de: "+biciMountain.getRodada();

        System.out.println(mensaje);//  Imprimiendo la INFO definida
    }

/*
    public static void show() {
    }
* */

}