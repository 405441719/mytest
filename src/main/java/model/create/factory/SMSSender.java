 
/**
  * @Description: TODO
  * Copyright: Copyright (c) 2015 
  * Company:同求宝网络科技有限公司
  * @author 夏怀静
  * @date 2016年2月19日 下午4:37:58
  * @version V1.0
  */ 
 
package model.create.factory; 
/**
 * @ClassName: SMSSender
 * @Description: TODO
 * @author 夏怀静
 * @date 2016年2月19日 下午4:37:58
 *
 */

public class SMSSender implements Sender{

	@Override
	public void send() {
		 System.out.println("This is SMS sender!");
		
	}

}
 
