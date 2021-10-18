package designPatterns.Prototype;

/**
 * 原型模式
 * 用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象。
 *
 * <p>
 * 原型模式的优点：
 * Java 自带的原型模式基于内存二进制流的复制，在性能上比直接 new 一个对象更加优良。
 * 可以使用深克隆方式保存对象的状态，使用原型模式将对象复制一份，并将其状态保存起来，简化了创建对象的过程，
 * 以便在需要的时候使用（例如恢复到历史某一状态），可辅助实现撤销操作。
 * <p>
 * 原型模式的缺点：
 * 需要为每一个类都配置一个 clone 方法
 * clone 方法位于类的内部，当对已有类进行改造的时候，需要修改代码，违背了开闭原则。
 * 当实现深克隆时，需要编写较为复杂的代码，而且当对象之间存在多重嵌套引用时，为了实现深克隆，每一层对象对应的类都必须支持深克隆，
 * 实现起来会比较麻烦。因此，深克隆、浅克隆需要运用得当。
 *
 * @author wql
 * @desc Main
 * @date 2021/5/11
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/11
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        citation obj1 = new citation("张三", "同学：在2016学年第一学期中表现优秀，被评为三好学生。", "韶关学院");
        obj1.display();
        citation obj2 = (citation) obj1.clone();
        obj2.setName("李四");
        obj2.display();

        System.out.println(obj1.equals(obj2));
    }
}
