package lizx.factory.method;

/**
 * 工厂模式测试
 */
public class Main {

    public static void main(String[] args) {
        BMWFactory bmwFactory = new BMWFactory();
        Car bmw = bmwFactory.getCar();
        bmw.drive();
        BenZFactory benZFactory = new BenZFactory();
        Car benZ = benZFactory.getCar();
        benZ.drive();
    }
}
