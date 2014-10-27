/**
 * Created by sheng on 10/25/14.
 */
public class HistoryTime {

    private double hTime;
    private static final double weight = 0.5;

    public HistoryTime(Menu menu) {

        hTime = menu.getAverageTime();
    }

    public double getHistoryTime(){
        return hTime;
    }

    public void updateHistoryTime(double newTime){
        hTime = weight * newTime + (1-weight)*hTime;
    }
}
