import org.testng.annotations.Test;

public class UI_Test extends BaseTest{
    @Test
    public void GoogleTest(){
        UI_STEPS.userCanSearch(driver);
    }
}
