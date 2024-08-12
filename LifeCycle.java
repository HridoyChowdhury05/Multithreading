class ThreadLife extends Thread{
    @Override
    public void run(){
        System.out.println("RUNNING");
        try {
            System.out.println("in ThreadLife class : 'run' Method");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class LifeCycle {
    public static void main(String[] args) throws InterruptedException {
        ThreadLife threadLife = new ThreadLife();
        System.out.println(threadLife.getState());
        threadLife.start();
        System.out.println(threadLife.getState());

        System.out.println(Thread.currentThread().getState());

        Thread.sleep(100);
        System.out.println(threadLife.getState());
        threadLife.join();
        System.out.println(threadLife.getState());
    }
}