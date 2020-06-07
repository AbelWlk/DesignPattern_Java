package AbstractFactoryPattern;

/**
 * Spring按钮类：具体产品
 */
public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("显示绿色按钮。");
    }
}
