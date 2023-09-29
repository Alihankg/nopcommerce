import Utility.BaseDriver;
import org.openqa.selenium.support.PageFactory;

public class POM {
    public POM() {
        PageFactory.initElements(BaseDriver.driver, this);
    }
}
