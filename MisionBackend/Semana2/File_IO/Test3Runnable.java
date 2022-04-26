package Semana2.File_IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test3Runnable {

    public static void main(String[] args) {

        Runnable test3Run = new Runnable() {
            @Override
            public void run() {
                try {
                    FileOutputStream leer = new FileOutputStream(name: "C:\\hola.txt"); //Leer el archivo hola.txt
                    //Mediante flujos : Leer caracter por caracter
                    int i= leer.read(); //Leer posiciones con el -->  int
                    System.out.println((char)i);
                    leer.close();

                }catch (IOException ioe){//Exception de Entrada y Salida de datos
                    ioe.printStackTrace();
                }
            }
        };

        Thread magic2 = new Thread(test3Run);
        magic2.start();
    }
}
