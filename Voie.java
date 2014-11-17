package ville;

import java.util.ArrayList;

/**
 * Created by shitawu on 09/10/2014.
 */
public class Voie {

    private ArrayList<Position> ps;

    public Voie(int nb) {
        ps = new ArrayList<Position>(nb);

        for(int i=0;i<nb;i++) {
            ps.add(new Position());
        }

        for(int i=0;i<nb-1;i++) {
            ps.get(i).addPositionSuivante(ps.get(i+1));
        }
    }

    public Position getEntree() {
        return ps.get(0);
    }

    public Position getSortie() {
        return ps.get(ps.size()-1);
    }

    public ArrayList<Position> getPs() {
        return ps;
    }

}
