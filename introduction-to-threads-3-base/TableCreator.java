

public class TableCreator implements Runnable {
    public int x;

    public TableCreator(int x){
        this.x = x;
    }

    @Override
    public void run() {
        for (int i=1; i<=10; i++){
            System.out.println(x+" times "+i+" is "+x*i);
        }
    }
}
