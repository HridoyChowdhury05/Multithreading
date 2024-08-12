public class World implements Runnable{
    @Override
    public void run() {
        for( ; ; ){
//            System.out.println("ThreadFunction");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
