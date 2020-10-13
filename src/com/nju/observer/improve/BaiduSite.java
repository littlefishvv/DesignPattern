package com.nju.observer.improve;

/**
 * @author ：Siyuan Gao
 * @date ：Created in 2020/10/3 16:49
 * @description：观察者2
 * @modified By：
 * @version: $
 */
public class BaiduSite implements Observer {
    // 温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    // 更新 天气情况，是由 WeatherData 来调用，我使用推送模式
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    // 显示
    public void display() {
        System.out.println("***百度观察者温度: " + temperature + "***");
        System.out.println("***百度观察者气压: " + pressure + "***");
        System.out.println("***百度观察者湿度: " + humidity + "***");
    }
}
