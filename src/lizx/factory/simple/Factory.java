package lizx.factory.simple;

/**
 * 工厂类
 *
 * @version 2018/1/23 15:13:50
 * @auther Pyctay
 */
public class Factory {
    public Car getCar(String carType){
        switch (carType){
            case "BMW":
                return new BMW();
            case  "BenZ":
                return  new BenZ();
            default:
                return null;
        }
    }
}
