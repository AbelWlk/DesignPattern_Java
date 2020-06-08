package PrototypePattern;

import java.util.Hashtable;

/**
 * 原型管理器（使用饿汉式单例实现）
 */
public class PrototypeManager {

    //定义一个Hashtable，用于存储原型对象
    private Hashtable<String, OfficialDocument> ht = new Hashtable<String, OfficialDocument>();

    private static PrototypeManager pm = new PrototypeManager();

    //为Hashtable增加公文对象
    private PrototypeManager() {
        ht.put("far", new FAR());
        ht.put("srs", new SRS());
    }

    //增加新的公文对象
    public void addOfficialDocument(String key, OfficialDocument doc) {
        ht.put(key, doc);
    }

    //通过浅克隆获取新的公文对象
    public OfficialDocument  getOfficialDocument(String key){
        return ht.get(key).clone();
    }

    //获取PrototypeManager
    public static PrototypeManager  getPrototypeManager() {
        return pm;
    }
}
