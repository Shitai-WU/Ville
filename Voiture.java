package ville;

/**
 * Created by shitawu on 09/10/2014.
 */
public class Voiture {
    private String name;
    private Position p;

    public Voiture(String n, Position p) {
        this.name = n;
        this.p = p;
        p.setIsLibre(false);
    }

    public void avance(){
        if( p.getSuivantes().size()>0) {
            p.getSuivantes().get(0).prendre();
            p.liberer();
            p = p.getSuivantes().get(0);
            System.out.println(name + " roule sur la position : " + p.getX() + ", " + p.getY());
        }
    }

    public Position getPosition() {
        return p;
    }
}
