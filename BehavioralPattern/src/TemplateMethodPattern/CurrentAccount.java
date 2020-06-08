package TemplateMethodPattern;

public class CurrentAccount extends Account {
    @Override
    public void CalculateInterest() {
        System.out.println("按活期利率计算利息！");
    }
}
