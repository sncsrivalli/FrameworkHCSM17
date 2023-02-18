package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SkillraryDemoAppPage {

	//Declaration
	@FindBy(xpath = "//div[@class='navbar-header']")
	private WebElement pageHeader;
	@FindBy(id = "course")
	private WebElement courseTab;
	@FindBy(xpath = "//span[@class='wrappers']/a[text()='Selenium Training']")
	private WebElement seleniumTrainingLink;
	@FindBy(name = "addresstype")
	private WebElement categoryDropdown;
	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement contactUsLink;
	
	//Initialization
	public SkillraryDemoAppPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	public WebElement getPageHeader() {
		return pageHeader;
	}
	
	public void mouseHoverTocourse(WebDriverUtility web) {
		web.mouseHover(courseTab);
	}
	
	public void clickSeleniumTraining() {
		seleniumTrainingLink.click();
	}
	
	public void selectCategory(WebDriverUtility web, int index) {
		web.dropdown(categoryDropdown, index);
	}
	
	public WebElement getContactUs() {
		return contactUsLink;
	}
	
	public void clickContactUs() {
		contactUsLink.click();
	}
	
}
