 
/**
  * @Description: TODO
  * Copyright: Copyright (c) 2015 
  * Company:同求宝网络科技有限公司
  * @author 夏怀静
  * @date 2016年2月24日 下午7:11:30
  * @version V1.0
  */ 
 
package model.create.prototype; 

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @ClassName: Prototype
 * @Description: TODO
 * @author 夏怀静
 * @date 2016年2月24日 下午7:11:30
 *
 */

public class Prototype implements Cloneable,Serializable{
	
	private static final long serialVersionUID = 1320969972421248685L;
	private Product product;
	private String name;

	public Prototype(Product product,String name) {
		this.product=product;
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showName(){
		product.showName();
		System.out.println("Prototype name is "+name);
	}
	//浅复制
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Prototype proto=(Prototype)super.clone(); 
		return proto; 
	}

	public Object deepClone() throws IOException, ClassNotFoundException{
		 /* 写入当前对象的二进制流 */  
        ByteArrayOutputStream bos = new ByteArrayOutputStream();  
        ObjectOutputStream oos = new ObjectOutputStream(bos);  
        oos.writeObject(this);  
  
        /* 读出二进制流产生的新对象 */  
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());  
        ObjectInputStream ois = new ObjectInputStream(bis);  
        return ois.readObject();
	}
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		final Product product=new Product("ddd");
		Prototype p=new Prototype(product,"aaa");
		p.showName();
		Prototype p2=(Prototype)p.clone();
		product.setName("ggg");
		p.setName("bbb");
		p2.showName();
		Prototype p3=(Prototype)p.deepClone();
		product.setName("hhh");
		p3.showName();
	}
}