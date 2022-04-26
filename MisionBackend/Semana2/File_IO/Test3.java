package Semana2.File_IO;

import java.io.FileOutputStream;
import java.io.IOException;

//  File Input Stream : para leer archivos
public class Test3 {

    public static void main(String[] args) {

        try {
            FileOutputStream leer = new FileOutputStream(name: "C:\\hola.txt"); //Leer el archivo hola.txt
            //Mediante flujos : Leer caracter por caracter
            int i= leer.read();
            System.out.println((char)i);
            leer.close();

        }catch (IOException ioe){//Exception de Entrada y Salida de datos
            ioe.printStackTrace();
        }

    }
}
