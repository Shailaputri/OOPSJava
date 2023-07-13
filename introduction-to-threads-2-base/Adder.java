public class Adder implements Runnable{
    int total;

    Adder(int a, int b){
        this.total = a+b;

    }

    @Override
    public void run() {
        System.out.println(this.total);
    }

}
