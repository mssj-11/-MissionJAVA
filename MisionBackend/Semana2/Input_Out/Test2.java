package Semana2.Input_Out;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {

    public static void main(String[] args) {

        //  Exepciones
        try {
            FileOutputStream fos = new FileOutputStream(name: "C:\\test2.txt");
            String cadena = "Magia :)";
            byte b[] = cadena.getBytes();
            
            fos.write(b);
            fos.close();

            System.out.println(b);

        }catch (IOException ioe){
            ioe.printStackTrace();
        }
        
    }
}
