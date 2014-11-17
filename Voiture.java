package ville;

/**
 * Created by shitawu on 09/10/2014.
 */
public class Voiture {
    private String name;
    private Position p;

    public Voiture() {

    }

    public Voiture(String n) {
        this.name = n;
    }

    public Voiture(String n, Position p) {
        this.name = n;
        this.p = p;
        p.setIsLibre(false);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return p;
    }

    public void setPosition(Position p) {
        this.p = p;
    }

    public void avance(){
        if( p.getSuivantes().size()>0) {
            p.getSuivantes().get(0).prendre();
            p.liberer();
            p = p.getSuivantes().get(0);
            System.out.println(name + " avance à la position : " + p.getX() + ", " + p.getY());
        }
    }
}
