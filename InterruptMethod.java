class MyThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i=1; i<=5 ; i++) {
                System.out.println(i + " ");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class InterruptMethod {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        myThread.start();
        myThread.interrupt();
    }
}
