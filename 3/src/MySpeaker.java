import java.util.Collections;
import java.util.List;

public class MySpeaker implements ISpeaker{

    @Override
    public int f1(List<Speaker> t) {
        int count=0;
        for(Speaker speaker: t){
            if(speaker.getPower()>10)
                count++;
        }
        return count;
    }

    @Override
    public void f2(List<Speaker> t) {
        for(int i=0; i<Math.min(5, t.size()); i++){
            for(int j=i+1; j<Math.min(5, t.size()); j++){
                if(t.get(i).getPower() > t.get(j).getPower()){
                    Collections.swap(t, i, j);
                }
            }
        }
    }

    @Override
    public void f3(List<Speaker> t) {
        
    }
    
}