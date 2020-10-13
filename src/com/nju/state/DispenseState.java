package com.nju.state;

/**
 * @author ：Siyuan Gao
 * @date ：Created in 2020/10/3 9:52
 * @description：发放奖品的状态
 * @modified By：
 * @version: $
 */
public class DispenseState extends State {
    // 初始化时传入活动引用，发放奖品后改变其状态
    RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }
    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {

       if(activity.getCount()>0){
           System.out.println("恭喜中奖了");
           activity.setState(activity.getNoRaffleState());
       }else{
           System.out.println("很遗憾奖品发完了");
           activity.setState(activity.getDispenseState());
       }
    }
}
