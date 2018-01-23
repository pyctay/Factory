package lizx.factory.abstractfactory;

/**
 * 具体产品类：奔驰s500
 *
 * @version 2018/1/23 16:06:03
 * @auther Pyctay
 */
public class BenZs500 extends BenZ {

    private String name;
    public BenZs500(String name){
        this.name = name;
    }
    @Override
    public void drive() {
        System.out.println(name+"在路上跑");
    }
}
