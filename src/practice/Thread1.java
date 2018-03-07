package practice;

/**
 * created by xdCao on 2018/3/5
 */

public class Thread1 extends Thread{

    @Override
    public void run() {
        try {
            while (true){
                if (Thread.currentThread().isInterrupted()){
                    System.out.println("interrupted!");
                    Thread.currentThread().stop();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Thread1 thread1=new Thread1();
        thread1.start();
        thread1.interrupt();
    }

}
