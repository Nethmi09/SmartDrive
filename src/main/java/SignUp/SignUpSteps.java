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
            Select se = new Select (driver.findElement(By.xpath("//select[@formcontrolname='title']")));
            se.selectByValue("Miss.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void enterFirstName(){
        try {
            driver.findElement(By.xpath("(//input[@formcontrolname='first_name'])")).clear();
            driver.findElement(By.xpath("(//input[@formcontrolname='first_name'])")).sendKeys("Nethmi");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void enterLastName(){
        try {
            driver.findElement(By.xpath("(//input[@formcontrolname='last_name'])")).clear();
            driver.findElement(By.xpath("(//input[@formcontrolname='last_name'])")).sendKeys("Udara");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void selectAddressDropdown(){
        try {
            driver.findElement(By.xpath("//input[@id='place']")).clear();
            driver.findElement(By.xpath("//input[@id='place']")).sendKeys("Aareschlucht, Innertkirchen, Switzerland");

//            Select ad = new Select (driver.findElement(By.xpath("//input[@id='place']")));
//            ad.selectByValue("Aareschlucht, Innertkirchen, Switzerland");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
