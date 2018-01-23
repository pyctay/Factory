package lizx.factory.method;

/**
 * 具体产品类：奔驰
 *
 * @version 2018/1/23 15:22:57
 * @auther Pyctay
 */
public class BenZ implements Car {
    @Override
    public void drive() {
        System.out.println("奔驰车在路上跑");
    }
}
