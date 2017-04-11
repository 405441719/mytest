 
/**
  * @Description: TODO
  * Copyright: Copyright (c) 2015 
  * Company:同求宝网络科技有限公司
  * @author 夏怀静
  * @date 2016年2月22日 下午7:27:24
  * @version V1.0
  */ 
 
package model.struct.adapter; 
/**
 * @ClassName: 创建型:建造者模式
 * @Description: TODO
 * @author 夏怀静
 * @date 2016年2月22日 下午7:27:24
 *
 */

public class TestClient {
	public static void main(String[] args) {
	  Adaptee adaptee=new AdapteeImp();
	  Target target=new Adapter(adaptee);
	  target.request();
	}
}