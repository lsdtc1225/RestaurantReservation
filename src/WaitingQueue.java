import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by sheng on 10/25/14.
 */
public class WaitingQueue {
    private Queue<Group> queue;


    public WaitingQueue(){
        queue = new LinkedList<Group>();
    }

    public void addGroup(Group newGroup){
        queue.offer(newGroup);
    }

    public Group dispatch(){
        if (queue.size() > 0){
            return queue.poll();
        }
        return null;
    }
}
