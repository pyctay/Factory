package lizx.factory.abstractfactory;

/**
 * 具体产品类：奔驰s600
 *
 * @version 2018/1/23 15:57:52
 * @auther Pyctay
 */
public class BenZs600 extends BenZ {
    private String name;
    public BenZs600(String name){
        this.name = name;
    }
    @Override
    public void drive() {
        System.out.println(name+"在路上跑");
    }
}
