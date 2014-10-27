import java.util.*;

/**
 * Created by sheng on 10/25/14.
 */
public class Tables {

    private Map<Integer, List<Table>> allTablesMap;

    public Tables(List<Integer> allTablesCapacity){
        for (Integer tableCap : allTablesCapacity){
            Table table= new Table(tableCap);
            int key = table.getCapacity();
            if (!allTablesMap.containsKey(key)){
                allTablesMap.put(key, new LinkedList<Table>());
            }
            allTablesMap.get(key).add(table);
        }
        for (Integer key : allTablesMap.keySet()){
            Collections.sort(allTablesMap.get(key));
        }
    }


}
