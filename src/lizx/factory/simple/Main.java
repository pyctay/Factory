package lizx.factory.simple;

/**
 * 简单工厂测试主类
 */
public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();
        Car benZ = factory.getCar("BenZ");
        benZ.drive();
        Car bmw = factory.getCar("BMW");
        bmw.drive();
    }
}
