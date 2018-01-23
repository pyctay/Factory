package lizx.factory.abstractfactory;

/**
 * 具体产品类：宝马X5
 *
 * @version 2018/1/23 16:23:31
 * @auther Pyctay
 */
public class BMWX5 extends BMW {
    private String name;
    public BMWX5(String name){
        this.name = name;
    }
    @Override
    public void drive() {
        System.out.println(name+"在路上跑");
    }
}
