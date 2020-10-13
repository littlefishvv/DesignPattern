package com.nju.observer.improve;

/**
 * @author ：Siyuan Gao
 * @date ：Created in 2020/10/3 17:06
 * @description：
 * @modified By：
 * @version: $
 */
public class Client {
    public static void main(String[] args) {
        Observer o1=new CurrentConditions();
        Observer o2=new BaiduSite();
        WeatherData weatherData=new WeatherData();
        weatherData.registerObserver(o1);
        weatherData.registerObserver(o2);
        weatherData.setData(10f,20f,40f);
        //温度发生了改变
        System.out.println("---------------温度发生了改变------------");
        weatherData.setData(20f,15f,22f);


    }
}
