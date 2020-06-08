package TemplateMethodPattern;

public class Client {
    public static void main(String[] args) {
        Account account;
        account= (Account) XMLUtil.getBean();
        account.Handle("张无忌","123456");
    }
}
