import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Run1 implements Runnable {
    public static int a = 1;
    private int i = 0;
    public static int tmp = 1;

    Run1(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        if (i == 1) {
            try {
                Thread.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            a += 1;
        } else {
            // int times = 0;
            while (true) {
                try {
                    // Thread.sleep(1000);
                    // times++;
                    System.out.println(a);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            // Run1 t = new Run1(i);
            // new Thread(t).start();
            exec.execute(new Run1(i));
        }
        try{
            TimeUnit.SECONDS.sleep(3);
        }catch(Exception e){
            
        }
        exec.shutdownNow();
        System.out.println("start");
    }
}