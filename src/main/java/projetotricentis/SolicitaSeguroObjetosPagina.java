package projetotricentis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class SolicitaSeguroObjetosPagina {
	WebDriver driver = new ChromeDriver();
	
	// Abas informações
	protected WebElement entervehicledata;
	protected WebElement enterinsurantdata;
	protected WebElement enterproductdata;
	protected WebElement selectpriceoption;
	protected WebElement sendquote;
	
	// Campos dados veiculo
	
	protected WebElement make;
	protected WebElement model;
	protected WebElement cylindercapacity;
	protected WebElement engineperformance;
	protected WebElement dateofmanufacture;
	protected WebElement numberofseats;
	protected WebElement righthanddriveyes;
	protected WebElement numberofseatsmotorcycle;
	protected WebElement fuel;
	protected WebElement payload;
	protected WebElement totalweight;
	protected WebElement listprice;
	protected WebElement licenseplatenumber;
	protected WebElement annualmileage;
	protected WebElement nextenterinsurantdata;
	
	// Campos dados seguro
	protected WebElement firstname;
	protected WebElement lastname;
	protected WebElement birthdate;
	protected WebElement gendermale;
	protected WebElement genderfemale;
	protected WebElement streetaddress;
	protected WebElement country;
	protected WebElement zipcode;
	protected WebElement city;
	protected WebElement occupation;
	protected WebElement speeding;
	protected WebElement bungeejumping;
	protected WebElement cliffdiving;
	protected WebElement skydiving;
	protected WebElement other;
	protected WebElement website;
	protected WebElement picture;
	protected WebElement open;
	protected WebElement preventervehicledata;
	protected WebElement nextenterproductdata;
	
	// Campos dados produto

	protected WebElement startdate;
	protected WebElement openstartdatecalender;
	protected WebElement insurancesum;
	protected WebElement meritrating;
	protected WebElement damageinsurance;
	protected WebElement EuroProtection;
	protected WebElement LegalDefenseInsurance;
	protected WebElement courtesycar;
	protected WebElement preventerinsurancedata;
	protected WebElement nextselectpriceoption;
	
	// Campos opcao de preco

	protected WebElement selectsilver;
	protected WebElement selectgold;
	protected WebElement selectplatinum;
	protected WebElement selectultimate;
	protected WebElement viewquote;
	protected WebElement downloadquote;
	protected WebElement preventerproductdata;
	protected WebElement nextsendquote;
	

	// Campos enviar cotacao

	protected WebElement email;
	protected WebElement phone;
	protected WebElement username;
	protected WebElement password;
	protected WebElement confirmpassword;
	protected WebElement Comments;
	protected WebElement prevselectpriceoption;
	protected WebElement sendemail;
	
	
	protected WebElement msgsuccess = driver.findElement(By.name("Sending e-mail success!"));
	protected WebElement btnok  = driver.findElement(By.name("OK"));

}
