class MyThread extends Thread {
    public MyThread(String abc) {
        super(abc);
    }

    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority());
        }
    }
}

public class SetPriorityMethod {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("ABC");
        MyThread t2 = new MyThread("BAC");
        MyThread t3 = new MyThread("CBA");

        t1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        t2.setPriority(Thread.NORM_PRIORITY); // Priority 5
        t3.setPriority(Thread.MAX_PRIORITY); // Priority 10

        t1.start();
        t2.start();
        t3.start();
    }
}
