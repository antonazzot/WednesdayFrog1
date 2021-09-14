package Main;

import frogLogic.FrogEngine;

public class StartMain {
    public static void main(String[] args) {
       FrogEngine frogEngine = new FrogEngine();
        Thread t = new Thread(frogEngine);
        t.start();
    }
}
