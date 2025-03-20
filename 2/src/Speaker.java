public class Speaker{
    private String name;
    private int power;
    
    public Speaker(){
    }
    
    public Speaker(String name, int power){
        this.name=name;
        this.power=power;
    }
    
    public String getName(){
        return name;
    }
    
    public int getPower(){
        return power;
    }
    
    public void setName(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return name + ", " + power;
    }
}