package threads;

/**
 * @author Yeison Melo {@literal <mailto:yeison.melo@cabonline.com/>}
 * Runnable reprensents a piece of work to be exceuted by a thread.
 * The work executed is whiting run method
 */

public class WorkToDo implements Runnable {

    private final int  TIMES_TO_REPEAT_WORK = 10;
    private final long  SLEEP_TIME = 1000;

    @Override
    public void run() {
        for(int i=0; i<TIMES_TO_REPEAT_WORK; ++i){
            System.out.println(Thread.currentThread().getName() + " still working");
            try {
                Thread.sleep(SLEEP_TIME);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + ": I wasn't finished!");
                System.exit(1);
            }
        }
    }


}
