public class Main {
    public static void main(String[] args) {
        //criando threads contadoras
        ThreadContadora t1 = new ThreadContadora("thread1");
        ThreadContadora t2 = new ThreadContadora("thread2");
        ThreadContadora t3 = new ThreadContadora("thread3");

        ThreadContadorainterface tci1 = new ThreadContadorainterface("threadd1");//usando da interface
        Thread tc1 = new Thread(tci1);

        //executando as threads
        t1.start();
        t2.start();
        t3.start();

        tc1.start();


    }
}
