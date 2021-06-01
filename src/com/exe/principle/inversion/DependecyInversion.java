package com.exe.principle.inversion;

/**
 * @create 2021-05-31 15:46
 */
public class DependecyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息： Hello world";
    }
}

// 完成 Person 接受消息功能
// 方式1 完成
// 1. 简单，比较容易想到
// 2. 如果我们获取的对象是 微信，短信等等，则新新增l类，同时Person也要新增相应的接收方法
// 3.解决思路：引用一个抽象的接口 IReceiver，表示接收者，这样 Person 类与接口 IReceiver 发生依赖
//   因为 Email，Weixin 等等属于接收的范围，他们各自实现 IReceiver，这样我们符合依赖倒转原则
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}