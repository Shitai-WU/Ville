package ville;

/**
 * Created by shitawu on 09/10/2014.
 */
public class Route {

    private Voie v1, v2;
    private Face f1, f2;
    private int taille;

    public Route(int i) {
        this.taille = i;
        v1 = new Voie(i);
        v2 = new Voie(i);
        f1 = new Face(v1.getEntree(), v2.getSortie());
        f2 = new Face(v2.getEntree(), v1.getSortie());
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

    public int getTaille() {
        return taille;
    }
}
