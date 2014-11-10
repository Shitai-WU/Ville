package ville;

import java.util.ArrayList;

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

    public synchronized void prendre(){
        while(!isLibre) {
            try{
                wait();
            }catch (Exception e) {e.printStackTrace();}
        }
        isLibre = false;
        notifyAll();
    }

    public synchronized void liberer(){
        while(isLibre) {
            try{
                wait();
            }catch (Exception e) {e.printStackTrace();}
        }
        isLibre = true;
        notifyAll();
    }

    public void addPositionSuivante(Position p) {
        suivantes.add(p);
    }

    public boolean getisLibre() {
        return isLibre;
    }

    public void setIsLibre(boolean b) {
        isLibre = b;
    }

    public ArrayList<Position> getSuivantes() {
        return suivantes;
    }

    public Position getPositionSuivanteRandom() {

        return null;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
