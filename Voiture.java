package ville;

/**
 * Created by shitawu on 09/10/2014.
 */
public class Voiture {

    Position p;

    public Voiture(Position p) {
        this.p = p;
        p.setisLibre(false);
    }

    public void avance() {
        if(p.getSuivante().size()==1) {
            p.setisLibre(true);
            p = p.getSuivante().get(0);
            p.setisLibre(false);
        }
    }
}
