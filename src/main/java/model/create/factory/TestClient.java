/**
 * @Description: TODO
 * Copyright: Copyright (c) 2015 
 * Company:同求宝网络科技有限公司
 * @author 夏怀静
 * @date 2016年2月19日 下午4:42:40
 * @version V1.0
 */

package model.create.factory;

/**
 * @ClassName: 创建型:简单工厂
 * @Description: TODO
 * @author 夏怀静
 * @date 2016年2月19日 下午4:42:40
 * 
 */

public class  TestClient {
	public static void main(String[] args) {
		SenderFactory factory = new SenderFactory();
		Sender emailSender = factory.produceEmail();
		emailSender.send();
		Sender smsSender = factory.produceSMS();
		smsSender.send();
	}
}