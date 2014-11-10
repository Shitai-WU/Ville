package ville;

import java.util.ArrayList;

/**
 * Created by shitawu on 09/10/2014.
 */
public class Route {

    private Voie v1, v2;
    private Face f1, f2;

    public Route(Voie v1, Voie v2) {
        this.v1 = v1;
        this.v2 = v2;
        f1 = new Face(this.v1.getDebut(), this.v2.getFin());
        f2 = new Face(this.v2.getDebut(), this.v1.getFin());
    }

    public Route(int i) {
        v1 = new Voie(i);
        v2 = new Voie(i);
        f1 = new Face(v1.getDebut(), v2.getFin());
        f2 = new Face(v2.getDebut(), v1.getFin());
    }

    public Face getF1() {
        return f1;
    }

    public Face getF2() {
        return f2;
    }

    public Voie getV1() {
        return v1;
    }

    public Voie getV2() {
        return v2;
    }
}
