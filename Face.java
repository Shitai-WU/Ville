package ville;

/**
 * Created by shitawu on 16/10/2014.
 */
public class Face {

    private Position pEntree, pSortie;

    public Face(Position pEntree1, Position pSortie1) {
        this.pEntree = pEntree;
        this.pSortie = pSortie;
    }

    public void connect(Face f) {
        f.getSortie().addPosition(pEntree);
        pSortie.addPosition(f.getEntree());
    }

    public Position getEntree() { return pEntree; }

    public Position getSortie() { return pSortie; }

}
