class Counter{
    public int count = 0;

//    public synchronized void increment(){
//        count++;
//    }
//      Synchronization of a method

    public void increment(){
        synchronized(this){
            count++;
        }
        //      Synchronization of a block

    }

    public int getCount() {
        return count;
    }
}

class MyThread extends Thread {
    private Counter counter;
    public MyThread(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run(){
        for(int i=1; i<=1000; i++){
            counter.increment();
        }
    }
}

public class Synchronization {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        MyThread myThread1 = new MyThread(counter);
        MyThread myThread2 = new MyThread(counter);

        myThread1.start();
        myThread2.start();

        myThread1.join();
        myThread2.join();

        System.out.println(counter.getCount());
    }
}
