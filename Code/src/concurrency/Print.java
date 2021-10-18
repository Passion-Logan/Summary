package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName: Print
 * 三个线程T1、T2、T3轮流打印ABC，打印n次，如ABCABCABCABC.......
 *
 * @author WQL
 * @Description:
 * @date: 2021/5/10 22:25
 * @since JDK 1.8
 */
public class Print {

    private int num;
    private static final Object LOCK = new Object();
    private Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        Print print = new Print();

        new Thread(() -> print.PrintABC(0), "A").start();
        new Thread(() -> print.PrintABC(1), "B").start();
        new Thread(() -> print.PrintABC(2), "C").start();


        new Thread(() -> print.PrintABCByLock(0), "A").start();
        new Thread(() -> print.PrintABCByLock(1), "B").start();
        new Thread(() -> print.PrintABCByLock(2), "C").start();

    }

    public void PrintABC(int target) {
        for (int i = 0; i < 10; i++) {
            synchronized (LOCK) {
                while (num % 3 != target) {
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

    public void PrintABCByLock(int target) {
        for (int i = 0; i < 10; ) {
            lock.lock();

            if (num % 3 == target) {
                num++;
                i++;
                System.out.print(Thread.currentThread().getName());
            }
            lock.unlock();
        }
    }
}
