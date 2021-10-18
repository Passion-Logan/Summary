package designPatterns.Prototype;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 原型模式计算面积
 *
 * @author wql
 * @desc ProtoTypeShape
 * @date 2021/5/11
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/11
 */
public class ProtoTypeShape {

    public static void main(String[] args) {
        ProtoTypeManager pm = new ProtoTypeManager();
        Shape obj1 = pm.getShape("Circle");
        obj1.countArea();
        Shape obj2 = pm.getShape("Square");
        obj2.countArea();
    }
}

class ProtoTypeManager {
    private HashMap<String, Shape> ht = new HashMap<>();

    public ProtoTypeManager() {
        ht.put("Circle", new Circle());
        ht.put("Square", new Square());
    }

    public void addshape(String key, Shape obj) {
        ht.put(key, obj);
    }

    public Shape getShape(String key) {
        Shape temp = ht.get(key);
        return (Shape) temp.clone();
    }
}

interface Shape extends Cloneable {
    Object clone();    //拷贝

    void countArea();    //计算面积
}

class Circle implements Shape {
    @Override
    public Object clone() {
        Circle w = null;
        try {
            w = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝圆失败!");
        }
        return w;
    }

    @Override
    public void countArea() {
        int r = 0;
        System.out.print("这是一个圆，请输入圆的半径：");
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
        System.out.println("该圆的面积=" + 3.1415 * r * r + "\n");
    }
}

class Square implements Shape {
    @Override
    public Object clone() {
        Square b = null;
        try {
            b = (Square) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝正方形失败!");
        }
        return b;
    }

    @Override
    public void countArea() {
        int a = 0;
        System.out.print("这是一个正方形，请输入它的边长：");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println("该正方形的面积=" + a * a + "\n");
    }
}