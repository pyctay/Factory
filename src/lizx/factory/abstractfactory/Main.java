package lizx.factory.abstractfactory;

public class Main {

    public static void main(String[] args) {
        Factory bmwFactory = new BMWFactory();
        Car bmwX6 = bmwFactory.getCar("宝马X6");
        bmwX6.drive();
        Car bmwX5 = bmwFactory.getCar("宝马X5");
        bmwX5.drive();
        Factory benZFactory = new BenZFactory();
        Car benZs600 = benZFactory.getCar("奔驰s600");
        benZs600.drive();
        Car benZs500 = benZFactory.getCar("奔驰s500");
        benZs500.drive();
    }
}
