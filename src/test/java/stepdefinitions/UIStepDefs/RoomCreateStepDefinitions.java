package stepdefinitions.UIStepDefs;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class RoomCreateStepDefinitions {

    MedunnaPage medunnaPage = new MedunnaPage();
    String roomNumber= String.valueOf(Faker.instance().number().numberBetween(1000,1000000));
    @Given("kullanici Medunnaya {string} gider")
    public void kullanici_medunnaya_gider(String string) {
        Driver.getDriver().get(string);
    }
    @When("kullanici Login olur")
    public void kullanici_login_olur() {
      medunnaPage.loginOlma.click();
      medunnaPage.SingIn.click();
      medunnaPage.userName.clear();
      medunnaPage.userName.sendKeys("FARUK");
      medunnaPage.password.clear();
      medunnaPage.password.sendKeys("anelka.28");
      medunnaPage.SingInButton.click();

    }
    @When("kullanici room olusturur")
    public void kullanici_room_olusturur() throws InterruptedException {

        medunnaPage.ItemsTitles.click();
        medunnaPage.Room.click();
        medunnaPage.CreateANewRoom.click();
        medunnaPage.roomNumber.sendKeys(roomNumber);
        Select select = new Select(medunnaPage.dropdownRoomType);
        select.selectByVisibleText("TWIN");
        medunnaPage.status.click();
        medunnaPage.price.sendKeys("123", Keys.TAB,"team21",Keys.ENTER);
        Thread.sleep(2000);

    }
    @Then("kullanici olusturdugu roomun oldugunu dogrular")
    public void kullanici_olusturdugu_roomun_oldugunu_dogrular() throws InterruptedException {
        Assert.assertTrue(medunnaPage.dogrulamaMesaji.isDisplayed());

        medunnaPage.createdDate.click();
        medunnaPage.roomNumberList.stream().forEach(t-> System.out.println(t.getText()));
        Thread.sleep(2000);
        System.out.println("roomno:"+roomNumber);

       for (WebElement w: medunnaPage.roomNumberList){

           if (w.getText().equals(roomNumber)){
               Assert.assertTrue(true);
               System.out.println("roomNumber :"+roomNumber);
           }



       }





    }








}
