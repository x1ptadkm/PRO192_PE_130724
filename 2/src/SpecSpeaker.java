public class SpecSpeaker extends Speaker{
    private String sound;
    
    public SpecSpeaker(){
    }
    
    public SpecSpeaker(String name, int power, String sound){
        super(name, power);
        this.sound=sound;
    }

    @Override
    public String toString() {
        return getName() + ", " + sound + ", " + getPower();
    }
    
    public void setData(){
        if(getName()!=null && !getName().isEmpty()){
            setName(getName().substring(0, getName().length()-1));
        }
    }
    
    public String getValue(){
        if(getPower()>10)
            return this.sound;
        else return this.sound + getPower();
    }
}