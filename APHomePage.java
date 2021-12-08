package example.pages.appages;

import org.example.hooksetup.HookSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class APHomePage extends HookSetup {
    private WebDriver driver;

    @FindBy(xpath="//a[text()='English']")
    public WebElement lnk_english;
    @FindBy(xpath="//button[text()='Start test']")
    public WebElement lnk_Starttest;
    @FindBy(xpath="//button[text()='next-button']")
    public WebElement lnk_Next;
    @FindBy(xpath="//label[text()='one third']")
    public WebElement lnk_onethird;
    @FindBy(xpath="//button[text()='next-button']")
    public WebElement lnk_Next1;
    @FindBy(xpath="//label[text()='They all refer to different countries']")
    public WebElement lnk_Option4;
    @FindBy(xpath="//button[text()='next-button']")
    public WebElement lnk_Next2;
    @FindBy(xpath="//button[text()='next-button']")
    public WebElement lnk_Next3;
    @FindBy(xpath="//label[text()='him']")
    public WebElement lnk_Option2;
    @FindBy(xpath="//button[text()='next-button']")
    public WebElement lnk_Next4;
    @FindBy(xpath="//label[text()='are']")
    public WebElement lnk_OptionAre;
    @FindBy(xpath="//button[text()='next-button']")
    public WebElement lnk_Next5;
    @FindBy(xpath="//button[text()='next-button']")
    public WebElement lnk_Next6;
    @FindBy(xpath="//label[text()='climing mountains']")
    public WebElement lnk_Spelling1;
    @FindBy(xpath="//button[text()='next-button']")
    public WebElement lnk_Next7;
    @FindBy(xpath="//label[text()='No Mistake']")
    public WebElement lnk_Spelling2;
    @FindBy(xpath="//button[text()='next-button']")
    public WebElement lnk_Next8;
    @FindBy(xpath="//label[text()='mum for permision']")
    public WebElement lnk_Spelling3;
    @FindBy(xpath="//button[text()='next-button']")
    public WebElement lnk_Next9;
    @FindBy(xpath="//button[text()='End test']")
    public WebElement lnk_Endtest;

    public APHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public  void navigateURL(String URL){
        driver.get(URL);
    }


    public void clickEnglish(); {
        lnk_english.click();
    }
    public void clickStarttest(); {
        lnk_Starttest.click();
    }
    public void clickNext() {
        lnk_Next.click();
    }
    public void clickOnethird() {
        lnk_onethird.click();
    }
    public void clickNext1() {
        lnk_Next1.click();
    }
    public void clickOption4() {
        lnk_Option4.click();
    }
    public void clickNext2() {
        lnk_Next2.click();
    }
    public void clickNext3() {
        lnk_Next3.click();
    }
    public void clickOption2() {
        lnk_Option2.click();
    }
    public void clickNext4() {
        lnk_Next4.click();
    }
    public void clickOptionAre() {
        lnk_OptionAre.click();
    }
    public void clickNext5() {
        lnk_Next5.click();
    }
    public void clickNext6() {
        lnk_Next6.click();
    }
    public void clickSpelling1() {
        lnk_Spelling1.click();
    }
    public void clickNext7() {
        lnk_Next7.click();
    }
    public void clickSpelling2() {
        lnk_Spelling2.click();
    }
    public void clickNext8() {
        lnk_Next8.click();
    }
    public void clickSpelling3() {
        lnk_Spelling3.click();
    }
    public void clickNext9() {
        lnk_Next9.click();
    }
    public void clickEndtest() {
        lnk_Endtest.click();
    }

    public void CloseDriver(){
        driver.quit();
    }
}