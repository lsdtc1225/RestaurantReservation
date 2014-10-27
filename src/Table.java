import java.util.Comparator;

/**
 * Created by sheng on 10/25/14.
 */
public class Table implements Comparable<Table>{
    private int capacity;
    private double remainTime;

    public Table(int capacity){
        this.capacity = capacity;
        remainTime = 0;
    }

    public int getCapacity(){
        return capacity;
    }

    public double getRemainTime(){
        return remainTime;
    }

    @Override
    public int compareTo(Table t) {
        if (this.remainTime > t.getRemainTime() ){
            return 1;
        }else if (remainTime < t.getRemainTime()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
