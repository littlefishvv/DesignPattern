package com.nju.observer.improve;

/**
 * @author ：Siyuan Gao
 * @date ：Created in 2020/10/3 16:46
 * @description：观察者1
 * @modified By：
 * @version: $
 */
public class CurrentConditions implements  Observer {
    private float temperature;
    private float pressure;
    private float humidity;
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        display();
    }
    public void display(){
        System.out.println("***Today mTemperature: " + temperature + "***");
        System.out.println("***Today mPressure: " + pressure + "***");
        System.out.println("***Today mHumidity: " + humidity + "***");
    }

}
