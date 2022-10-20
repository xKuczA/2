package app1;

import java.util.Random;

public class Player {
    
    private Random rand = new Random();
    
    private String name="Anonim";
    
    Player(){
        
    }
    
    
    
    Player(String name)
    {
        this.name=name;
    }
    
    public void setName(String name){
        if(name!=null)
        {
            this.name=name;
        }
        else
        {
            System.err.println("blad");
        }
    }
    
    public String getName(){
        return name;
    }
    
    int guess(){
    return rand.nextInt(6)+1;
    }
}
