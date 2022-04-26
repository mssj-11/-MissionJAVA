package Semana2.Input_Out;

import java.io.FileOutputStream;
import java.io.IOException;
//  Ejecutar el Intellij como administrador
public class IOTest {

    public static void main(String[] args) {

        //  Exepciones
        try {
            FileOutputStream fos = new FileOutputStream(name: "C:\\hola.txt");
            fos.write(b:65);    //Pasandole el byte 65, confome el decimal=A en la tabla ASCII
            fos.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
            //System.out.println(ioe);
        }
    }
}
