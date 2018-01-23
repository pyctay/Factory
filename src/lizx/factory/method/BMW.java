package lizx.factory.method;

/**
 * 具体产品类：宝马
 *
 * @version 2018/1/23 15:21:51
 * @auther Pyctay
 */
public class BMW implements Car {
    @Override
    public void drive() {
        System.out.println("宝马车在路上跑");
    }
}
