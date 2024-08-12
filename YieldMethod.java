class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            Thread.yield();
//          Suggests that the thread yields execution to another thread
        }
    }
}

public class YieldMethod {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread2.start();
        myThread1.start();
    }
}
