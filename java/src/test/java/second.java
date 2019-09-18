import jdk.jfr.StackTrace;
import org.openqa.selenium.webdriver;
import org.openqa.selenium.support.ui.Webdriverwait;


public class second {

    private Webdriver driver;
    private WebdriverWait wait;

    @Before
    public  void start () {
        driver = new Chromedriver ();
        wait = new Webdriver (driver, timeOutinSeconds 10 );
    }
    @Test
    public void second (){
        driver.get("https://bash.im/search");
        driver.findeElement(By.name("text")).sendkeys ("1");
        driver.findElement(By.tagname("button")).click();
        wait.until(titleis("Цитата #1 - Цитатник Рунета"));
    }
    @After
    public void stop() {
        driver.quit();
        driver = nill;

    }


}
