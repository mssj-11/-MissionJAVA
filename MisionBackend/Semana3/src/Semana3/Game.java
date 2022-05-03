//  #4 GAME
public class Game{

    public static void main(String[] args) throws InterruptedException{
        TestAshe();
    }

    private static void TestAshe(){
        //Creacion de un Objeto tipo Screen
        Screen screen = new Screen();

        //Creacion de un Objeto tipo Ashe
        Ashe ashe = new Ashe(
                id:01,
                name:"Ashe",
                role:"TIRADOR",
                difficulty:"MODERADA",
                description:"Como Hija del Hielo y madre de guerra de la tribu Avarosa, Ashe comanda la más grande horda en el norte. Estoica, inteligente e idealista, pero incómoda con su rol de líder, ella aprovecha las magias ancestrales de su linaje para portar un arco de Hielo Puro. Apoyada por la creencia de su gente que ella es el héroe mitológico reencarnado de Avarosa, Ashe espera unificar el Fréljord una vez más al retomar sus tierras antiguas y tribales"

        );

        /*s.setVisible(true);
        s.out(ashe.showMessage(), font:"Helvetica", size:28, Colors.BlueHorizon);*/

        /*
        //  llamando los ataques de Ashe
        ashe.frostShot(screen);
        Thread.sleep(millis:3000);//    Hilos
        ashe.crystalArrow(screen);*/

        //  Con Runnable
        Runnable attack = new Runnable(){
            @java.lang.Override
            public void run() {

                try{
                    ashe.frostShot(screen);
                    Thread.sleep(millis:3000);

                    ashe.hawkShot(screen);
                    Thread.sleep(millis:3000);

                    ashe.volley(screen);
                    Thread.sleep(millis:3000);

                    ashe.rangerFocus(screen);
                    Thread.sleep(millis:3000);

                    ashe.crystalArrow(screen);
                    Thread.sleep(millis:3000);

                }catch(InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };

        Thread.attackAshe = new Thread(attack);
        attackAshe.start();
    }

}