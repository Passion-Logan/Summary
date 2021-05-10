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

    private Object monitor = new Object();
    private volatile int count;

    public static void main(String[] args) throws InterruptedException {
        Test waitNotifyOddEven = new Test(0);
        new Thread(waitNotifyOddEven::printOddEven, "odd").start();
        Thread.sleep(10); //为了保证线程odd先拿到锁
        new Thread(waitNotifyOddEven::printOddEven, "even").start();
    }

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
