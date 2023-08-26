package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
public static void main(String[] args) throws InterruptedException {
	
	  //Assignment 2:Edit Lead
	  // Launch URL "http://leaftaps.com/opentaps/control/login"
	  
	  ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//enter username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click on crm/sfa link
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//click on create Lead 
		driver.findElement(By.linkText("Create Lead")).click();
		
		//enter company name field 
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
		
		 //Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramyah");
		
		// Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kothandam");
		
		// Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ramyah");
		  
		// Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("EEE");
		  
		// Enter Description Field Using any Locator of your choice
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is Test");
		
		// Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dummy@gmail.com");
		// Select State/Province as NewYork Using Visible Text
		WebElement stateDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDD=new Select(stateDropDown);
		stateDD.selectByVisibleText("New York");
		
		  // Click on Create Button
		driver.findElement(By.name("submitButton")).click();

		//Click on edit button
		driver.findElement(By.linkText("Edit")).click();
		
		
        // Clear the Description Field using .clear()
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		//Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Entering some text");
		
		// Click on update button
		driver.findElement(By.name("submitButton")).click();

		// Get the Title of Resulting Page. refer the video  using driver.getTitle()
		System.out.println(driver.getTitle());
		Thread.sleep(2000);

	}
}
