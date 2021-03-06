package SJTXE.ExtJS.Component;

import org.openqa.selenium.WebDriver;

/**
 * Wrapper class for ExtJS DateField component.
 * 
 * @author huguogang
 *
 */
public class DateField extends Component {
	
	public DateField(WebDriver driver, String componentQuery, Component parent) {
		super(driver, componentQuery, parent);
	}
	
	
	@Override
	public void sendKeys(CharSequence... keysToSend) {
		getInputEl().sendKeys(keysToSend);
	}	
	
	@Override
	public void clear() {
		getInputEl().clear();
	}
}
