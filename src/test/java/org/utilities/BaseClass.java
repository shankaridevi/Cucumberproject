package org.utilities;



	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.time.Duration;
	import java.time.LocalDate;
	import java.time.LocalDateTime;
	import java.time.LocalTime;
	import java.time.format.DateTimeFormatter;
	import java.util.Date;
	import java.util.List;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.apache.commons.io.FileUtils;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.NoSuchElementException;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;


	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.FluentWait;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.Wait;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClass {
		public static Actions a;
		public static WebDriver driver;
		public static Robot r;
	public static Alert al;
		public static Select sel;
		public static JavascriptExecutor js;
		public static WebDriverWait wait; 
		public static TakesScreenshot tk=(TakesScreenshot)driver;
		public static Wait<WebDriver> tr;

		
		// 1. launch chrome driver
		public static void launchChrome() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		
		//2. Load url
		public static void loadUrl(String url)	{
			driver.get(url);
		}
		//3. Maximize window
		public static void winMax() {
			driver.manage().window().maximize();
		}
		// 4.print title
		public static void printTitle() {
			String title=driver.getTitle();
			System.out.println(title);
		}
		// 5. Print currenturl
		public static void printCurrentUrl() {
			System.out.println(driver.getCurrentUrl());
		}
		//6. To send values using send keys
		public static void fill(WebElement ele,String value) {
			ele.sendKeys(value);
			
		}
		//7.to Click
	public static void btnClick(WebElement ele) {
		ele.click();
	}
		//8. rightClick
		public static void rightClick(WebElement ele) {
			a=new Actions(driver);
			a.contextClick(ele).perform();
		}
		//9.doubleClick
		public static void doubleeClick(WebElement ele) {
			a=new Actions(driver);
			a.doubleClick(ele).perform();
			
			}
		//10. MoveElement
		public static void moveElement(WebElement ele) {
			a=new Actions(driver);
			a.moveToElement(ele).perform();
		}
	//11. DragAndDrop
		public static void dragDrop(WebElement ele,WebElement elem) {
			a=new Actions(driver);
			a.dragAndDrop(ele,elem);
			}
		//12.Robot key press
		public static void robotkeypress(int key) throws AWTException {
			r=new Robot();
			r.keyPress(key);
		}
		//13. Robot key release
		public static void robotkeyrelease(int keycode) throws AWTException {
			r=new Robot();
			r.keyRelease(keycode);
			
	}
		//14. Alert
		public static void acceept() {
			al=driver.switchTo().alert();
			
			al.accept();
			
		}
		//15. dismiss
		public static void dissmis() {
			al=driver.switchTo().alert();
			al.dismiss();
		}
		//16. send values
		public static void sendValues(String value) {
			al=driver.switchTo().alert();
			al.sendKeys(value);
		}
		//17.getAlertText
		public static void printAlText( ) {
			al=driver.switchTo().alert();
			String text = al.getText();
			System.out.println(text);
		}
		
		//18.javaScript Scrolldown 
		public static void scrolldown(WebElement ele) {
			 js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true);",ele);
			
			
		}
		//19.screenshot
		public static void screenShot(String path) throws IOException   {
			tk=(TakesScreenshot)driver;
			File ff=tk.getScreenshotAs(OutputType.FILE);
			File ss= new File("C:\\Users\\Mohankumar S\\eclipse-workspace\\FrameProjectWay\\target\\screenshot\\"+path+".png");
			
			FileUtils.copyFile(ff, ss);
		}
		
		//20.getAttribute value
		public static void getAttrivalue(WebElement ele) {
			String string = ele.getAttribute("value");
			System.out.println(string);

		}
		//21.getText value
		public static void getTextValue(WebElement ele ) {
			String text = ele.getText();
			System.out.println(text);
				
		}
		//22. framebyindex
		public static void frames(int value) {
			driver.switchTo().frame(value);
			
		}
		// 23.frameby name
		public static void frame(String value) {
		
		driver.switchTo().frame(value);
		
	}
		//24. framebyWebElement
	public static void fram(WebElement ele) {
		driver.switchTo().frame(ele);
	}
	//25.default frame
	public static void framm() {
	driver.switchTo().defaultContent();
	}
	//26.parentframe
	public static void framess() {
		driver.switchTo().parentFrame();
	}
	//27.Select by value
	public static void selectbyvalue(String arg,WebElement e) {
		sel=new Select(e);
		sel.selectByValue(arg);
		
	}
	//28.Select by index
	public static void selectbyindex(int value,WebElement e) {
		sel=new Select(e);
		sel.selectByIndex(value);
	}
	//29.selectbyvisible
	public static void selectbyVisible(String arg,WebElement e) {
		sel=new Select(e);
		sel.selectByVisibleText(arg);
	}
	//30. delselectall
	public static void deselect(WebElement e) {
		sel=new Select(e);
		sel.deselectAll();
	}
	//31.deselectbyvalue
	public static void deselectbyvalue(String arg,WebElement e) {
		sel=new Select(e);
		sel.deselectByValue(arg);
	}
	//32.deselectbyindex
	public static void deselectByindex(int value,WebElement e) {
		sel=new Select(e);
		sel.deselectByIndex(value);
	}
	//33.deselecctbyvisibletext
	public static void deselectbyvisbletext(String arg,WebElement e) {
		sel=new Select(e);
		sel.deselectByVisibleText(arg);
		
	}
	//34.GetFirstSelectedOption

	public static void getFirstSelect(WebElement e) {
		sel=new Select(e);
		WebElement o=sel.getFirstSelectedOption();
		String text=o.getText();
		System.out.println(text);
	}
	//35.GetOptions
	public static void getAllSelect(WebElement e) {
		sel=new Select(e);
		 List <WebElement> op = sel.getOptions();
	     int size = op.size();
	     for(int i =0; i<size ; i++){
	        String options = op.get(i).getText();
	        System.out.println(options);
	     }
	}
	     //36. multiple select
	     public static void isMulti(WebElement e) {
	    	 sel=new Select(e);
	    	 sel.isMultiple();
	}
	     //37.getWindowhandle
	     public static void windowHandle() {
	    	 String winHand = driver.getWindowHandle();
	    	 System.out.println(winHand);
	     }
	//38 GetwindowHandles
	     public static void windowHandles() {
	    	 String winHand = driver.getWindowHandle();
	    	 Set<String> handles = driver.getWindowHandles();
	    	for (String str : handles) {
				if (!winHand.equals(str)) {
					System.out.println(str);
					driver.switchTo().window(str);
				}
	    	}
				
			}
	    	
	    	
	    	//40. launch edgeDriver 

	//41. sendvalues for action 
	public static void sendAlvalues(String value) {
		a=new Actions(driver);
		a.sendKeys(value);
		
	}
	//42. send values for webelement
	public static void sendvalues(WebElement ele,String value) {
		ele.sendKeys(value);
	}
	//43. implicitwait
	public static void implicitwait(int a) {
		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
	}
	//44.explicit wait
	public static void explicitWait(int a) {
		wait= new WebDriverWait(driver,a);
		wait.until(ExpectedConditions.alertIsPresent());
		
	}
	//45.element to be clickable
	public static void clickable(int a,WebElement ele) {
		wait=new WebDriverWait(driver,a);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	//46. 
	public static void selectable(int a,WebElement ele) {
		wait=new WebDriverWait(driver,a); 
			wait.until(ExpectedConditions.elementToBeSelected(ele));
			
		}
	//47

	public static void attribute(int a,WebElement ele,String attribute) {
		wait=new WebDriverWait(driver,a);
		wait.until(ExpectedConditions.attributeToBeNotEmpty(ele, attribute));
	}
	//48.
	public static void keysUp(Keys key) {
		
		a.keyDown(key);
	}
	//49
	public static void keysdown(Keys key) {
		a.keyUp(key);
	}
	//50
	public static void quiet() {
		driver.quit();
	}
	//51
	public static void fluentwait(int a,int b) {
	 tr=new FluentWait<WebDriver>(driver)
			 .withTimeout(Duration.ofSeconds(a))
			 .pollingEvery(Duration.ofSeconds(b))
			 .ignoring(NoSuchElementException.class);
	}
	//53
	public static void getAttr(WebElement ele,String arg) {
		String attribute = ele.getAttribute(arg);
		System.out.println(attribute);
	}
	//54 alert get text
	public static void alGetText() {
		al=driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
	}
	//55 scroll up
	public static void scrollUp(WebElement ele) {
		 js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(false);",ele);
	}
	//56 setAttribute
	public static void setAttributs(WebElement ele, String text) {
		js.executeScript("arguments[0].setAttribute('value','text')",ele);
	}
	//57. Perform Click on LOGIN button using JavascriptExecutor
	public static void clicking(WebElement button) {
		 		
	    js.executeScript("arguments[0].click()", button);
	}
	//58 Threadsleep method

	public static void sleep() throws InterruptedException {
		Thread.sleep(2000);
	}
	//59
	 
	public static void textPresent(int a,WebElement ele,String text) {
		wait=new WebDriverWait(driver,a);
		wait.until(ExpectedConditions.textToBePresentInElement(ele,text));
	}
	//60 get Attribute value using javascriptexecutor
	public static void javaGet(WebElement ele) {
		js.executeScript("return arguments[0].getAttribute('value')", ele);
	}
	//61. to clear values
	public static void clean(WebElement ele) {
		ele.clear();
		
		
	}
	//62 to get tagname
	public static void getTagvalue(WebElement ele) {
		String tagName = ele.getTagName();
		System.out.println(tagName);
	}
	//63 getAllSelected option
	public static void getAllSelect1(WebElement e) {
		sel=new Select(e);
		List<WebElement> all = sel.getAllSelectedOptions();
		for(WebElement options: all)
	        System.out.println(options.getText());
		
	}
	//64 cut

	public static void cut() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
		
	}
	//65 paste
	public static void paste() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
	}
	// 66. copy
	public static void copy() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}
	public static String getData(int rownumber,int cellNumber) throws IOException {
		File f=new File("C:\\Users\\Mohankumar S\\eclipse-workspace\\FrameWorkProject\\target\\fff.xlsx");
		FileInputStream ff=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(ff);
		Sheet s=w.getSheet("Sheet1");
		Row r = s.getRow(rownumber);
		Cell c = r.getCell(cellNumber);
		int cellType=c.getCellType();
		String val="";
		if(cellType==1) {
			val=c.getStringCellValue();
		}
		else if(DateUtil.isCellDateFormatted(c)) {
			Date d=c.getDateCellValue();
			SimpleDateFormat sim=new SimpleDateFormat("dd/MM/yyyy");
			val = sim.format(d);
		}
		else {
			double ss = c.getNumericCellValue();
			long l=(long)ss;
			val=String.valueOf(l);
		}
		return val;
		
		}
	public static void putData(String text,int rownumber,int cellNumber) throws IOException {
		File f=new File("C:\\Users\\Mohankumar S\\eclipse-workspace\\FrameWorkProject\\target\\hotal.xlsx");
		FileInputStream ff=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(ff);
		Sheet s=w.getSheet("Sheet1");
		Row r = s.getRow(rownumber);
		Cell c= r.createCell(cellNumber);
		c.setCellValue(text);
		FileOutputStream ffot=new FileOutputStream(f);
		w.write(ffot);
		
		
		
	}
	public static void dateandtime() {
		LocalDateTime myDateObj = LocalDateTime.now();  
	    
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");  
	    
	    String formattedDate = myDateObj.format(myFormatObj);  
	    System.out.println(formattedDate);  
	  }  
	public static void fil(WebElement enter, Keys enter2) {
		enter.sendKeys(enter2);
			
		}
	public static void closeing() {
		driver.close();
	}
	}
	










	


