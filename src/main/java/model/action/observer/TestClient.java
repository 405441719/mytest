 
/**
  * @Description: TODO
  * Copyright: Copyright (c) 2015 
  * Company:同求宝网络科技有限公司
  * @author 夏怀静
  * @date 2016年3月13日 下午4:46:18
  * @version V1.0
  */ 
 
package model.action.observer; 
/**
 * @ClassName: TestClient
 * @Description: TODO
 * @author 夏怀静
 * @date 2016年3月13日 下午4:46:18
 *
 */

public class TestClient {
	public static void main(String[] args) {
		ConcreteSubject subject=new ConcreteSubject();
		subject.attach(new ConcreteObserver(subject, "Observer A"));
		subject.attach(new ConcreteObserver(subject, "Observer B"));
		subject.attach(new ConcreteObserver(subject, "Observer C"));
		subject.setSubjectState("Ready");
		subject.notifyObservers();
	}
}
 
