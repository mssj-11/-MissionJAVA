package Semana1;

public class Bicicleta {
    
    //  Objeto
    Bicicleta(){
    }

    //  Constructor
    public Bicicleta(String Color){
    }
    
    public int prin, rodada;
    public double velocidad;
    public String color;

    public double getVelocidad(){  return velocidad;  }
    public int getPrin(){  return prin; }
    public int getRodada(){ return rodada; }
    public String getColor(){  return color; }


    public boolean setPrin(int prin){
        if(prin > 0){
            this.prin = prin;
            return true;
        }else
            return false;
    }

    public boolean setRodada(int rodada){
        if(rodada > 0){
            this.rodada = rodada;
            return true;
        }else
            return false;
    }

    public boolean setVelocidad(double velocidad){
        if(velocidad >= 0){
            this.velocidad = velocidad;
            return true;
        }else
            return false;
    }

    public boolean setColor(String color){
        if(!color.isEmpty()){
            this.color = color;
            return true;
        }else
            return false;
    }


    public String printState(){
        return "Pins: "+prin+"\nRodada: "+rodada+"\nVelocidad: "+velocidad+"\nColor: "+color;
    }

}