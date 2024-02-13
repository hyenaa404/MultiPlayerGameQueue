
package controller;

import model.gamequeue.PlayerQueue;
import model.gamequeue.Player;
import util.InputUtils;

/**
 *
 * @author nhsuong
 */
public class QueueManagement {
    
    
    public static Player inputPlayer(PlayerQueue playerQueue){
        System.out.println("Enter player name: ");
        String name = InputUtils.inputName();
        boolean completed = false;
        int id;
        int point = 0;
        if (playerQueue.isEmpty()){
            id = 1;
        }else{
            id = playerQueue.getTail().getData().getId() + 1;
        }
        Player it = new Player(name, point, id);
        return it;
    }
    
    
    
    public static void remove(PlayerQueue playerQueue){
        playerQueue.displayList();
        System.out.println("Enter id to remove player: ");
        int id = InputUtils.inputInt();
        Player it = playerQueue.searchById(id);
        if( it!= null){
            playerQueue.removeList(it);
            System.out.println("Removed successfully!");
            playerQueue.displayList();
        }else{
            System.err.println("ID not found!");
        }
    }
    
    public static Player dequeuee(PlayerQueue playerQueue){
        return playerQueue.dequeue().getData();
    }
    
    public static void addPlayer(PlayerQueue playerQueue){
        playerQueue.add(inputPlayer(playerQueue));
        System.out.println("Added successfully!");
        playerQueue.displayList();
    }
    
    public static void enqueue(PlayerQueue plq, Player pl){
        plq.add(pl);
    }
    
    public static void clearQueue(PlayerQueue playerQueue){
        playerQueue.displayList();
        System.out.println("Do you sure to clear queue? Data will lost forever.\nPress 1 (YES) or 0 (NO)");
        int choice = InputUtils.inputOption(0, 1);
        if (choice == 1){
            playerQueue.clear();
            System.out.println("Cleared queue!");
        }
    }
    
}
