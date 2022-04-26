package Semana2.Input_Out;

import java.io.FileInputStream;
import java.io.IOException;
//  Ejecutar el Intellij como administrador
public class LeerCadenaCaracteres {

    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream(name: "C:\\test2.txt");

            int i=0;

            while ((i=file.read())!=-1 ){  //  El numero -1, es el final de todo
                System.out.print((char)i);    //Contador a manera de caracter
            }file.close();

        }catch (IOException ioe){
            ioe.printStackTrace();
        }

    }

}
