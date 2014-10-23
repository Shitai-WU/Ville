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
            ps.set(i,new Position());
        }

        for(int i=0;i<nb-1;i++) {
            ps.get(i).addPosition(ps.get(i+1));
        }
    }

    public Position getDebut() {
        return ps.get(0);
    }

    public Position getFin() {
        return ps.get(ps.size()-1);
    }
}
