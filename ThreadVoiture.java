package ville;

/**
 * Created by shitawu on 23/10/2014.
 */
public class ThreadVoiture extends Thread {
    Voiture v;

    public ThreadVoiture(Voiture v) {
        this.v = v;
    }

    public void run() {
        try {
            while(!interrupted()) {
                v.avance();
                sleep(1000);
            }
        }
        catch (Exception e) {e.printStackTrace();}
    }
}
