package AbstractFactoryPattern;

import AbstractFactoryPattern.utils.XMLUtil;

/**
 * 客户端测试
 */
public class Client {
    public static void main(String[] args) {

        SkinFactory skinFactory;

        Button button;
        TextField textField;
        ComboBox comboBox;

        skinFactory = (SkinFactory) XMLUtil.getBean();
        assert skinFactory != null;
        button = skinFactory.createButton();
        textField = skinFactory.createTextField();
        comboBox = skinFactory.createComboBox();
        button.display();
        textField.display();
        comboBox.display();
    }
}
