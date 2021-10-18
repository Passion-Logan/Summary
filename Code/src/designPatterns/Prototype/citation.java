package designPatterns.Prototype;

/**
 * 奖状类
 *
 * @author wql
 * @desc citation
 * @date 2021/5/11
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/11
 */
public class citation implements Cloneable {

    String name;
    String info;
    String college;

    citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
        System.out.println("奖状创建成功！");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return (this.name);
    }

    void display() {
        System.out.println(name + info + college);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("奖状拷贝成功！");
        return (citation) super.clone();
    }
}
