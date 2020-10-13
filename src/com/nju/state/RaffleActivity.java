package com.nju.state;

/**
 * @author ：Siyuan Gao
 * @date ：Created in 2020/10/3 9:32
 * @description：
 * @modified By：
 * @version: $
 */
public class RaffleActivity {
    State state = null;
    //奖品数量
    int count=0;
    // 四个属性，表示四种状态  这里要传入this activity以便状态调用actvity进而进行setState改变状态，而改变状态又通过activity的方法调用状态的方法
    //从而实现改变值状态的同时改变下行为，这里和策略模式就有极大的不同，策略模式只有context引用策略，而状态模式的按查tivity引用state，而state也要引用activity
    State noRaffleState=new NoRaffleState(this);
    State canRaffleState=new CanRaffleState(this);
    State dispenseState=new DispenseState(this);
    State dispenseOutState=new DispenseOutState(this);


    //构造器
    //1. 初始化当前的状态为 noRafflleState（即不能抽奖的状态）
    //2. 初始化奖品的数量
    public RaffleActivity(int count){
        this.state=getNoRaffleState();
        this.count=count;
    }
    //扣分, 调用当前状态的 deductMoney  这个类稳托状态类活动，状态改变了，那么行为也就改变了
    public void deductMoney(){
        state.deductMoney();
    }
    //抽奖
    public void raffle(){
        if(state.raffle()){
            state.dispensePrize();
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        int curCount=count;
        count--;
        return curCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(State dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }
}