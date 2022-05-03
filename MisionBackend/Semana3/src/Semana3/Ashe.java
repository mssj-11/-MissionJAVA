//  #3 Champion
//  In this case is ASHE
public class Ashe extends Champion implements  AsheActionCallbacks{

    //  Creando el constructor, que coincide con la super Clase
    public Ashe(int id, String name, String role, String difficulty, String description) {
        super(id, name, role, difficulty, description);
    }


    //  implements Methods
    @Override
    public void frostShot(Screen s) {
        /*System.out.println("Lanzo una flecha de hielo");*/
        s.setVisible(true);
        s.out(showMessage(), font"Helvetica", size=28, Colors.BlueHorizon);
        s.showImage(f:"ashe5 - FLECHA DE CRISTAL ENCANTADA.gif");
        s.setBounds(x:200, y:100, width:1100, height:900);
    }
    @Override
    public void hawkShot(Screen s) {
        /*System.out.println("Lanzo una flecha de madera");*/
        s.cls();
        s.repaint();
        s.out(showMessage(), font"Helvetica", size=28, Colors.BlueHorizon);
        s.showImage(f:"ashe4 - TIRO DE HALCÓN.gif");
        s.setBounds(x:200, y:100, width:1100, height:900);
    }
    @Override
    public void rangertFocus(Screen s) {
        /*System.out.println("Lanzo una flecha con fuego");*/
        s.cls();
        s.repaint();
        s.out(showMessage(), font"Helvetica", size=28, Colors.BlueHorizon);
        s.showImage(f:"ashe3- DESCARGA.gif");
        s.setBounds(x:200, y:100, width:1100, height:900);
    }
    @Override
    public void volley(Screen s) {
        /*System.out.println("Lanzo una roca");*/
        s.cls();
        s.repaint();
        s.out(showMessage(), font"Helvetica", size=28, Colors.BlueHorizon);
        s.showImage(f:"ashe2 - CONCENTRACIÓN DE LA GUARDABOSQUES.gif");
        s.setBounds(x:200, y:100, width:1100, height:900);

    }
    @Override
    public void cristalArrow(Screen s) {
        /*System.out.println("Lanzo un cristal ");*/
        s.cls();
        s.repaint();
        s.out(showMessage(), font"Helvetica", size=28, Colors.BlueHorizon);
        s.showImage(f:"ashe1-TIRO ESCARCHADO.gif");
        s.setBounds(x:200, y:100, width:1100, height:900);
    }


}
