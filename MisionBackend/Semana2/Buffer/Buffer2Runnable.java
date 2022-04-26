package Semana2.Buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Buffer2Runnable {

    public static void main(String[] args) throws IOException {

        Runnable run = new Runnable() {
            @Override
            public void run() {

                FileInputStream file = new FileInputStream(name: "C:\\test2.txt");
                BufferedInputStream bin = new BufferedInputStream(file);

                //Leyendo
                int i;

                while (( i=bin.read())!=-1 ){  //  El numero -1, es el final de todo
                    System.out.print((char)i);    //Contador a manera de caracter
                }
                bin.close();
                file.close();

            }
        };

        Thread buf = new Thread(run);
        buf.start();
    }
}
