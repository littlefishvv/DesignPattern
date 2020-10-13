package com.nju.observer.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Siyuan Gao
 * @date ：Created in 2020/10/3 16:54
 * @description：
 * @modified By：
 * @version: $
 */
public class WeatherData implements Subject {
    private float temperatrue;
    private float pressure;
    private float humidity;
    //要维护一个观察者列表
    private List<Observer> observerList;
    //构造方法
    public WeatherData(){
        observerList=new ArrayList<Observer>();
    }
    //注册观察者
    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }
    //移除观察者
    @Override
    public void removeObserver(Observer o) {
        if (observerList.contains(o))
            observerList.remove(o);
    }
    //通知所有的观察者
    @Override
    public void notifyObserver() {
        for(Observer observer:observerList){
            observer.update(getTemperatrue(),getPressure(),getHumidity());
        }
    }
    //把三个set方法统一为一个setData，并在这里面调用nitifyObserver方法，这样当气温通过这个方法改变时，就通知了所有的观察者
    public void setData(float temperature,float pressure,float humidity){
        this.temperatrue = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        //调用dataChange， 将最新的信息 推送给 接入方 currentConditions
//		dataChange();
        notifyObserver();
    }
    public float getTemperatrue() {
        return temperatrue;
    }


    public float getPressure() {
        return pressure;
    }


    public float getHumidity() {
        return humidity;
    }


    public List<Observer> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }
}
