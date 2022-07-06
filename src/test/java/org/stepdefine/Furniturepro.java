package org.stepdefine;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.utilities.BaseClass;
import org.utilities.PojoWell;

import io.cucumber.java.en.*;

public class Furniturepro extends BaseClass {
	public static PojoWell a;
	@When("user should click furniture links")
	public void user_should_click_furniture_links() {
	a=new PojoWell();
	btnClick(a.getFur());
	    
	}

	@When("user should click bed links")
	public void user_should_click_bed_links() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		a=new PojoWell();
		btnClick(a.getBed());
	   
	}

	@When("user should click bedroom set")
	public void user_should_click_bedroom_set() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		a=new PojoWell();
		btnClick(a.getBedset());
	   
	}

	@When("user should select the product")
	public void user_should_select_the_product() {
	   a=new PojoWell();
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   btnClick(a.getBeds());
	}

	@When("user should click addtocard")
	public void user_should_click_addtocard() {
		a=new PojoWell();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String parent=driver.getWindowHandle();

		
	
	   Set<String> ss = driver.getWindowHandles();
	   
	   Iterator<String> I1= ss.iterator();

	   while(I1.hasNext())
	   {

	   String child_window=I1.next();


	   if(!parent.equals(child_window))
	   {
	   driver.switchTo().window(child_window);

	   System.out.println(driver.switchTo().window(child_window).getTitle());
		   
	   }
	}
	   scrolldown(a.getking());
	   btnClick(a.getking());
	   btnClick(a.getAddCart());
	   
	}

	@When("user should click no thanks button")
	public void user_should_click_no_thanks_button() {
		a=new PojoWell();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		btnClick(a.getnothank());
		
	   
	}

	@When("user should click check out now button")
	public void user_should_click_check_out_now_button() {
		a=new PojoWell();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		btnClick(a.getCheck());
	   
	}



}
