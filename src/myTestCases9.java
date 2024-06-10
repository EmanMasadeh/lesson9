import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myTestCases9 {
	
	
WebDriver driver= new ChromeDriver();
String myURL ="https://www.saucedemo.com/";
String userName ="standard_user";
String password="secret_sauce";

//*************************************************************************************************************
@BeforeTest
public void mySetup()
{
	driver.get(myURL);
	driver.manage().window().maximize();
}



//*************************************************************************************************************	
@Test  (priority = 1)
public void logInTest()
{
//		
//		//List
//		String[] myStudents ={"ahmad", "anas", "eman","layan", "ethar"};
//		
//		System.out.println(myStudents[0].);
//		
//**********************************WebElement
WebElement userNameInpElement =driver.findElement(By.id("user-name"));
userNameInpElement.sendKeys(userName);

	
WebElement passWordInput = driver.findElement(By.id("password"));
passWordInput.sendKeys(password);

WebElement LogInBtn = driver.findElement(By.id("login-button"));
	LogInBtn.click();
	
	
}



//*************************************************************************************************************

@Test (priority  =2 , enabled = false)
public void addAllItems()
{
	//List <String>/ int / boolean can be any webelemet 

List <WebElement> myAddToCartButns = driver.findElements(By.className("btn"));
//	myAddToCartButns.get(0).click();
	System.out.println(myAddToCartButns.size());
	for (int i=0; i <myAddToCartButns.size();i++)
	{
		myAddToCartButns.get(i).click();
		
	}
	
}


//	*************************************************************************************************************	
@Test (priority = 3 , enabled = false )
public void addOneItemAndSkipTheNextOne()
{

	List <WebElement> myAddToCartButns = driver.findElements(By.className("btn"));

System.out.println(myAddToCartButns.size());
//			
//			for (int i=0; i <myAddToCartButns.size();i=i+2)// 0/2/4
//			{
//					myAddToCartButns.get(i).click();
//				
//			}
//////************************Add
//			for (int i=1; i <myAddToCartButns.size();i=i+2)// 1/3/5 i=1 -- i=+2
//			{
//					myAddToCartButns.get(i).click();			
//			}
//*************************first 4 items
//		
//			for (int i=0; i <myAddToCartButns.size();i++)
//			{
//					myAddToCartButns.get(i).click();
//			if(i==3)
//			{break;}
//			
//			}
//		
//*************************first 3 items

//			for (int i=0; i <myAddToCartButns.size();i++)
//			{
//				myAddToCartButns.get(i).click();
//					if(i==2)
//					{break;}
//					
//				}
//				


//************************* skip item 3 index =2  check i then add to cart 		
			for (int i=0; i <myAddToCartButns.size();i++)
			{
				
				if(i==2)
				{continue;
				}
				myAddToCartButns.get(i).click();
				
			}
}


//********************************************************************
	
	
	
	@Test (priority = 4)
	public void findAllElementThatHasTheLab()
	{
		
		
		List<WebElement> ItemsNames = driver.findElements(By.className("inventory_item_name"));
		List<WebElement> myAddToCartButtons = driver.findElements(By.className("btn"));//need it to add the items to the cart if contans "lab"
		

		
		for (int i=0; i < ItemsNames.size();i++)
		{
			String itemName = ItemsNames.get(i).getText();
			//*****************************************
//			if (itemName.contains("Labs"))
//			{
//			myAddToCartButtons.get(i).click();
//		
//			}
	//	***********************************************************
//			if (itemName.contains("Labs"))/// don't add Contans Labs 
//			{
//			continue;
//		
//			}
//			myAddToCartButtons.get(i).click();
	//*********************************************************
//			if (itemName.contains("Labs"))/// will n't add any item 
//			{
//			break;
//		
//			}
//			myAddToCartButtons.get(i).click();
//		************************************************************
			
			
			myAddToCartButtons.get(i).click();
		
			if (itemName.contains("Labs"))/// will n't add any item 
			{
			break;
		
			}
			
		
		}
	
	
	
}
}
