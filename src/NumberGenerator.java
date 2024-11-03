public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10 ; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i +
                        " - hashCode: " + this.hashCode());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + Thread.currentThread().getName() + "is interrupted.");
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " done.");
    }
}
