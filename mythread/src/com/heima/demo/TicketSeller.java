package com.heima.demo;

/**
 * @ClassName MyRunnable
 * @Description MyRunnable
 * @Author AsuraTu
 * @Date 2024/9/19
 */
public class TicketSeller implements Runnable {
    // 总票数
    private static final int TOTAL_TICKETS = 100;
    // 剩余票数
    private static int tickets = TOTAL_TICKETS;
    // 当前轮到的售票员
    private static int currentTurn = 1;
    // 售票员编号（每个线程有自己的编号）
    private final int sellerId;

    public TicketSeller(int sellerId) {
        this.sellerId = sellerId;
    }

    @Override
    public void run() {
        do {
            sellTicket();
        } while (tickets > 0);
    }

    // 同步的售票方法，保证线程安全
    private synchronized void sellTicket() {
        // 检查当前是否轮到该售票员
        if (tickets > 0 && sellerId == currentTurn) {
            System.out.println("售票员" + sellerId + " 卖出一张票，剩余票数：" + --tickets);
            try {
                // 模拟售票的延迟
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                return;
            }

            // 转到下一个售票员
            // 轮流切换到下一个售票员
            currentTurn = (currentTurn % 3) + 1;
        }

        // 当票卖完后，结束所有线程
        if (tickets <= 0) {
            System.out.println("票已售罄");
            System.exit(0);
        }
    }
}
