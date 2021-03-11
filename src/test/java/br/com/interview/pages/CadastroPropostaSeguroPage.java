package br.com.interview.pages;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastroPropostaSeguroPage {

	private WebDriver driver;
	
	public CadastroPropostaSeguroPage(WebDriver driver) {
		this.driver = driver;
	}

	public void preencheMake(String make) {
		Select selectMake = new Select(driver.findElement(By.cssSelector("#make")));
		selectMake.selectByValue(make);
	}
	
	public void preencheModel(String type) {
		Select selectModel = new Select(driver.findElement(By.cssSelector("#model")));
		selectModel.selectByValue(type);
	}
	
	public void preencheCylinderCapacity(String cylinderCapacity) {
		driver.findElement(By.cssSelector("#cylindercapacity")).sendKeys(cylinderCapacity);
	}

	public void preencheEnginePerformance(String enginePerformance) {
		driver.findElement(By.cssSelector("#engineperformance")).sendKeys(enginePerformance);
	}

	public void preencheDateOfManufacture(String dateOfManufacture) {
		driver.findElement(By.cssSelector("#dateofmanufacture")).sendKeys(dateOfManufacture);
	}
	
	public void preencheRightHandDrive() {
		driver.findElement(By.cssSelector("#righthanddriveyes~span")).click();
	}

	public void preencheNumberOfSeats(String numberOfSeats) {
		Select selectNumberOfseats = new Select(driver.findElement(By.cssSelector("#numberofseats")));
		selectNumberOfseats.selectByValue(numberOfSeats);
	}
	public void preencheNumberOfSeatsMotorcycle(String numberOfSeatsMotorcycle) {
		Select selectNumberOfSeatsMotorcycle = new Select(driver.findElement(By.cssSelector("#numberofseatsmotorcycle")));
		selectNumberOfSeatsMotorcycle.selectByValue(numberOfSeatsMotorcycle);
	}

	public void preencheFuelType(String fuelType) {
		Select selectFuel = new Select(driver.findElement(By.cssSelector("#fuel")));
		selectFuel.selectByValue(fuelType);
	}

	public void preenchePayload(String payload) {
		driver.findElement(By.cssSelector("#payload")).sendKeys(payload);
	}
	
	public void preencheTotalWeight(String totalWeight) {
		driver.findElement(By.cssSelector("#totalweight")).sendKeys(totalWeight);
	}
	
	public void preencheListPrice(String listPrice) {
		driver.findElement(By.cssSelector("#listprice")).sendKeys(listPrice);
	}

	public void preencheLicensePlateNumber(String plateNumber) {
		driver.findElement(By.cssSelector("#licenseplatenumber")).sendKeys(plateNumber);
	}

	public void preencheAnnualMileage(String annualMileage) {
		driver.findElement(By.cssSelector("#annualmileage")).sendKeys(annualMileage);
	}

	public void preencheFirstName(String firstName) {
		driver.findElement(By.cssSelector("#firstname")).sendKeys(firstName);
	}

	public void preencheLastName(String lastName) {
		driver.findElement(By.cssSelector("#lastname")).sendKeys(lastName);
	}

	public void preencheDateOfBirth(String dateOfBrith) {
		driver.findElement(By.cssSelector("#birthdate")).sendKeys(dateOfBrith);
	}

	public void preencheGender() {
		driver.findElement(By.cssSelector("#gendermale~span")).click();
	}

	public void preencheStreetAddress(String streetAddress) {
		driver.findElement(By.cssSelector("#streetaddress")).sendKeys(streetAddress);
	}

	public void preencheCountry(String country) {
		Select selectCountry = new Select(driver.findElement(By.cssSelector("#country")));
		selectCountry.selectByValue(country);
	}

	public void preencheZipCode(String zipCode) {
		driver.findElement(By.cssSelector("#zipcode")).sendKeys(zipCode);
	}

	public void preencheCity(String city) {
		driver.findElement(By.cssSelector("#city")).sendKeys(city);
	}

	public void preencheOccupation(String occupation) {
		Select selectOccupation = new Select(driver.findElement(By.cssSelector("#occupation")));
		selectOccupation.selectByValue(occupation);
	}

	public void preencheHobbies() {
		driver.findElement(By.cssSelector("#other~span")).click();
	}

	public void preencheWebsite() {
		driver.findElement(By.cssSelector("#website")).sendKeys("www.interview.com");
	}

	public void preenchePicture() {
		File directory = new File("src/test/resources/NOTA_FISCAL.pdf");
		driver.findElement(By.cssSelector("#picturecontainer")).sendKeys(directory.getAbsolutePath());
	}

	public void preencheStartDate() {
		Date dataInicial = new Date();
		dataInicial = DateUtils.addMonths(dataInicial, 1);
		dataInicial = DateUtils.addDays(dataInicial, 1);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		driver.findElement(By.cssSelector("#startdate")).sendKeys(formatter.format(dataInicial));
		
	}

	public void preencheInsuranceSum(String insuranceSum) {
		Select selectInsuranceSum = new Select(driver.findElement(By.cssSelector("#insurancesum")));
		selectInsuranceSum.selectByValue(insuranceSum);
	}

	public void preencheMeritRating(String meritRating) {
		Select selectMeritRating = new Select(driver.findElement(By.cssSelector("#meritrating")));
		selectMeritRating.selectByValue(meritRating);
	}

	public void preencheDamageInsurance(String damageInsurance) {
		Select selectDamageInsurance = new Select(driver.findElement(By.cssSelector("#damageinsurance")));
		selectDamageInsurance.selectByValue(damageInsurance);
	}

	public void preencheOptionalProducts() {
		driver.findElement(By.cssSelector("#EuroProtection~span")).click();
	}

	public void preencheCourtesyCar() {
		Select selectCourtesyCar = new Select(driver.findElement(By.cssSelector("#courtesycar")));
		selectCourtesyCar.selectByValue("Yes");
	}

	public void preenchePriceOption(String price) {
		switch (price) {
		case "Silver":
			driver.findElement(By.cssSelector("#selectsilver~span")).click();
			break;
		case "Gold":
			driver.findElement(By.cssSelector("#selectgold~span")).click();
			break;
		case "Platinum":
			driver.findElement(By.cssSelector("#selectplatinum~span")).click();
			break;
		case "Ultimate":
			driver.findElement(By.cssSelector("#selectultimate~span")).click();
			break;
		}
	}

	public void preencheEMail(String email) {
		driver.findElement(By.cssSelector("#email")).sendKeys(email);
	}

	public void preenchePhone(String telefone) {
		driver.findElement(By.cssSelector("#phone")).sendKeys(telefone);

	}

	public void preencheUsername(String user) {
		driver.findElement(By.cssSelector("#username")).sendKeys(user);


	}

	public void preenchePasswordEConfirmation(String senha) {
		driver.findElement(By.cssSelector("#password")).sendKeys(senha);
		driver.findElement(By.cssSelector("#confirmpassword")).sendKeys(senha);
	}

	public void preencheComments(String comentario) {
		driver.findElement(By.cssSelector("#Comments")).sendKeys(comentario);		
	}

	public void clicarNext() {
		if (driver.findElements(By.cssSelector("section[style='display: block;'] > div#quote-container > "
				+ "div.field.buttons"+ " > button[id^='next']")).isEmpty()) {
			driver.findElement(By.cssSelector("section[style='display: block;'] > div.field.buttons"
					+ " > button[id^='next']")).click();			
		}else {
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("section[style='display: "
					+ "block;'] >div#quote-container  > "
					+ "div.field.buttons"+ " > button[id^='next']")));
			driver.findElement(By.cssSelector("section[style='display: block;'] >div#quote-container  > "
					+ "div.field.buttons"+ " > button[id^='next']")).click();
		}
	}

	public void clicarSend() {
		driver.findElement(By.cssSelector("#sendemail")).click();		
		

	}
	
	public void preencherAbaEnterVehicleData() {
		preencheMake("Suzuki");
		preencheModel("Scooter");
		preencheCylinderCapacity("125");
		preencheEnginePerformance("15");
		preencheDateOfManufacture("01/01/2021");
		preencheNumberOfSeats("2");
		preencheRightHandDrive();
		preencheNumberOfSeatsMotorcycle("2");
		preencheFuelType("Petrol");
		preenchePayload("400");
		preencheTotalWeight("600");
		preencheListPrice("30000");
		preencheLicensePlateNumber("123456");
		preencheAnnualMileage("1234");
		clicarNext();
	}
	
	public void preencherAbaEnterInsurantData() {
		preencheFirstName("Matheus");
		preencheLastName("Molina");
		preencheDateOfBirth("06/25/1995");
		preencheGender();
		preencheStreetAddress("Rua Miguel Mascarenhas, 190");
		preencheCountry("Brazil");
		preencheZipCode("03570220");
		preencheCity("São Paulo");
		preencheOccupation("Employee");
		preencheHobbies();
		preencheWebsite();
		preenchePicture();
		clicarNext();
	}
	
	public void preencherAbaEnterProductData() {
		preencheStartDate();
		preencheInsuranceSum("3000000");
		preencheMeritRating("Super Bonus");
		preencheDamageInsurance("Full Coverage");
		preencheOptionalProducts();
		preencheCourtesyCar();
		clicarNext();
	}
	
	public void preencherAbaSendQuote() {
		preencheEMail("matheusmolina2@hotmail.com");
		preenchePhone("11954546637");
		preencheUsername("Matheus");
		preenchePasswordEConfirmation("123456abcABC.");
		preencheComments("Comentário");
	}
	
	public WebElement buscarTextoAlerta() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.sweet-alert."
				+ "showSweetAlert.visible > h2")));
		return driver.findElement(By.cssSelector("div.sweet-alert.showSweetAlert.visible > h2"));
	}
	
}
