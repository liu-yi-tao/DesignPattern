package com.exe.principle.singleresponsibility;

/**
 * @author Mikiyo
 * @create 2021-05-28 10:38
 */
public class SingleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }

}

// 交通工具类
// 方式1
// 1.在方式1 的run方法中，违反了单一责任原则
// 2.解决的方案：根据交通工具运行的方式不同，分解成不通类即可
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行。。。。");
    }
}
