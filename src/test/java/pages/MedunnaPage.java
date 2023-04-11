package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MedunnaPage {

    public MedunnaPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='dropdown nav-item']")
    public WebElement loginOlma;

    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement SingIn;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement SingInButton;

    @FindBy(xpath = "//span[text()='Items&Titles']")
    public WebElement ItemsTitles;

    @FindBy(xpath = "//span[text()='Room']")
    public WebElement Room;

    @FindBy(xpath = "//span[text()='Create a new Room']")
    public WebElement CreateANewRoom;

    @FindBy(xpath = "//*[@name='roomNumber']")
    public WebElement roomNumber;
    @FindBy(xpath = "//select[@id='room-roomType']")
    public WebElement dropdownRoomType;
   @FindBy(id = "save-entity")
    public WebElement save;
   @FindBy(xpath = "//div[@role='alert']")
    public WebElement dogrulamaMesaji;
    @FindBy(xpath = "//input[@name='status']")
    public WebElement status;
    @FindBy(xpath = "//input[@id='room-price']")
    public WebElement price;
    @FindBy(xpath = "//table[@class='table']//tbody//td[2]")
    public List<WebElement> roomNumberList;
    @FindBy(xpath = "//*[@aria-label='Next']")
    public  WebElement sagTus ;
    @FindBy(xpath = "(//th[@class='hand'])[7]")
    public WebElement createdDate;













}
