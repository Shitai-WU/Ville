package ville;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by shitawu on 09/10/2014.
 */
public class Position {
    private int x,y;
    private boolean isLibre = true;
    private ArrayList<Position> suivantes;

    public Position() {
        suivantes = new ArrayList<Position>();
    }

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
        suivantes = new ArrayList<Position>();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean getIsLibre() {
        return isLibre;
    }

    public void setIsLibre(boolean b) {
        isLibre = b;
    }

    public void addPositionSuivante(Position p) {
        suivantes.add(p);
    }

    public Position getPositionSuivanteRandom() {
        Random random = new Random();
        return suivantes.get(random.nextInt(suivantes.size()));
    }

    public ArrayList<Position> getSuivantes() {
        return suivantes;
    }

    public synchronized void prendre(){
        while(!isLibre) {
            try{
                wait();
            }catch (Exception e) {e.printStackTrace();}
        }
        isLibre = false;
    }

    public synchronized void liberer(){
        isLibre = true;
        notifyAll();
    }
}
