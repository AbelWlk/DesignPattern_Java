package FactoryMethodPattern;

import FactoryMethodPattern.utils.XMLUtil;

import javax.jws.soap.SOAPBinding;

/**
 * 客户端测试代码
 */
public class Client {
    public static void main(String[] args) {
        UseClass();
        UseReflection();
    }

    public static void UseClass() {
        LoggerFactory factory;
        Logger logger;
        factory = new FileLoggerFactory();
        logger = factory.createLogger();
        logger.writeLog();
    }

    public static void UseReflection() {
        LoggerFactory factory;
        Logger logger;
        factory = (LoggerFactory) XMLUtil.getBean();
        assert factory != null;
        logger = factory.createLogger();
        logger.writeLog();
    }
}
