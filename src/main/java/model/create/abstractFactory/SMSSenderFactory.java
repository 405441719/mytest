 
/**
  * @Description: TODO
  * Copyright: Copyright (c) 2015 
  * Company:同求宝网络科技有限公司
  * @author 夏怀静
  * @date 2016年2月19日 下午4:53:35
  * @version V1.0
  */ 
 
package model.create.abstractFactory; 
/**
 * @ClassName: SMSSenderFactory
 * @Description: TODO
 * @author 夏怀静
 * @date 2016年2月19日 下午4:53:35
 *
 */

public class SMSSenderFactory implements SenderFactory{

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub 
		return new SMSSender(); 
		
	}

}
 
