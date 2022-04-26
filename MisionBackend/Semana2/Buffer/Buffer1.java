package Semana2.Buffer;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Buffer1 {

    public static void main(String[] args) {

        try {
            FileInputStream fos = new FileInputStream(name: "C:\\test2.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fos);

            String s = "Buffer LaunchX \n Fin de la Semana 2";
            byte b[]= s.getBytes();

            bout.write(b);
            bout.flush();

            bout.close();
            fos.close();
            System.out.println("Esta Listo");

        }catch (IOException ioe){
            ioe.printStackTrace();
        }

    }
}
