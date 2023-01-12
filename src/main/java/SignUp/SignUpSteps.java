package SignUp;

import OpenBrowser.OpenWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SignUpSteps extends OpenWeb {

    public static void main(String[] args) {

    }

    public static void clickSignUpButton() {
        try {
            driver.findElement(By.xpath("(//span[@class='ng-star-inserted'])[4]")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void clickStudentCreateAccountButton(){
        try {
            driver.findElement(By.xpath("(//button[@class='btn-full-width-curved'])[1]")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectTitleDropdown(){
        try {
            Thread.sleep(7000);
            Select se = new Select (driver.findElement(By.xpath("//select[@class='ng-dirty ng-valid ng-touched']")));
            //Select title = new Select(driver.findElement(By.xpath("//select[@class='ng-dirty ng-valid ng-touched']")));
// Select the option by index
            se.selectByValue("Mr.");
//            title.selectByVisibleText("Mr.");
//            title.selectByIndex(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
