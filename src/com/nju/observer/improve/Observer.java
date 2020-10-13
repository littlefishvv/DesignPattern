package com.nju.observer.improve;

/**
 * @author ：Siyuan Gao
 * @date ：Created in 2020/10/3 16:44
 * @description：
 * @modified By：
 * @version: $
 */
public interface Observer {
    void update(float temperature,float pressure,float humidity);
}
