package Semana2.Buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Buffer2 {

    public static void main(String[] args) throws IOException{

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
}
