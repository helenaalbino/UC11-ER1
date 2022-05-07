package testesenaisp;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testesenaisp {
	private WebDriver driver;
	
	@Before
	public void abrirNavegador() {
		System.setProperty("webdriver.chrome.driver", "C:\\Arquivos de Programas\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
/*	@Test
	public void testeNavegador() {
		driver.get("https://online.sp.senai.br/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("s1")).sendKeys("gestão");
		driver.findElement(By.id("search-button")).click();
	}*/
	
	@Test
	public void testeNavegador() {
		driver.get("https://online.sp.senai.br/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("gestão");
		driver.findElement(By.id("Busca1_btnBusca")).click();
	}
}
