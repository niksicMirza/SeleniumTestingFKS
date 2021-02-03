package test;

import static org.junit.jupiter.api.Assertions.*;


import java.util.HashSet;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class SeleniumIntroTest {
	
	private static WebDriver webDriver;
	private static String baseUrl;
	
	@BeforeAll
	static void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MirzA\\Downloads\\chromedriver.exe");
		webDriver = new ChromeDriver();
		baseUrl = "https://fksarajevo.ba/";
	}
	
	
	
	
	/*@Test
	void logoTest() throws InterruptedException {
		webDriver.get("https://fksarajevo.ba/kategorija/omladinski-pogon");
		webDriver.manage().window().fullscreen();
		Thread.sleep(800);
		
		webDriver.findElement(By.xpath("/html/body/nav/div/a/img")).click();
		webDriver.manage().window().fullscreen();
		
		Thread.sleep(800);
		
		String currentUrl= webDriver.getCurrentUrl();
		assertEquals(baseUrl, currentUrl);
		
		Thread.sleep(1000);
	}
	
	@Test
	public void registrationFormTest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(2000);
		
		webDriver.findElement(By.cssSelector("#header-top > div > div.fks-dropdown.dropdown-alt.d-sm-flex > a.ml-2")).click();
		Thread.sleep(3000);
		webDriver.findElement(By.xpath("/html/body/div/div[1]/a[2]")).click();
		Thread.sleep(3000);
		
		WebElement name = webDriver.findElement(By.name("first_name"));
		name.sendKeys("Mirza");
		
		WebElement lastname = webDriver.findElement(By.name("last_name"));
		lastname.sendKeys("Niksic");
		
		WebElement email = webDriver.findElement(By.name("email"));
		email.sendKeys("mirza.niksic5@gmail.com");
		
		WebElement password = webDriver.findElement(By.name("password"));
		password.sendKeys("19461946");
		
		WebElement password_confirmation = webDriver.findElement(By.name("password_confirmation"));
		password_confirmation.sendKeys("19461946");
		Thread.sleep(3000);
		
		webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[7]/button")).click();
		Thread.sleep(3000);
		
		
		String loginUrl="https://fksarajevo.ba/login";
		String currentUrl= webDriver.getCurrentUrl();
		assertEquals(loginUrl, currentUrl);
	}
	
	@Test
	public void emailTakenRegistrationFormTest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(2000);
		
		webDriver.findElement(By.cssSelector("#header-top > div > div.fks-dropdown.dropdown-alt.d-sm-flex > a.ml-2")).click();
		Thread.sleep(3000);
		webDriver.findElement(By.xpath("/html/body/div/div[1]/a[2]")).click();
		Thread.sleep(3000);
		
		WebElement name = webDriver.findElement(By.name("first_name"));
		name.sendKeys("Mirza");
		
		WebElement lastname = webDriver.findElement(By.name("last_name"));
		lastname.sendKeys("Niksic");
		
		WebElement email = webDriver.findElement(By.name("email"));
		email.sendKeys("mirza.niksic5@gmail.com");
		
		WebElement password = webDriver.findElement(By.name("password"));
		password.sendKeys("19461946");
		
		WebElement password_confirmation = webDriver.findElement(By.name("password_confirmation"));
		password_confirmation.sendKeys("19461946");
		Thread.sleep(3000);
		
		webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[7]/button")).click();
		Thread.sleep(3000);
		
		WebElement errorMessage = webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/form/div[3]/span"));
		assertEquals("The email has already been taken.", errorMessage.getText());
		
	}
	
	
	
	@Test
	public void loginPageTest() throws InterruptedException {
		webDriver.get("https://fksarajevo.ba/login");
		webDriver.manage().window().maximize();
		Thread.sleep(2000);
		

		WebElement email = webDriver.findElement(By.name("email"));
		email.sendKeys("mirza.niksic5@gmail.com");
		
		WebElement password = webDriver.findElement(By.name("password"));
		password.sendKeys("19461946");
		Thread.sleep(3000);
		
		webDriver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/form/div[3]/button")).click();
		Thread.sleep(8000);
		
		String mojeSarajevoUrl="https://fksarajevo.ba/moje-sarajevo";
		String currentUrl= webDriver.getCurrentUrl();
		assertEquals(mojeSarajevoUrl, currentUrl);
	}*/
	
	String findIfPresent(String source, HashSet<String> set)
	{
	   if (set.contains(source)) {
	      for (String obj : set) {
	        if (!obj.equals(source)) 
	          return obj;
	      } 
	   }

	  return null;
	}
	
	/*@Test
	void nikeSponsorIconTest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		String parentWindow = webDriver.getWindowHandle();
		String newWindow = "";
		String expectedNewWindowTitle = "Nike. Just Do It. Nike.com";
		System.out.println("Parent Window Title: " + webDriver.getTitle());
		
		webDriver.findElement(By.xpath("/html/body/nav/div/div[1]/a[2]/img")).click();
		Thread.sleep(5000);
		
		HashSet<String> allWindowHandles =  new HashSet<String>(webDriver.getWindowHandles());
		
		 if (allWindowHandles.size() > 1)
	        {
			 System.out.print("New window has been opened.");
	        }
		 	newWindow=findIfPresent(parentWindow,allWindowHandles);
	    
	        webDriver.switchTo().window(newWindow);
	        
	        System.out.println("New Window Title: " + webDriver.getTitle());
	        
	        assertEquals(expectedNewWindowTitle,webDriver.getTitle());
	}
	
	/*@Test
	void turkishAirlineSponsorIconTest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().fullscreen();
		String parentWindow = webDriver.getWindowHandle();
		String newWindow = "";
		String expectedNewWindowTitle = "Turkish Airlines ®️ | Flying to the Most Countries‎";
		Thread.sleep(2000);
		System.out.println("Parent Window Title: " + webDriver.getTitle());

		
		webDriver.findElement(By.xpath("/html/body/nav/div/div[1]/a[1]/img")).click();
		Thread.sleep(5000);
		
		HashSet<String> allWindowHandles =  new HashSet<String>(webDriver.getWindowHandles());
		
		 if (allWindowHandles.size() > 1)
	        {
			 System.out.print("New window has been opened.");
	        }
		 	newWindow=findIfPresent(parentWindow,allWindowHandles);
	    
	        webDriver.switchTo().window(newWindow);
	        
	        System.out.println("New Window Title: " + webDriver.getTitle());
	        
	        assertEquals(expectedNewWindowTitle,webDriver.getTitle());
	}
	
	@Test
	void facebookIconTest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().fullscreen();
		String parentWindow = webDriver.getWindowHandle();
		String newWindow = "";
		String expectedNewWindowTitle = "FK Sarajevo - Home | Facebook";
		Thread.sleep(2000);
		System.out.println("Parent Window Title: " + webDriver.getTitle());
		
		
		
		webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a[1]")).click();
		Thread.sleep(2000);
		
		HashSet<String> allWindowHandles =  new HashSet<String>(webDriver.getWindowHandles());
		
		 if (allWindowHandles.size() > 1)
	        {
			 System.out.print("New window has been opened.");
	        }
		 	newWindow=findIfPresent(parentWindow,allWindowHandles);
	    
	        webDriver.switchTo().window(newWindow);
	        
	        System.out.println("New Window Title: " + webDriver.getTitle());
	        
	        assertEquals(expectedNewWindowTitle,webDriver.getTitle());
	}
	
	@Test
	void instagramIconTest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().fullscreen();
		String parentWindow = webDriver.getWindowHandle();
		String newWindow = "";
		String expectedNewWindowTitle = "FK Sarajevo (@fk_sarajevo) • Instagram photos and videos";
		Thread.sleep(2000);
		System.out.println("Parent Window Title: " + webDriver.getTitle());
		
		
		
		webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a[2]")).click();
		Thread.sleep(2000);
		
		HashSet<String> allWindowHandles =  new HashSet<String>(webDriver.getWindowHandles());
		
		 if (allWindowHandles.size() > 1)
	        {
			 System.out.print("New window has been opened.");
	        }
		 	newWindow=findIfPresent(parentWindow,allWindowHandles);
	    
	        webDriver.switchTo().window(newWindow);
	        
	        System.out.println("New Window Title: " + webDriver.getTitle());
	        
	        assertEquals(expectedNewWindowTitle,webDriver.getTitle());
	}
	
	@Test
	void twitterIconTest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().fullscreen();
		String parentWindow = webDriver.getWindowHandle();
		String newWindow = "";
		String expectedNewWindowTitle = "FK Sarajevo (@FK_Sarajevo) / Twitter";
		Thread.sleep(2000);
		System.out.println("Parent Window Title: " + webDriver.getTitle());
		
		
		
		webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a[3]")).click();
		Thread.sleep(2000);
		
		HashSet<String> allWindowHandles =  new HashSet<String>(webDriver.getWindowHandles());
		
		 if (allWindowHandles.size() > 1)
	        {
			 System.out.print("New window has been opened.");
	        }
		 	newWindow=findIfPresent(parentWindow,allWindowHandles);
	    
	        webDriver.switchTo().window(newWindow);
	        
	        System.out.println("New Window Title: " + webDriver.getTitle());
	        
	        assertEquals(expectedNewWindowTitle,webDriver.getTitle());
	}
	
	@Test
	void youtubeIconTest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().fullscreen();
		String parentWindow = webDriver.getWindowHandle();
		String newWindow = "";
		String expectedNewWindowTitle = "FK Sarajevo - YouTube";
		Thread.sleep(2000);
		System.out.println("Parent Window Title: " + webDriver.getTitle());
		
		
		
		webDriver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a[4]")).click();
		Thread.sleep(2000);
		
		HashSet<String> allWindowHandles =  new HashSet<String>(webDriver.getWindowHandles());
		
		 if (allWindowHandles.size() > 1)
	        {
			 System.out.print("New window has been opened.");
	        }
		 	newWindow=findIfPresent(parentWindow,allWindowHandles);
	    
	        webDriver.switchTo().window(newWindow);
	        
	        System.out.println("New Window Title: " + webDriver.getTitle());
	        
	        assertEquals(expectedNewWindowTitle,webDriver.getTitle());
	}
	
	
	
	
	@Test
	public void aktuelnoDropdownTest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement aktuelnoDrp = webDriver.findElement(By.xpath("/html/body/nav/div/div[2]/div/ul/li[1]/button"));
		aktuelnoDrp.click();
		Thread.sleep(1000);
		
		webDriver.findElement(By.linkText("Vijesti")).click();
		String vijestiUrl= webDriver.getCurrentUrl();
		assertEquals("https://fksarajevo.ba/kategorija/vijesti", vijestiUrl);
		Thread.sleep(3000);
		
		webDriver.navigate().back();
		Thread.sleep(3000);
		
		WebElement aktuelnoDrp1 = webDriver.findElement(By.xpath("/html/body/nav/div/div[2]/div/ul/li[1]/button"));
		aktuelnoDrp1.click();
		Thread.sleep(3000);
		
		webDriver.findElement(By.linkText("Omladinski pogon")).click();
		String omladinskiUrl= webDriver.getCurrentUrl();
		assertEquals("https://fksarajevo.ba/kategorija/omladinski-pogon", omladinskiUrl);
		Thread.sleep(3000);
		
		webDriver.navigate().back();
		Thread.sleep(3000);
		
		WebElement aktuelnoDrp2 = webDriver.findElement(By.xpath("/html/body/nav/div/div[2]/div/ul/li[1]/button"));
		aktuelnoDrp2.click();
		Thread.sleep(3000);
		
		webDriver.findElement(By.linkText("Marketing")).click();
		String marketingUrl= webDriver.getCurrentUrl();
		assertEquals("https://fksarajevo.ba/kategorija/marketing", marketingUrl);
		Thread.sleep(3000);
		
		webDriver.navigate().back();
		Thread.sleep(3000);
		
		WebElement aktuelnoDrp3 = webDriver.findElement(By.xpath("/html/body/nav/div/div[2]/div/ul/li[1]/button"));
		aktuelnoDrp3.click();
		Thread.sleep(3000);
		
		webDriver.findElement(By.linkText("Najave")).click();
		String najaveUrl= webDriver.getCurrentUrl();
		assertEquals("https://fksarajevo.ba/kategorija/najave", najaveUrl);
		Thread.sleep(3000);
		
		webDriver.navigate().back();
		Thread.sleep(3000);
		
		WebElement aktuelnoDrp4 = webDriver.findElement(By.xpath("/html/body/nav/div/div[2]/div/ul/li[1]/button"));
		aktuelnoDrp4.click();
		Thread.sleep(3000);
		
		webDriver.findElement(By.linkText("Intervjui")).click();
		String intervjuiUrl= webDriver.getCurrentUrl();
		assertEquals("https://fksarajevo.ba/kategorija/intervjui", intervjuiUrl);
		Thread.sleep(3000);
		
		webDriver.navigate().back();
		Thread.sleep(3000);
		
		WebElement aktuelnoDrp5 = webDriver.findElement(By.xpath("/html/body/nav/div/div[2]/div/ul/li[1]/button"));
		aktuelnoDrp5.click();
		Thread.sleep(3000);
		
		webDriver.findElement(By.linkText("Klub u zajednici")).click();
		String klubUZajedniciUrl= webDriver.getCurrentUrl();
		assertEquals("https://fksarajevo.ba/kategorija/klub-u-zajednici", klubUZajedniciUrl);
		Thread.sleep(3000);
		
		webDriver.navigate().back();
		Thread.sleep(3000);
		
		WebElement aktuelnoDrp6 = webDriver.findElement(By.xpath("/html/body/nav/div/div[2]/div/ul/li[1]/button"));
		aktuelnoDrp6.click();
		Thread.sleep(3000);
		
		webDriver.findElement(By.linkText("Mediji o nama")).click();
		String medijiONamaUrl= webDriver.getCurrentUrl();
		assertEquals("https://fksarajevo.ba/kategorija/mediji-o-nama", medijiONamaUrl);
		Thread.sleep(1000);
	}
	
	@Test
	public void timDropdownTest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(2000);
		

		WebElement timDrp = webDriver.findElement(By.xpath("/html/body/nav/div/div[2]/div/ul/li[2]/button"));
		timDrp.click();
		Thread.sleep(1000);
		
		webDriver.findElement(By.linkText("Igrači")).click();
		String igraciUrl= webDriver.getCurrentUrl();
		assertEquals("https://fksarajevo.ba/prvi-tim/igraci", igraciUrl);
		Thread.sleep(3000);
		
		webDriver.navigate().back();
		Thread.sleep(3000);
		
		WebElement timDrp1 = webDriver.findElement(By.xpath("/html/body/nav/div/div[2]/div/ul/li[2]/button"));
		timDrp1.click();
		Thread.sleep(3000);
		
		webDriver.findElement(By.linkText("Stručni štab")).click();
		String strucniStabUrl= webDriver.getCurrentUrl();
		assertEquals("https://fksarajevo.ba/prvi-tim/strucni-stab", strucniStabUrl);
		Thread.sleep(3000);
		
		webDriver.navigate().back();
		Thread.sleep(3000);
		
		WebElement timDrp2 = webDriver.findElement(By.xpath("/html/body/nav/div/div[2]/div/ul/li[2]/button"));
		timDrp2.click();
		Thread.sleep(3000);
		
		webDriver.findElement(By.linkText("Medicinski tim")).click();
		String medicinskiUrl= webDriver.getCurrentUrl();
		assertEquals("https://fksarajevo.ba/prvi-tim/medicinski-tim", medicinskiUrl);
		Thread.sleep(3000);
		
		webDriver.navigate().back();
		Thread.sleep(1000);
	}
	
	@Test
	public void utakmiceTest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(2000);
		

		WebElement utakmiceDrp = webDriver.findElement(By.xpath("/html/body/nav/div/div[2]/div/ul/li[3]/button"));
		utakmiceDrp.click();
		Thread.sleep(1000);
		
		webDriver.findElement(By.linkText("Raspored")).click();
		String rasporedUrl= webDriver.getCurrentUrl();
		assertEquals("https://fksarajevo.ba/utakmice/raspored", rasporedUrl);
		
		Thread.sleep(3000);
		
		webDriver.navigate().back();
		Thread.sleep(3000);
		
		WebElement utakmiceDrp1 = webDriver.findElement(By.xpath("/html/body/nav/div/div[2]/div/ul/li[3]/button"));
		utakmiceDrp1.click();
		Thread.sleep(3000);
		
		webDriver.findElement(By.linkText("Rezultati")).click();
		String rezultatiUrl= webDriver.getCurrentUrl();
		assertEquals("https://fksarajevo.ba/utakmice/rezultati", rezultatiUrl);
		
		Thread.sleep(3000);
		
		webDriver.navigate().back();
		Thread.sleep(3000);
	}
	
	@Test
	public void ulazniceTest() throws InterruptedException {
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(2000);
		

		WebElement ulazniceDrp = webDriver.findElement(By.xpath("/html/body/nav/div/div[2]/div/ul/li[4]/button"));
		ulazniceDrp.click();
		Thread.sleep(1000);
		
		webDriver.findElement(By.linkText("Pojedinačne ulaznice")).click();
		String pojedinacneUrl= webDriver.getCurrentUrl();
		assertEquals("https://fksarajevo.ba/karte/pojedinacne-ulaznice", pojedinacneUrl);
		
		Thread.sleep(3000);
		
		webDriver.navigate().back();
		Thread.sleep(3000);
		
		WebElement ulazniceDrp1 = webDriver.findElement(By.xpath("/html/body/nav/div/div[2]/div/ul/li[4]/button"));
		ulazniceDrp1.click();
		Thread.sleep(3000);
		
		webDriver.findElement(By.linkText("Sezonske ulaznice")).click();
		String sezonskeUrl= webDriver.getCurrentUrl();
		assertEquals("https://fksarajevo.ba/karte/sezonske-ulaznice", sezonskeUrl);
		
		Thread.sleep(3000);
		
		webDriver.navigate().back();
		Thread.sleep(3000);
	}
	
	@Test
	public void clanstvoTest() throws InterruptedException {
		
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(4000);
		
		webDriver.findElement(By.xpath("/html/body/nav/div/div[2]/div/ul/li[5]/a")).click();
		Thread.sleep(2000);

		webDriver.findElement(By.xpath("/html/body/main/section[1]/div/div[1]/div[1]/div/a[1]")).click();
		Thread.sleep(2000);
	
		WebElement name = webDriver.findElement(By.id("firstName"));
		name.sendKeys("Mirza");
		
		WebElement lastname = webDriver.findElement(By.id("lastName"));
		lastname.sendKeys("Niksic");
		
		Select birthDateMonth = new Select(webDriver.findElement(By.id("month")));
		birthDateMonth.selectByVisibleText("Oktobar");
		
		WebElement birthDateDay = webDriver.findElement(By.id("day"));
		birthDateDay.sendKeys("26");
		
		WebElement birthDateYear = webDriver.findElement(By.id("year"));
		birthDateYear.sendKeys("1999");
		
		webDriver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div[2]/form/section/div[2]/div[4]/div/div[1]/label")).click();
		
		WebElement phoneNumber = webDriver.findElement(By.id("cellphone"));
		phoneNumber.sendKeys("062671753");

		WebElement email = webDriver.findElement(By.id("email"));
		email.sendKeys("mirza.niksic5@gmail.com");
		Thread.sleep(2000);
		
		webDriver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[3]/div[3]/div/form/button")).click();
		Thread.sleep(2000);
		
		Select country = new Select(webDriver.findElement(By.id("country")));
		country.selectByVisibleText("Bosna i Hercegovina");
		
		webDriver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div[2]/form/section/div[4]/div[2]/div/div[1]/div")).click();
		
		WebElement opstina =webDriver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div[2]/form/section/div[4]/div[2]/div/div[2]/input"));
		opstina.sendKeys("Ilidža");
		opstina.sendKeys(Keys.ENTER);
		
		WebElement address = webDriver.findElement(By.id("address"));
		address.sendKeys("Ruzevik 49");
	    Thread.sleep(4000);
	    
	    webDriver.findElement(By.id("nextBtn")).click();
	    Thread.sleep(2000);
	    
	    webDriver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div[3]/form/section/div[2]/div[2]/div")).click();
	    Thread.sleep(2000);
	}
	
	@Test
	public void bordoTVButtonTest() throws InterruptedException {
		
		webDriver.get(baseUrl);
		webDriver.manage().window().maximize();
		Thread.sleep(4000);
		
		webDriver.findElement(By.xpath("/html/body/nav/div/div[2]/div/ul/li[6]/a")).click();
		Thread.sleep(2000);
		
		String currentUrl = webDriver.getCurrentUrl();
		assertEquals("https://fksarajevo.ba/bordo-tv", currentUrl);
	}
	


	
	@Test
	public void productBuyTest() throws InterruptedException {
		webDriver.get("https://fanshop.fksarajevo.ba/korpa");
		webDriver.manage().window().maximize();
		Thread.sleep(4000);
		
		webDriver.findElement(By.xpath("/html/body/div/div/div/a")).click();
		Thread.sleep(2000);
		
		webDriver.findElement(By.xpath("/html/body/div/section/div/div[4]/a/div[1]/div")).click();
		Thread.sleep(2000);
		
		Select velicina = new Select(webDriver.findElement(By.id("item_variation_id")));
		velicina.selectByVisibleText("XL");
		Thread.sleep(2000);
		
		WebElement kolicina = webDriver.findElement(By.id("quantity"));
		kolicina.sendKeys(Keys.BACK_SPACE);
		kolicina.sendKeys("2");
		Thread.sleep(4000);
		
		webDriver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/div[3]/button")).click();
		
		WebElement uspjesnoDodano = webDriver.findElement(By.xpath("/html/body/div/div[1]"));
		String str = uspjesnoDodano.getText();
		assertEquals("Proizvod je uspješno dodan u vašu korpu", str);
		Thread.sleep(2000);
	
		webDriver.findElement(By.xpath("/html/body/nav[1]/div/div/div[3]/a")).click();
		Thread.sleep(4000);
		
		WebElement naziv = webDriver.findElement(By.tagName("h3"));
		String nazivStr = naziv.getText();
		assertEquals("Takmičarski dres 2020/21 druga garnitura", nazivStr);
		
		webDriver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/a")).click();
		Thread.sleep(2000);
		
		webDriver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[3]/div[2]/div[3]/div/div/label")).click();
		Thread.sleep(2000);
		
		WebElement name = webDriver.findElement(By.id("first_name"));
		name.sendKeys("Mirza");
		
		WebElement lastname = webDriver.findElement(By.id("last_name"));
		lastname.sendKeys("Niksic");
		
		WebElement email = webDriver.findElement(By.id("email"));
		email.sendKeys("mirza.niksic5@gmail.com");
		
		WebElement phoneNumber = webDriver.findElement(By.id("cellphone"));
		phoneNumber.sendKeys("062671753");
		
		WebElement address = webDriver.findElement(By.id("address"));
		address.sendKeys("Ruzevik 49");

		WebElement city = webDriver.findElement(By.id("city"));
		city.sendKeys("Sarajevo");
		
		WebElement zip = webDriver.findElement(By.id("zip"));
		zip.sendKeys("71000");
		Thread.sleep(2000);
		
		webDriver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[3]/div[3]/div/form/button")).click();
		Thread.sleep(2000);
		
		WebElement cardholder_name = webDriver.findElement(By.id("cardholder_name"));
		cardholder_name.sendKeys("Mirza Niksic");
		
		WebElement card_number = webDriver.findElement(By.id("card_number"));
		card_number.sendKeys("152548612354");
		
		WebElement cvv = webDriver.findElement(By.id("cvv"));
		cvv.sendKeys("123");
		
		WebElement exp_month = webDriver.findElement(By.id("exp_month"));
		exp_month.sendKeys("12");
		
		WebElement exp_year = webDriver.findElement(By.id("exp_year"));
		exp_year.sendKeys("21");
		
		webDriver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[3]/div/div/form/button")).click();
		Thread.sleep(2000);
		
		String currentUrl = webDriver.getCurrentUrl();
		assertEquals("https://fanshop.fksarajevo.ba/checkout", currentUrl);
	}
	
	
	@Test
	public void searchBarTest() throws InterruptedException {
		
		webDriver.get("https://fanshop.fksarajevo.ba/");
		webDriver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement searchBar = webDriver.findElement(By.xpath("/html/body/nav[1]/div/form/div/input"));
		searchBar.click();
		searchBar.sendKeys("ruksak");
		searchBar.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		String currentUrl = webDriver.getCurrentUrl();
		assertEquals("https://fanshop.fksarajevo.ba/pretraga?q=ruksak", currentUrl);
	}*/
	
	
	
	

	@AfterAll
	static void tearDown() {
		webDriver.close();
	}

}
