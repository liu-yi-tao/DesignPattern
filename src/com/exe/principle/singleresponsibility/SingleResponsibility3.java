package com.exe.principle.singleresponsibility;

/**
 * @create 2021-05-28 13:25
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle = new Vehicle2();
        vehicle.run("汽车");
        vehicle.runAir("飞机");
        vehicle.runWater("轮船");
    }
}

// 方式3的分析
// 1.这种修改方法没有对原来的类做大的修改，只是增加方法
// 2.这里虽然没有在类这个级别上遵守单一职责原则，但是在方法界别上，仍然是遵守单一职责
class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行。。。。");
    }
    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空上运行。。。。");
    }
    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水中运行。。。。");
    }
}