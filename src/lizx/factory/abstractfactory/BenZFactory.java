package lizx.factory.abstractfactory;

/**
 * 奔驰工厂
 *
 * @version 2018/1/23 16:13:15
 * @auther Pyctay
 */
public class BenZFactory implements Factory {
    @Override
    public Car getCar(String name) {
        if("奔驰s500".equals(name))
            return new BenZs500("奔驰s500");
        if ("奔驰s600".equals(name))
            return new BenZs600("奔驰s600");
        else
            return null;
    }
}
