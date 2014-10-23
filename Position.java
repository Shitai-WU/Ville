package ville;

import java.util.ArrayList;

/**
 * Created by shitawu on 09/10/2014.
 */
public class Position {
    private boolean libre = true;
    private ArrayList<Position> suivante;

    public Position() {
        libre = true;
        suivante = new ArrayList<Position>();
    }

    public void addPosition(Position p) {
        suivante.add(p);
    }

    public int nbPosition() {
        return suivante.size();
    }

    public boolean isLibre() {
        return libre;
    }

    public ArrayList<Position> getSuivante() {
        return suivante;
    }
}
