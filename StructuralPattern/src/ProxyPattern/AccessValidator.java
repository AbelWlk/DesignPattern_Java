package ProxyPattern;

/**
 * 身份验证类，业务类，它提供方法Validate()来实现身份验证。
 */
public class AccessValidator {

    //模拟实现登录验证
    public Boolean Validate(String userId) {
        System.out.println("在数据库中验证用户'" + userId + "'是否是合法用户？");
        if (userId.equals("杨过")) {
            System.out.println(userId + "登录成功！");
            return true;
        } else {
            System.out.println(userId + "登陆失败！");
            return false;
        }
    }
}
