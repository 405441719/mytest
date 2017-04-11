 
/**
  * @Description: TODO
  * Copyright: Copyright (c) 2015 
  * Company:同求宝网络科技有限公司
  * @author 夏怀静
  * @date 2016年3月30日 下午7:41:32
  * @version V1.0
  */ 
 
package model.struct.bridge; 

import com.sun.swing.internal.plaf.metal.resources.metal;

/**
 * @ClassName: Bridge
 * @Description: TODO
 * @author 夏怀静
 * @date 2016年3月30日 下午7:41:32
 *
 */

public  class Bridge {
	private Sourceable source;

	public Sourceable getSource() {
		return source;
	}

	public void setSource(Sourceable source) {
		this.source = source;
	}

	void method(){
		source.method();
	}
}
 
