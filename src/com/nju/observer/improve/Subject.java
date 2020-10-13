package com.nju.observer.improve;

/**
 * @author ：Siyuan Gao
 * @date ：Created in 2020/10/3 16:52
 * @description：接口，让weatherDdata实现
 * @modified By：
 * @version: $
 */
public interface Subject {
    //有三个方法
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
