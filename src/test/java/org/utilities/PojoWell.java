package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoWell extends BaseClass {
	public PojoWell() {
		PageFactory.initElements(driver,this);
	}
		@FindBy(id="searchInput")
		private WebElement enter;
		
		@FindBy(xpath="//p[text()='Bedroom Furniture']")
		private WebElement Bed;
		
		@FindBy(xpath="(//a[@role='button'])[1]")
		private WebElement dark;
		
		
		@FindBy(xpath="(//div[@data-hb-id='BoxV2'])[3]")
		private WebElement menu;
		
		@FindBy(xpath="(//img[@data-codeception-id='ImageComponent'])[2]")
		private WebElement beds;
		public WebElement getBeds() {
			return beds;
		}
		@FindBy(xpath="(//a[@class='DepartmentItem-link'])[1]")
		private WebElement fur;
		@FindBy(xpath="//p[text()='Bedroom Sets']")
		private WebElement bedset;
		
		@FindBy(xpath="(//span[text()='King'])[1]")
		private WebElement king;
		@FindBy(id="btn-add-to-cart")
		private WebElement addcart;
		@FindBy(xpath="//button[@data-cypress-id='secondaryButton']")
		private WebElement nothank;
		@FindBy(xpath="//a[@data-codeception-id='minicartProceedToCheckoutBtn']")
		private WebElement check;
		@FindBy(id="textInput-9")
		private WebElement fulname;
		@FindBy(xpath="//input[@id='textInput-10']")
		private WebElement address;
		@FindBy(xpath="//input[@id='textInput-11']")
		private WebElement plot;
		@FindBy(xpath="//select[@title='State']")
		private WebElement state;
		@FindBy(id="textInput-14")
		private WebElement zip;
		@FindBy(id="textInput-15textInput-15")
		private WebElement phone;
		@FindBy(xpath="//button[@type='submit']")
		private WebElement save;
		public WebElement getsave() {
			return save;
		}
		public WebElement getPhone() {
			return phone;
			
		}
		public WebElement getZip() {
			return zip;
		}
		public WebElement getState() {
			return state;
		}
		public WebElement getPlot() {
			return plot;
		}
		
		public WebElement getAddress() {
			return address;
			
		}
		
		
		public WebElement getFulname() {
			return fulname;
		}
		public WebElement getCheck() {
			return check;
		}
		public WebElement getnothank() {
			return nothank;
		}
		public WebElement getAddCart() {
			return addcart;
		}
		
		public WebElement getking() {
			return king;
		}
		public WebElement getFur() {
			return fur;
		}
		public WebElement getBedset() {
			return bedset;
		}
		public WebElement getDark() {
			return dark;
		}
		public WebElement getMenu() {
			return menu;
		}
		public WebElement getBed() {
			return Bed;
		}
		
		
		public WebElement getEnter() {
			return enter;
		}
		
		
		
		
	}


