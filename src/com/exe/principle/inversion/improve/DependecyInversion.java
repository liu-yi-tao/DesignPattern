package com.exe.principle.inversion.improve;

/**
 * @create 2021-05-31 15:46
 */
public class DependecyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());

        person.receive(new WeiXin());
    }
}

// 定义接口
interface IReceiver {
    public String getInfo();
}

class Email implements IReceiver {
    @Override
    public String getInfo() {
        return "电子邮件信息： Hello world";
    }
}

// 增加微信
class WeiXin implements IReceiver {
    @Override
    public String getInfo() {
        return "微信消息： Hello ok!";
    }
}

// 方式2
class Person {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}