class MyThread extends Thread{
    @Override
    public void run() {
        for (int i=1; i<=5 ; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}

public class Method {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(myThread.getState());
        myThread.join();
        
    }
}
