 
/**
  * @Description: TODO
  * Copyright: Copyright (c) 2015 
  * Company:同求宝网络科技有限公司
  * @author 夏怀静
  * @date 2016年3月13日 下午4:28:49
  * @version V1.0
  */ 
 
package model.action.observer; 
/**
 * @ClassName: ConcreteObserver
 * @Description: TODO
 * @author 夏怀静
 * @date 2016年3月13日 下午4:28:49
 *
 */

public class ConcreteObserver extends AbstractObserver{
	private AbstractSubject subject;
	private String observerState;
	private String name;

	public ConcreteObserver(ConcreteSubject subject,String name) {
		this.subject=subject;
		this.name=name;
	}
	
	@Override
	public void update() {
		 this.observerState=subject.getSubjectState();
		 System.out.println("The observer's state of "+name+" is "+this.observerState);
		
	}

}
