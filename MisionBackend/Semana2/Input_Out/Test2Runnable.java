package Semana2.Input_Out;

import java.io.FileOutputStream;
import java.io.IOException;
//  Ejecutar el Intellij como administrador
public class Test2Runnable {

    public static void main(String[] args) {

        //Hilos
        Runnable test2 = new Runnable() {
            @Override
            public void run() {

                //  Exepciones
                try {
                    FileOutputStream fos = new FileOutputStream(name: "C:\\test2Runnable.txt");
                    String cadena = "Magia con Runnable :)";
                    byte b[] = cadena.getBytes();

                    fos.write(b);
                    fos.close();

                    System.out.println(b);

                }catch (IOException ioe){
                    ioe.printStackTrace();
                }

            }
        };

        Thread magic = new Thread(test2);
        magic.start();
    }
}
