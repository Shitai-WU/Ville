package ville;

/**
 * Created by shitawu on 09/10/2014.
 */
public class App {
    public static void main(String[] args) {

        Route r1 = new Route(5);
        Route r2 = new Route(6);
        Carrefour c1 = new Carrefour(4);
        c1.getFs().add(new Face(c1.getPs().get(1), c1.getPs().get(1).getSuivante().get(0)));
        c1.getFs().add(new Face(c1.getPs().get(3), c1.getPs().get(3).getSuivante().get(0)));
        r1.getF1().connect(c1.getFace(1));
        r2.getF1().connect(c1.getFace(0));

        Voiture v1 = new Voiture(new Position());


    }
}
