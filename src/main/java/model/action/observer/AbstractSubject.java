 
/**
  * @Description: TODO
  * Copyright: Copyright (c) 2015 
  * Company:同求宝网络科技有限公司
  * @author 夏怀静
  * @date 2016年3月13日 下午4:15:39
  * @version V1.0
  */ 
 
package model.action.observer; 

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: AbstractSubject
 * @Description: TODO
 * @author 夏怀静
 * @date 2016年3月13日 下午4:15:39
 *
 */

public abstract class AbstractSubject {
	private String subjectState;
	private List<AbstractObserver> observers=new ArrayList<AbstractObserver>();
	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}
	//增加观察者
	public void attach(AbstractObserver observer){
		observers.add(observer);
	}
	
	public void detach(AbstractObserver observer){
		observers.remove(observer);
	}
	public void notifyObservers(){
		for(AbstractObserver observer:observers){
			observer.update();
		}
	}
}
 
