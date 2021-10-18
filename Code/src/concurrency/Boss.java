package concurrency;

import java.util.concurrent.CountDownLatch;

/**
 * 老板
 *
 * @author wql
 * @desc Boss
 * @date 2021/5/8
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/8
 */
public class Boss implements Runnable {

    private CountDownLatch downLatch;

    public Boss(CountDownLatch downLatch) {
        this.downLatch = downLatch;
    }

    @Override
    public void run() {
        System.out.println("老板正在等所有的工人干完活......");
        try {
            this.downLatch.await();
        } catch (InterruptedException e) {
        }
        System.out.println("工人活都干完了，老板开始检查了！");
    }

}
