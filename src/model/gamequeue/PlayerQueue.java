package model.gamequeue;

import java.util.ArrayList;
import java.util.List;
import model.mylist.MyList;
import model.mylist.Node;

/**
 *
 * @author nhs
 */
public class PlayerQueue extends MyList<Player> {

    public PlayerQueue() {
        super();
    }

    public Player searchById(int id) {
        Node<Player> p = head;
        Player pl;
        while (p != null) {
            pl = p.getData();
            if (pl.getId() == id) {
                return pl;
            }
            p = p.getNext();
        }
        return null;
    }

    public List<Player> getHighest() {
        List<Player> highest = new ArrayList<>();
        int max = -9999;
        Node<Player> p = head;
        Player pl;
        do  {
            pl = p.getData();
            if (pl.getPoint() > max) {
                max = pl.getPoint();
            }
            p = p.getNext();
        }while (p!= head);
        do {
            pl = p.getData();
            if (pl.getPoint() == max) {
                highest.add(pl);
            }
            p = p.getNext();
        }while (p!= head);
        return highest;

    }
    
    public Node<Player> dequeue(){
        Node<Player> p = head;
        tail.setNext(head.getNext());
        head = tail.getNext();
        return p;
    }

    @Override
    public void displayList() {
        System.out.printf("|  %-5s |   %-30s |    %-10s\n\n", "ID", "Name", "Point");
        super.displayList();
    }

}
