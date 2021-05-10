package Concurrency;

/**
 * @author wql
 * @desc Test
 * @date 2021/5/10
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/10
 */
public class Test {

    private int num;
    private static final Object LOCK = new Object();

    public static void main(String[] args) throws InterruptedException {
//        Test test = new Test();
//        new Thread(() -> test.printABC(0), "A").start();
//        new Thread(() -> test.printABC(1), "B").start();
//        new Thread(() -> test.printABC(2), "C").start();
        Test waitNotifyOddEven = new Test(0);
        new Thread(waitNotifyOddEven::printOddEven, "odd").start();
        Thread.sleep(10); //为了保证线程odd先拿到锁
        new Thread(waitNotifyOddEven::printOddEven, "even").start();
    }

    /**
     * 三个线程T1、T2、T3轮流打印ABC，打印n次，如ABCABCABCABC.......
     */
    private void printABC(int targetNum) {
        for (int i = 0; i < 10; i++) {
            synchronized (LOCK) {
                while (num % 3 != targetNum) {
                    System.out.print("-" + num + "-");
                    try {
                        LOCK.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                num++;
                System.out.print(Thread.currentThread().getName());
                LOCK.notifyAll();
            }
        }
    }

    private Object monitor = new Object();
    private volatile int count;

    Test(int initCount) {
        this.count = initCount;
    }

    /**
     * 两个线程交替打印1-100的奇偶数
     */
    private void printOddEven() {
        synchronized (monitor) {
            while (count < 100) {
                try {
                    System.out.print(Thread.currentThread().getName() + "：");
                    System.out.println(++count);
                    monitor.notifyAll();
                    monitor.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //防止count=100后，while()循环不再执行，有子线程被阻塞未被唤醒，导致主线程不能退出
            monitor.notifyAll();
        }
    }


}
