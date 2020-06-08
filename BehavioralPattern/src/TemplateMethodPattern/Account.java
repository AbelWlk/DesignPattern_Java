package TemplateMethodPattern;

abstract class Account {
    public Boolean Validate(String account, String password) {
        System.out.println("账号：" + account);
        System.out.println("密码：" + password);
        return account.equals("张无忌") && password.equals("123456");
    }

    //基本方法——抽象方法
    public abstract void CalculateInterest();

    //基本方法——具体方法
    public void Display() {
        System.out.println("显示利息！");
    }

    //模板方法
    public void Handle(String account, String password) {
        if (!Validate(account, password)) {
            System.out.println("账号或密码错误！");
            return;
        }
        CalculateInterest();
        Display();
    }
}
