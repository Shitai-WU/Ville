package ville;

import java.util.ArrayList;

/**
 * Created by shitawu on 09/10/2014.
 */
public class Route {
    private Voie v1, v2;
    private Face f1, f2;

    public Route(int i) {
        v1 = new Voie(5);
        v2 = new Voie(5);
        f1 = new Face(v1.getDebut(), v2.getFin());
        f2 = new Face(v2.getDebut(), v1.getFin());
    }

    public Face getF1() {
        return f1;
    }

    public Face getF2() {
        return f2;
    }
}
