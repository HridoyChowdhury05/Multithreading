
public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello and welcome!");
//        System.out.println(Thread.currentThread().getName());

        World world = new World();
        Thread thread = new Thread(world);
        thread.start();

        for( ; ; ){
//            System.out.println("MainFunction");
            System.out.println(Thread.currentThread().getName());
        }
    }
}