public class creatThread {
    private static class MyThread extends Thread{

        @Override
        public void run() {
            System.out.println("这是线程运行的代码");
        }
    }

    private static class MyRunnable implements Runnable{
        public MyRunnable(String nihao) {
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+"这里是线程运行的代码");
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        MyRunnable myRunnable = new MyRunnable("nihao");
        Thread thread = new Thread(myRunnable);
        thread.start();

        MyThread myThread2 = new MyThread();
        Thread thread1 = new Thread(myThread2);
        thread1.start();

        Thread t1=new Thread("你好");
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        System.out.println(t1.getState());
        System.out.println(t1.isAlive());
    }
}
