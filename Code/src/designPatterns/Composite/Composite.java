package designPatterns.Composite;

import java.util.ArrayList;

/**
 * 树枝构件
 *
 * @author wql
 * @desc Composite
 * @date 2021/5/31
 * @lastUpdateUser wql
 * @lastUpdateDesc
 * @lastUpdateTime 2021/5/31
 */
public class Composite implements Component {
    private ArrayList<Component> children = new ArrayList<>();

    @Override
    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public void operation() {
        for (Object obj : children) {
            ((Component) obj).operation();
        }
    }
}
