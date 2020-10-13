package com.nju.state;

/**
 * @author ：Siyuan Gao
 * @date ：Created in 2020/10/3 9:26
 * @description：状态抽象类
 * @modified By：
 * @version: $
 */
public abstract class State  {
    //扣除积分 -50
    public abstract void deductMoney();
    //是否抽中奖品
    public abstract boolean raffle();
    //发放奖品
    public abstract void dispensePrize();
}
