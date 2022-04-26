package Semana2.Hilos;

public class HilosThread extends Thread{

    @Override
    public void run() {//Runnable
        System.out.println("El hilo se esta ejecutando");
    }

    /*
    @Override
    public void start() {
        //Iniciar la ejecucion de un hilo, la JVM llama al metodo run() del hilo
        super.start();
    }*/
    //  sleep : Detiene de manera temporal el numero espacificado
    //  join : Espera al hilo hasta que muera/finalice, para entrar
    //  setPriority : Establece la prioridad del hilo
    //  getPriority : Nos regresa la prioridad del hilo
    //  getNmae : establece un nombre o agrega un nombre de forma generica
    //  currentThread : La referencia al hilo
    //  getId : Regresa el ID del hilo
    //  Thread.State getState : Regresa el estado del hilo
    //  isAlive : Si el hilo esta vivo

    public static void main(String[] args) {

        HilosThread hilo = new HilosThread();   //Entra al state new
        hilo.start();   //Inicializando el hilo

    }

}


class HilosR implements Runnable{
    @Override
    public void run() {
        System.out.println("Implementa el hilo de Runnable estan corriendo..");
    }

    public static void main(String[] args) {
        HilosR h = new HilosR();
        Thread t = new Thread(h);
        t.start();
    }

}