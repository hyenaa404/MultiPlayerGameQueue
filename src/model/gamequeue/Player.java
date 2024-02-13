
package model.gamequeue;

/**
 *
 * @author nhs
 */
public class Player {
    private String name;
    private int point;
    private int id;

    public Player() {
    }

    public Player(String name, int point, int id) {
        this.name = name;
        this.point = point;
        this.id = id;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void upPoint(){
        this.point += 3;
    }
    
    public void downPoint(){
        this.point -=1;
    }
    
    

    @Override
    public String toString() {
        System.out.printf("|  %-5d |   %-30s |    %-10d",this.id, this.name, this.point);
        return "";
    }
    
    
    
}
