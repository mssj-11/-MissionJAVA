package Semana2.Input_Out;
//  Ejecutar el Intellij como administrador
import java.io.FileInputStream;
import java.io.IOException;

//  Con runnable
public class LeerCadenaRunnable {

    public static void main(String[] args) {

        Runnable con = new Runnable() {
            @Override
            public void run() {

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
        };

        Thread magic = new Thread(con);
        magic.start();
    }
}
