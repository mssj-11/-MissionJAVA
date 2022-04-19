package Semana1.Constructores;
//  overload=Sobrecarga     Override=Redefine       Overwrite=Sobreescribe
public class Bike {

    //Bike b= new Bike(); //Referencia al contructor Bike()
    private int velocidad;
    private String color, marca;

    //  Definiendo el constructor
    public Bike(){  }

    //  Sobrecargando al constructor
    public Bike(String color){  this.color = color; }
    public Bike(String color, int velocidad){   this.color = color;  this.velocidad = velocidad;   }
    public Bike(String color, String marca, int velocidad){   this.color = color; this.marca = marca; this.velocidad = velocidad;   }


    //  Metodos GET
    public int getVelocidad(){  return velocidad;   }
    public String getColor(){  return color;   }
    public String getMarca(){  return marca;   }

}