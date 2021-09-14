package frogLogic;

public class CPUKiller extends  Thread {
    private  int i =200;
    @Override
    public void run() {
        coma(i);
    }
    private  int coma (int i) {
        return coma(i-1)+(i-2);
    }
}
