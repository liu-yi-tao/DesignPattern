package com.exe.principle.ocp.improve;

/**
 * @create 2021-06-02 10:30
 */
public class Ocp {
    public static void main(String[] args) {
        // 使用看看存在的问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}

// 这是一个用于绘图的类 [使用方]
class GraphicEditor {
    // 接收 Shape 对象，然后根据 type，来绘制不同的图形
    public void drawShape(Shape s) {
        s.draw();
    }
}

// Shape 类，基类
abstract class Shape {
    int m_type;

    // 抽象方法
    public abstract void draw();
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制矩形 ");
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制圆形 ");
    }
}

// 新增画三角形
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制三角形 ");
    }
}

// 新增一个图形
class OtherGraphic extends Shape {
    OtherGraphic() {
        super.m_type = 4;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制其它图形 ");
    }
}