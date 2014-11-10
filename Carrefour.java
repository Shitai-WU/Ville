package ville;

import java.util.ArrayList;

/**
 * Created by shitawu on 09/10/2014.
 */
public class Carrefour {

    private ArrayList<Position> ps;
    private ArrayList<Face> fs;

    public Carrefour(int nb) {
        ps = new ArrayList<Position>(nb);
        fs = new ArrayList<Face>();

        for(int i=0;i<nb;i++) {
            ps.add(new Position());
        }

        for(int i=0;i<nb;i++) {
            ps.get(i).addPositionSuivante(ps.get((i+1)%nb));
        }

        /*
        for(int i=0;i<nb;i++) {
            fs.add(new Face(ps.get(i), ps.get((i+1)%nb)));
        }
        */
    }

    public Face getFace(int n) {
        return fs.get(n);
    }

    public ArrayList<Position> getPs() {
        return ps;
    }

    public ArrayList<Face> getFs() {
        return fs;
    }
}
