package Semana2.Input_Out;

import java.io.FileOutputStream;
import java.io.IOException;

public class IORunnable {
    //  Ejecutar el Intellij como administrador
    public static void main(String[] args) {
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
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
        };
        
        Thread writefile = new Thread(t1);
        writefile.start();
    }
}
