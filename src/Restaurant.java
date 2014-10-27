import java.util.List;

/**
 * Created by sheng on 10/25/14.
 */
public class Restaurant {
    private Menu menu;
    private WaitingQueue queue;
    private HistoryTime hTime;
    private Tables allTables;

    public Restaurant(List<Integer> tableCapacities){
        menu = new Menu();
        queue = new WaitingQueue();
        hTime = new HistoryTime(menu);
        allTables = new Tables(tableCapacities);
    }
}
