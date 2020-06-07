package AbstractFactoryPattern;

/**
 * Summer按钮类：具体产品
 */
public class SummerButton implements Button {
    @Override
    public void display() {
        System.out.println("显示蓝色按钮。");
    }
}
