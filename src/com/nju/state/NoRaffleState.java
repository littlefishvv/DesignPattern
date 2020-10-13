package com.nju.state;

/**
 * @author ：Siyuan Gao
 * @date ：Created in 2020/10/3 9:26
 * @description：不能抽奖的状态
 * @modified By：
 * @version: $
 */
public class NoRaffleState extends State {

    //初始化时传入活动的引用，以便改变其状态，这是和策略模式最大的不同
    RaffleActivity raffleActivity;

    public NoRaffleState(RaffleActivity raffleActivity){
        this.raffleActivity=raffleActivity;
    }

    //当前状态可扣除积分，扣除后转为可以抽奖的状态
    @Override
    public void deductMoney() {
        System.out.println("扣除50积分成功，您可以抽奖了！");
        //然后转为可抽奖的状态
        //这里的setState不要再去new了。要从activity中直接get
        raffleActivity.setState(raffleActivity.getCanRaffleState());
    }

    @Override
    public boolean raffle() {
        System.out.println("需要扣除积分后才能抽奖噢");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
