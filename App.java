package ville;

/**
 * Created by shitawu on 09/10/2014.
 */
public class App {
    public static void main(String[] args) throws Exception{

        Position p1 = new Position(1,1);
        Position p2 = new Position(1,2);
        Position p3 = new Position(1,3);
        Position p4 = new Position(1,4);
        Position p5 = new Position(1,5);
        Position p6 = new Position(2,1);
        Position p7 = new Position(2,2);
        Position p8 = new Position(2,3);
        Position p9 = new Position(2,4);
        Position p10 = new Position(2,5);

        Voie v1 = new Voie();
        v1.addPosition(p1);
        v1.addPosition(p2);
        v1.addPosition(p3);
        v1.addPosition(p4);
        v1.addPosition(p5);

        Voie v2 = new Voie();
        v2.addPosition(p6);
        v2.addPosition(p7);
        v2.addPosition(p8);
        v2.addPosition(p9);
        v2.addPosition(p10);

        Route r1 = new Route(v1, v2);

        //Route r1 = new Route(5);
        Route r2 = new Route(6);
        Carrefour c1 = new Carrefour(4);

        c1.getFs().add(new Face(c1.getPs().get(1), c1.getPs().get(1).getSuivantes().get(0)));
        c1.getFs().add(new Face(c1.getPs().get(3), c1.getPs().get(3).getSuivantes().get(0)));

        r1.getF1().connect(c1.getFace(1));
        r2.getF1().connect(c1.getFace(0));

        Voiture voiture1 = new Voiture("Clio1", r1.getV2().getPs().get(1));
        Voiture voiture2 = new Voiture("Clio2", r1.getV2().getPs().get(0));

        ThreadVoiture t2 = new ThreadVoiture(voiture2);
        t2.start();

        Thread.sleep(1000);

        ThreadVoiture t1 = new ThreadVoiture(voiture1);
        t1.start();

        t1.join();
        t2.join();
    }
}
