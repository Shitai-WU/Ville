package ville;

/**
 * Created by shitawu on 09/10/2014.
 */
public class App {
    public static void main(String[] args) throws Exception{

        Route r1 = new Route(5);
        for(int i=0;i<r1.getTaille();i++) {
            r1.getV1().getPs().get(i).setPosition(0, (r1.getTaille()- 1 - i));
            r1.getV2().getPs().get(i).setPosition(1, i);
        }

        Route r2 = new Route(6);
        for(int i=0;i<r2.getTaille();i++) {
            r2.getV1().getPs().get(i).setPosition(i + 2, 5);
            r2.getV2().getPs().get(i).setPosition(r2.getTaille() + 1 - i, 6);
        }

        Carrefour c1 = new Carrefour(4);
        c1.getPs().get(0).setPosition(0, 5);
        c1.getPs().get(1).setPosition(1, 5);
        c1.getPs().get(2).setPosition(1, 6);
        c1.getPs().get(3).setPosition(0, 6);

        c1.getFs().add(new Face(c1.getPs().get(1), c1.getPs().get(0)));
        c1.getFs().add(new Face(c1.getPs().get(2), c1.getPs().get(1)));

        r1.getF1().connect(c1.getFace(0));
        r2.getF1().connect(c1.getFace(1));

        Voiture voiture1 = new Voiture("Clio1", r1.getV2().getPs().get(0));
        Voiture voiture2 = new Voiture("Clio2", r2.getV2().getPs().get(0));

        ThreadVoiture t1 = new ThreadVoiture(voiture1);
        t1.start();

        ThreadVoiture t2 = new ThreadVoiture(voiture2);
        t2.start();

        t1.join();
        t2.join();
    }
}
