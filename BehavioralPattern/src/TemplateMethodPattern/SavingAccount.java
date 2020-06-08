package TemplateMethodPattern;

public class SavingAccount extends Account {
    @Override
    public void CalculateInterest() {
        System.out.println("按定期利率计算利息！");
    }
}
