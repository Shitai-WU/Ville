package ville;

import java.util.ArrayList;

/**
 * Created by shitawu on 09/10/2014.
 */
public class Position {
    private boolean isLibre = true;
    private ArrayList<Position> suivante;

    public Position() {
        isLibre = true;
        suivante = new ArrayList<Position>();
    }

    public void addPosition(Position p) {
        suivante.add(p);
    }

    public int nbPosition() {
        return suivante.size();
    }

    public boolean getisLibre() {
        return isLibre;
    }

    public void setisLibre(boolean b) {
        isLibre = b;
    }

    public ArrayList<Position> getSuivante() {
        return suivante;
    }
}
