//  #1  Clase Champion
public class Champion {

    private int id;
    private String name, role, difficulty, description;

    //  Constructor Parametrizado, para asi poder pasarle todas las siguientes caracteristicas/informacion
    public Champion(int id, String name, String role, String difficulty, String description){

        this.id = id;
        this.name = name;
        this.role = role;
        this.difficulty = difficulty;
        this.description = description;

    }


    //   Getters and Setters
    public int getId(){ return id; }
    public boolean setId(int id){
        if(id > 0){
            this.id = id;
            return true;
        }else{  return false;  }
    }

    public String getName(){ return name; }
    public boolean setName(String name){
        if (!name.isEmpty()){   //  Si el nombre esta vacio
            //  Se le asignara un nombre
            this.name = name;
            return true;
        }else{  return false;  }
    }

    public String getRole(){ return role; }
    public boolean setRole(String role){   //  Si el role esta vacio
        if (!role.isEmpty()){
            this.role = role;
            return true;
        }else{  return false;  }
    }

    public String getDifficulty(){ return difficulty; }
    public boolean setDifficulty(String difficulty){   //  Si difficulty esta vacio
        if (!difficulty.isEmpty()){
            this.difficulty = difficulty;
            return true;
        }else{  return false;  }
    }

    public String getDescription(){ return description; }
    public boolean setDescription(String description){   //  Si la description esta vacio
        if (!description.isEmpty()){
            this.description = description;
            return true;
        }else{  return false;  }
    }


    //  showMessage
    public String showMessage(){
        return
                " Id: "+id+
                " Name: "+name+
                " Role: "+role+
                " Difficulty: "+difficulty+
                "\n Description: "+description+"\n";
    }







    public static void main(String[] args) {



    }
}
