 
/**
  * @Description: TODO
  * Copyright: Copyright (c) 2015 
  * Company:同求宝网络科技有限公司
  * @author 夏怀静
  * @date 2016年3月30日 下午7:18:39
  * @version V1.0
  */ 
 
package model.struct.adapter; 
/**
 * @ClassName: Adapter
 * @Description: TODO
 * @author 夏怀静
 * @date 2016年3月30日 下午7:18:39
 *
 */

public class Adapter implements Target{
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		this.adaptee=adaptee;
	}

	@Override
	public void request() {
		 
		adaptee.spRequest();
	}
}
 
