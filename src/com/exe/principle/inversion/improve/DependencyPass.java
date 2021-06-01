package com.exe.principle.inversion.improve;

/**
 * @create 2021-06-01 15:48
 */
public class DependencyPass {
    public static void main(String[] args) {
        // 方式1
        /*ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(changHong);*/

        // 方式2
        /*ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose(changHong);
        openAndClose.open();*/

        // 方式3
        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(changHong);
        openAndClose.open();
    }
}

// 方式1：通过接口传递实现依赖
// 开关的接口
/*interface IOpenAndClose {
    // 抽象方法，接收接口
    public void open(ITV tv);
}

interface ITV {
    public void play();
}

// 实现接口
class OpenAndClose implements IOpenAndClose {
    @Override
    public void open(ITV tv) {
        tv.play();
    }
}

class ChangHong implements ITV {
    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }
}*/

// 方式2： 通过构造方法依赖传递
/*
interface IOpenAndClose {
    // 抽象方法
    public void open();
}

// ITV 接口
interface ITV {
    public void play();
}

class OpenAndClose implements IOpenAndClose {
    // 成员
    public ITV tv;

    // 构造器
    public OpenAndClose(ITV tv) {
        this.tv = tv;
    }

    public void open() {
        this.tv.play();
    }
}

class ChangHong implements ITV {
    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }
}*/

// 方式3： 通过 setter 方式传递
interface IOpenAndClose {
    // 抽象方法
    public void open();

    public void setTv(ITV tv);
}

// ITV 接口
interface ITV {
    public void play();
}

class OpenAndClose implements IOpenAndClose {
    private ITV tv;

    @Override
    public void setTv(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}

class ChangHong implements ITV {
    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }
}