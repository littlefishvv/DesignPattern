package com.nju.state;

import java.util.Random;

/**
 * @author ：Siyuan Gao
 * @date ：Created in 2020/10/3 9:40
 * @description：可以抽奖的状态
 * @modified By：
 * @version: $
 */
public class CanRaffleState extends State {

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity) {
        this.activity = activity;
    }
    @Override
    public void deductMoney() {
        System.out.println("已经扣除了积分");
    }
    //可以抽奖，抽完奖后根据实际情况改成新的抓状态
    @Override
    public boolean raffle() {
        System.out.println("正在抽奖");
        //10%的中奖率
        Random r=new Random();
        int num=r.nextInt(10);
        if(num==0){
            //中奖了，状态改为可以发放奖品

            activity.setState(activity.getDispenseState());
            return true;
        }
        else{
            System.out.println("很遗憾没有中奖");
            //改变状态为不能抽奖

            activity.setState(activity.getNoRaffleState());
            return false;
        }


    }
    //这只是抽奖状态，并不能发放奖品
    @Override
    public void dispensePrize() {
        System.out.println("没中奖，不能发放奖品");
    }
}
