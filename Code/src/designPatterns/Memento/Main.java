package designPatterns.Memento;

import java.util.Stack;

/**
 * 备忘录模式:
 * 在不破坏封装性的前提下，获取并保存一个对象的内部状态，以便以后恢复它。
 * <p>
 * 备忘录模式是一种对象行为型模式，其主要优点如下。
 * 提供了一种可以恢复状态的机制。当用户需要时能够比较方便地将数据恢复到某个历史的状态。
 * 实现了内部状态的封装。除了创建它的发起人之外，其他对象都不能够访问这些状态信息。
 * 简化了发起人类。发起人不需要管理和保存其内部状态的各个备份，所有状态信息都保存在备忘录中，并由管理者进行管理，这符合单一职责原则。
 * <p>
 * 其主要缺点是：资源消耗大。如果要保存的内部状态信息过多或者特别频繁，将会占用比较大的内存资源。
 * <p>
 * 备忘录模式的主要角色如下。
 * 发起人（Originator）角色：记录当前时刻的内部状态信息，提供创建备忘录和恢复备忘录数据的功能，实现其他业务功能，它可以访问备忘录里的所有信息。
 * 备忘录（Memento）角色：负责存储发起人的内部状态，在需要的时候提供这些内部状态给发起人。
 * 管理者（Caretaker）角色：对备忘录进行管理，提供保存与获取备忘录的功能，但其不能对备忘录的内容进行访问与修改。
 *
 * @author wql
 * @desc Main
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class Main {

    public static void main(String[] args) {
        Stack states = new Stack<StarMemento>();

        Star star = new Star(StarType.SUN, 10000000, 500000);
        System.out.println(star.toString());
        states.add(star.getMemento());
        star.timePasses();
        System.out.println(star.toString());
        states.add(star.getMemento());
        star.timePasses();
        System.out.println(star.toString());
        states.add(star.getMemento());
        star.timePasses();
        System.out.println(star.toString());
        states.add(star.getMemento());
        star.timePasses();
        System.out.println(star.toString());
        while (states.size() > 0) {
            star.setMemento((StarMemento) states.pop());
            System.out.println(star.toString());
        }
    }
}
