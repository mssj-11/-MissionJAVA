package Semana2.Hilos;
//Multiples Hilos ejecutando la misma tarea
//  MultiTask
// Opcion Con Thread
public class MultiHilos extends Thread{

    @Override
    public void run() {
        System.out.println("Tarea 1: ");
    }

    public static void main(String[] args) {
        MultiHilos t1 = new MultiHilos(),
                t2 = new MultiHilos(),
                t3 = new MultiHilos();

        t1.start();
        t2.start();
        t3.start();
    }

}


// Opcion Con Runnable
class Multitasking implements Runnable{

    @Override
    public void run() {
        System.out.println("Tarea Uno Runnable: ");
    }

    public static void main(String[] args) {
        //Generando un nuevo hilo, A travez del metodo Multitasking
        Thread tarea1 = new Thread(new Multitasking());
        Thread tarea2 = new Thread(new Multitasking());
        Thread tarea3 = new Thread(new Multitasking());

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();

        tarea1.start();
        tarea2.start();
        tarea3.start();

        task1.start();
        task2.start();
        task3.start();
    }
}

class Task1 extends Thread{
    @Override
    public void run() { System.out.println("Tarea A : ");   }
}

class Task2 extends Thread{
    @Override
    public void run() { System.out.println("Tarea B : ");    }
}

class Task3 extends Thread{
    @Override
    public void run() { System.out.println("Tarea C : ");   }
}