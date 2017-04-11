/**
 *
 */
package model.create.abstractFactory; 
/**
 * @ClassName: SMSSenderFactory
 * @Description: TODO
 * @author 夏怀静
 * @date 2016年2月19日 下午4:53:35
 *
 */

public class EmailSenderFactory implements SenderFactory{

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub 
		return new EmailSender(); 
	}

}
 
