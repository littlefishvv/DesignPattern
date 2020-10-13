package com.nju.state;

/**
 * @author ：Siyuan Gao
 * @date ：Created in 2020/10/3 10:49
 * @description：奖品发放完的状态
 * @modified By：
 * @version: $
 */
public class DispenseOutState extends  State {
    // 初始化时传入活动引用
    RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }
    //这个状态不会转变为其他状态
    @Override
    public void deductMoney() {
        System.out.println("奖品发送完了，请下次再参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了，请下次再参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发送完了，请下次再参加");
    }
}
