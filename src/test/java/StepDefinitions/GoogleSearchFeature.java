package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.bind.Element;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class GoogleSearchFeature {



    WebDriver driver = null;

    @Given("enter the link in search box")
    public void enter_the_link_in_search_box() {
        // Write code here that turns the phrase above into concrete actions

        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is:" + projectPath);
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside Step - browser is open");
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
        @Then("open the google")
    public void open_the_google() {
        driver.navigate().to("https://google.com");


    }


    @Given("open google")

    public void open_google() {
        String projectPath= System.getProperty("user.dir");
        System.out.println("Project path is:" +projectPath);
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside Step - browser is open");
        System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://google.com");

    }

    @When("Enter a text {string}")
    public void enter_a_text(String expectedAnswer) {
        // Write code here that turns the phrase above into concrete actions
        WebElement Element = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
            Element.sendKeys(expectedAnswer);
    }

    @When("press enter")
    public void press_enter() throws InterruptedException {
        Thread.sleep(1500);
        WebElement Element = driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf.emcav > div.UUbT9 > div.aajZCb > div.tfB0Bf > center > input.gNO89b"));
        Element.click();
    }


    @Then("show the results in the list")
    public void show_the_results_in_the_list() {
        // Write code here that turns the phrase above into concrete actions
        List<WebElement> optionCount = driver.findElements(By.cssSelector("#rso> div"));
        System.out.println(optionCount.size());

    }


    @Then("nothing happens")
    public void nothing_happens() {

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();

       driver.navigate().to("https://google.com");
        WebElement Element = driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div.A7Yvie.emca > div.zGVn2e > div > div.a4bIc > input"));
        Element.sendKeys(Keys.ENTER);
       // Assert.assertEquals("https://google.com", Element);

    }
    @Given("Opengoogle")
    public void opengoogle() {
        // Write code here that turns the phrase above into concrete actions
        String projectPath= System.getProperty("user.dir");
        System.out.println("Project path is:" +projectPath);
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Inside Step - browser is open");
        System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.navigate().to("https://google.com");
    }

    @Then("Display the text {string}")
    public void display_the_text(String string) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebElement Element = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
        Element.sendKeys(string);

        WebElement Element1 = driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf.emcav > div.UUbT9 > div.aajZCb > div.tfB0Bf > center > input.gNO89b"));
        Element1.click();

        WebElement Element2 = driver.findElement(By.cssSelector("#fprs > a.spell_orig"));
        Element2.click();

        Thread.sleep(1500);

        WebElement Element3 = driver.findElement(By.cssSelector("#taw > div:nth-child(2) > p > a"));
        Element3.click();

    }



}


