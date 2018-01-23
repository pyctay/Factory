package lizx.factory.abstractfactory;

/**
 * 具体实现类：宝马X6
 *
 * @version 2018/1/23 16:25:06
 * @auther Pyctay
 */
public class BMWX6 extends BMW {
    private String name;
    public BMWX6(String name){
        this.name = name;
    }
    @Override
    public void drive() {
        System.out.println(name+"在路上跑");
    }
}
