import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by sheng on 10/25/14.
 */
public class Menu {
    private static Map<String, Double> menuMap;
    private static final int max = 50;
    private static final int min = 20;

    public Menu(){
        menuMap = new HashMap<String, Double>();
        generateRandomMenu();
    }

    private int randInt(int min, int max){
        Random rand = new Random();
        int randomNumber = rand.nextInt(max-min+1) + min;
        return randomNumber;
    }

    private void generateRandomMenu(){
        int itemNum = randInt(min, max);
        for (int i = 0; i < itemNum; i++){
            String name = (new BigInteger(130, new SecureRandom()).toString(32)).substring(0, 5);
            double duration = min + (max - min) * (new Random()).nextDouble();
            menuMap.put(name, duration);
        }
    }

    public void addDish(String name, double time){
        menuMap.put(name, time);
    }

    public double getAverageTime(){
        double res = 0;
        for (double time : menuMap.values()){
            res += time;
        }
        return res/menuMap.size();
    }
}
