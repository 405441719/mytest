 
/**
  * @Description: TODO
  * Copyright: Copyright (c) 2015 
  * Company:同求宝网络科技有限公司
  * @author 夏怀静
  * @date 2016年2月19日 下午4:40:32
  * @version V1.0
  */ 
 
package model.create.factory; 
/**
 * @ClassName: SenderFactory
 * @Description: TODO
 * @author 夏怀静
 * @date 2016年2月19日 下午4:40:32
 *
 */

public class SenderFactory {
	public Sender produceSMS(){
		return new SMSSender();
	}
	public Sender produceEmail(){
		return new EmailSender();
	}
}
 
