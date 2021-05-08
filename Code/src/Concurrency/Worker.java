package Concurrency;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * 工人
 *
 * @author wql
 * @desc Worker
 * @date 2021/5/8
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/8
 */
public class Worker implements Runnable {

    private CountDownLatch downLatch;
    private String name;

    public Worker(CountDownLatch downLatch, String name) {
        this.downLatch = downLatch;
        this.name = name;
    }

    @Override
    public void run() {
        this.doWork();
        try {
            TimeUnit.SECONDS.sleep(new Random().nextInt(10));
        } catch (InterruptedException ie) {
        }
        System.out.println(this.name + "活干完了！");
        this.downLatch.countDown();

    }

    private void doWork() {
        System.out.println(this.name + "正在干活!");
    }

}
