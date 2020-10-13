package com.nju.state;

/**
 * @author ：Siyuan Gao
 * @date ：Created in 2020/10/3 11:00
 * @description：
 * @modified By：
 * @version: $
 */
public class Client {

    public static void main(String[] args) {
        RaffleActivity activity=new RaffleActivity(1);
        //进行30次测试
        for (int i = 0; i < 30; i++) {
            System.out.println("第"+(i+1)+"次抽奖");
            //参加抽奖，第一次扣积分
            activity.deductMoney();
            //第二步抽奖
            activity.raffle();

        }
    }

}
