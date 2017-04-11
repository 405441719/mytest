 
/**
  * @Description: TODO
  * Copyright: Copyright (c) 2015 
  * Company:同求宝网络科技有限公司
  * @author 夏怀静
  * @date 2016年2月24日 下午7:22:04
  * @version V1.0
  */ 
 
package model.create.prototype; 

import java.io.Serializable;

/**
 * @ClassName: Product
 * @Description: TODO
 * @author 夏怀静
 * @date 2016年2月24日 下午7:22:04
 *
 */

public class Product implements Serializable{
private static final long serialVersionUID = -2231253585452874231L;
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Product(String name) {
	this.name=name;
}
public void showName(){
	System.out.println("My name is "+name);
}
}