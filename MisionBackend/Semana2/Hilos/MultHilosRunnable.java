package Semana2.Hilos;
//Multiples Hilos ejecutando diferentes  tarea
public class MultHilosRunnable {

    public static void main(String[] args) {

        //Creacion de la implemntascion de los hilos
        Runnable r1 = new Runnable() {  //Implementascion tarea 1
            @Override
            public void run() { System.out.println("Task 1: "); }
        };

        Runnable r2 = new Runnable() {  //Implementascion tarea 2
            @Override
            public void run() { System.out.println("Task 2: "); }
        };

        //Creando los hilos
        Thread t1 = new Thread(r1),
                t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}