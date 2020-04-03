package Implement_Hybrid_Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OR {
	    
	    //Login
		By a=By.name("userName");
		By b=By.name("password");
		By c=By.name("login");
		
		//Register
		By d=By.linkText("REGISTER");
		By e=By.name("firstName");
		By f=By.name("lastName");
		By g=By.name("phone");
		By h=By.name("userName");
		By i=By.name("address1");
		By j=By.name("city");
		By k=By.name("state");
		By l=By.name("postalCode");
		By m=By.name("country");
		By n=By.name("email");
		By o=By.name("password");
		By p=By.name("confirmPassword");
		By q=By.name("register");
		By r=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/a[1]");
		
		//Flight Book
		By s=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]");
		By t=By.name("passCount");
		By u=By.name("fromPort");
		By v=By.name("fromMonth");
		By w=By.name("fromDay");
		By x=By.name("toPort");
		By y=By.name("toMonth");
		By av=By.name("toDay");
		By aw=By.name("servClass");
		By z=By.name("airline");
		By aa=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td/input");
		By ab=By.name("outFlight");
		By ac=By.name("inFlight");
		By ad=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/p/input");
		By ae=By.name("passFirst0");
		By af=By.name("passLast0");
		By ax=By.name("pass.0.meal");
		By ag=By.name("creditCard");
		By ah=By.name("creditnumber");
		By ai=By.name("cc_exp_dt_mn");
		By aj=By.name("cc_exp_dt_yr");
		By ak=By.name("cc_frst_name");
		By al=By.name("cc_mid_name");
		By am=By.name("cc_last_name");
		By an=By.name("ticketLess");
		By ao=By.name("billAddress1");
		By ap=By.name("delCity");
		By aq=By.name("delState");
		By ar=By.name("delZip");
		By as=By.name("delCountry");
		By at=By.name("buyFlights");
		
		//Sign-off
		By au=By.linkText("SIGN-OFF");
		
		//Logout button after flight booking
		//By ay=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[7]/td/table/tbody/tr/td[3]/a/img");
		
		private WebDriver wd;
		
		public OR(WebDriver wd) {
			this.wd=wd;
		}
		public void launch() {
			wd.get("http://newtours.demoaut.com/");
			wd.manage().window().maximize();
			wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		public void register() throws InterruptedException {
			wd.findElement(d).click();
			Thread.sleep(3000);
			wd.findElement(e).sendKeys("Rishabh");
			Thread.sleep(1000);
			wd.findElement(f).sendKeys("Saxena");
			Thread.sleep(1000);
			wd.findElement(g).sendKeys("9810098765");
			Thread.sleep(1000);
			wd.findElement(h).sendKeys("Rishabh");
			Thread.sleep(1000);
			wd.findElement(i).sendKeys("B-10 Sector-1");
			Thread.sleep(1000);
			wd.findElement(j).sendKeys("Noida");
			Thread.sleep(1000);
			wd.findElement(k).sendKeys("Uttar Pradesh");
			Thread.sleep(1000);
			wd.findElement(l).sendKeys("201301");
			Thread.sleep(1000);
			wd.findElement(m).sendKeys("26");
			Thread.sleep(1000);
			wd.findElement(n).sendKeys("rishabhrhea95@gmail.com");
			Thread.sleep(1000);
			wd.findElement(o).sendKeys("1234");
			Thread.sleep(1000);
			wd.findElement(p).sendKeys("1234");
			Thread.sleep(1000);
			wd.findElement(q).click();
			wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		public void login() throws InterruptedException {
			//wd.findElement(r).click();
			wd.findElement(a).sendKeys("111");
			Thread.sleep(1000);
			wd.findElement(b).sendKeys("111");
			Thread.sleep(1000);
			wd.findElement(c).click();
			wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		public void flight() throws InterruptedException {
			wd.findElement(s).click();
			Thread.sleep(1000);
			wd.findElement(t).sendKeys("3");
			Thread.sleep(1000);
			wd.findElement(u).sendKeys("Zurich");
			Thread.sleep(1000);
			wd.findElement(v).sendKeys("1");
			Thread.sleep(1000);
			wd.findElement(w).sendKeys("20");
			Thread.sleep(1000);
			wd.findElement(x).sendKeys("New York");
			Thread.sleep(1000);
			wd.findElement(y).sendKeys("4");
			Thread.sleep(1000);
			wd.findElement(av).sendKeys("2");
			Thread.sleep(1000);
			wd.findElement(aw).sendKeys("First");
			Thread.sleep(1000);
			wd.findElement(z).sendKeys("Unified Airlines");
			Thread.sleep(1000);
			wd.findElement(aa).click();
			Thread.sleep(1000);
			wd.findElement(ab).sendKeys("Unified Airlines$363$281$11:24");
			Thread.sleep(1000);
			wd.findElement(ac).sendKeys("Unified Airlines$633$303$18:44");
			Thread.sleep(1000);
			wd.findElement(ad).click();
			Thread.sleep(2000);
			wd.findElement(ae).sendKeys("Rishabh");
			Thread.sleep(1000);
			wd.findElement(af).sendKeys("Saxena");
			Thread.sleep(1000);
			wd.findElement(ax).sendKeys("HNML");
			Thread.sleep(1000);
			wd.findElement(ag).sendKeys("BA");
			Thread.sleep(1000);
			wd.findElement(ah).sendKeys("3498525262725295");
			Thread.sleep(1000);
			wd.findElement(ai).sendKeys("03");
			Thread.sleep(1000);
			wd.findElement(aj).sendKeys("2010");
			Thread.sleep(1000);
			wd.findElement(ak).sendKeys("Rishabh");
			Thread.sleep(1000);
			wd.findElement(al).sendKeys("Tester");
			Thread.sleep(1000);
			wd.findElement(am).sendKeys("Saxena");
			Thread.sleep(1000);
			wd.findElement(an).click();
			Thread.sleep(1000);
			wd.findElement(ao).sendKeys("B-10 Sector-2");
			Thread.sleep(1000);
			wd.findElement(ap).sendKeys("Noida");
			Thread.sleep(1000);
			wd.findElement(aq).sendKeys("Uttar Pradesh");
			Thread.sleep(1000);
			wd.findElement(ar).sendKeys("201301");
			Thread.sleep(1000);
			wd.findElement(as).sendKeys("26");
			Thread.sleep(1000);
			wd.findElement(an).sendKeys("checkbox");
			Thread.sleep(1000);
			wd.findElement(at).click();
			wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		public void off1() throws InterruptedException {
			wd.findElement(au).click();
			Thread.sleep(3000);
		}
		public void off2() throws InterruptedException {
			wd.findElement(au).click();
			Thread.sleep(3000);
		}
}
