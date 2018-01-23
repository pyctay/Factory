package lizx.factory.method;

/**
 * 具体工厂类：宝马工厂
 *
 * @version 2018/1/23 15:24:44
 * @auther Pyctay
 */
public class BMWFactory implements Factory {
    @Override
    public Car getCar() {
        return new BMW();
    }
}
