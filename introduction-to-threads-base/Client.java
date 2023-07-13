public class Client {
    public static void main(String[] args) {
        System.out.println("I am the main class");
        Adder adds = new Adder();
        ScalerThread t1 = new ScalerThread(adds); ///Passing task to thread which it will have to run.
        t1.start();

        Subtractor sub = new Subtractor();
        ScalerThread t2 = new ScalerThread(sub); ///Passing task to thread which it will have to run.
        t2.start();

    }
}
