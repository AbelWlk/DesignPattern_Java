package SimpleFactoryPattern;

public class SimpleFactoryPatternTest {
    public static void main(String[] args) {
        Chart chart;
        chart=ChartFactory.getChart("pie");
        chart.display();
    }
}
