package ville;

/**
 * Created by shitawu on 16/10/2014.
 */
public class Face {

    private Position pEntree, pSortie;

    public Face(Position pEntree, Position pSortie) {
        this.pEntree = pEntree;
        this.pSortie = pSortie;
    }

    public void connect(Face f) {
        f.getSortie().addPositionSuivante(pEntree);
        pSortie.addPositionSuivante(f.getEntree());
    }

    public Position getEntree() { return pEntree; }

    public Position getSortie() { return pSortie; }

}
