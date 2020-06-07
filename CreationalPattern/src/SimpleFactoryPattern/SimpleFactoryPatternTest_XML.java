package SimpleFactoryPattern;

import SimpleFactoryPattern.utils.XMLUtil;

public class SimpleFactoryPatternTest_XML {
    public static void main(String[] args) {
        Chart chart;
        String type = XMLUtil.getChartType(); //读取配置文件中的参数
        System.out.println(type);
        chart = ChartFactory.getChart(type); //创建产品对象
        chart.display();
    }
}
