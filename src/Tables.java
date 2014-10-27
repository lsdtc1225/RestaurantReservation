import java.util.*;

/**
 * Created by sheng on 10/25/14.
 */
public class Tables {

    private Map<Integer, PriorityQueue<Table>> allTablesMap;

    public Tables(List<Integer> allTablesCapacity){
        allTablesMap = new HashMap<Integer, PriorityQueue<Table>>();
        for (Integer tableCap : allTablesCapacity){
            Table table= new Table(tableCap);
            int key = table.getCapacity();
            if (!allTablesMap.containsKey(key)){
                allTablesMap.put(key, new PriorityQueue<Table>());
            }
            allTablesMap.get(key).add(table);
        }
    }

    public void print() {
        for (Integer cap : allTablesMap.keySet()) {
            System.out.println(cap + ", (" + remainTimeListToString(allTablesMap.get(cap)) + ")");
        }
    }

    private String remainTimeListToString(PriorityQueue<Table> tables) {
        StringBuilder sb = new StringBuilder();
        for (Table t : tables) {
            sb.append(t.getRemainTime() + " | ");
        }
        sb.delete(sb.length()-3, sb.length());
        return sb.toString();
    }

}
