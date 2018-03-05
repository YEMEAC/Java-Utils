package threads;

/**
 * @author Yeison Melo {@literal <mailto:yeison.melo@cabonline.com/>}
 *  * A apart of the defaul thread java creates for the execution of the program.
 * We create a second one passssing the runnable that will be executed by this new thread.
 * T.join() makes that the current thread waits to for t to finish or during
 * x smiliseconss (1000 heres)
 */

public class Main {

    public static void main(String[] args) throws InterruptedException {

        long waitingTime = 9000;
        long startTime = System.currentTimeMillis();

        Thread t = new Thread(new WorkToDo());
        t.start();

        while((System.currentTimeMillis()-startTime)<waitingTime && t.isAlive()){
            System.out.println("I'm going to wait a little bit...");
            t.join(1000);
        }

        if(t.isAlive()) {
            System.out.println("Im tired of waiting");
            t.interrupt();
        }
    }
}
