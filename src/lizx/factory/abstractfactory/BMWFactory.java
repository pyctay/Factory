package lizx.factory.abstractfactory;

/**
 * 宝马工厂
 *
 * @version 2018/1/23 16:21:31
 * @auther Pyctay
 */
public class BMWFactory implements  Factory {
    @Override
    public Car getCar(String name) {
        if("宝马X5".equals(name))
            return new BMWX5("宝马X5");
        if ("宝马X6".equals(name))
            return new BMWX6("宝马X6");
        else
            return null;
    }
}
