package lizx.factory.method;

/**
 * 具体工厂类：奔驰工厂
 *
 * @version 2018/1/23 15:25:33
 * @auther Pyctay
 */
public class BenZFactory implements Factory {
    @Override
    public Car getCar() {
        return new BenZ();
    }
}
