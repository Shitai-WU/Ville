package ville;

import java.util.ArrayList;

/**
 * Created by shitawu on 20/11/2014.
 */
public class ThreadGestionnaire extends Thread {
    ArrayList<Face> fs;

    public ThreadGestionnaire(ArrayList<Face> fs) {
        this.fs = fs;
    }

    public void run() {
        try {
            while(!interrupted()) {
                sleep(5000);
                for(int i = 0; i<fs.size();i++) {
                    fs.get(i).getSortie().changeFeu();
                }
            }
        }
        catch (Exception e) {e.printStackTrace();}
    }
}
