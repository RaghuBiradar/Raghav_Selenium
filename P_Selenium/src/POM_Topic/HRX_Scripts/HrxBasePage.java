package POM_Topic.HRX_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HrxBasePage {


	public WebElement getSportsShoes() {
	return SportsShoes;
}

public WebElement getBuyNow() {
	return BuyNow;
}

public WebElement getProductDescription() {
	return ProductDescription;
}

	public HrxBasePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
}
	@FindBy(xpath =   "//p[contains(text(),' Collection ')]")
	private WebElement collectionElement;
	
	public WebElement getCollectionElement() {
		return collectionElement;
	}
	
	@FindBy(linkText = "Footwear")
	private WebElement footwear;

	public WebElement getFootwear() {
		return footwear;
	}
	@FindBy(xpath = "//h2[contains(text(),'SHOES ')]")
	private WebElement shoes;

	public WebElement getShoes() {
		return shoes;
	}
	@FindBy(xpath = "(//img[contains(@class,'responsive')])[3]")
	private WebElement SportsShoes;

	public WebElement getSpecifications() {
		return Specifications;
	}

	public void setSpecifications(WebElement specifications) {
		Specifications = specifications;
	}

	public WebElement getProdDes() {
		return ProdDes;
	}
	@FindBy(xpath = "//button[text()=' Buy Now ']")
	private WebElement BuyNow;
	
	@FindBy(xpath = "//h4[text()=' Product Description ']")
	private WebElement ProductDescription;
	
	@FindBy(xpath = "//h4[text()=' Product Description ']")
	private WebElement ProdDes;

	public void setProductDescription(WebElement productDescription) {
		ProductDescription = productDescription;
	}
	
	@FindBy(xpath = "//img[contains(@class,'product-img-h450px w-full object-contain')][1]")
	private WebElement ShoesImage;

	public WebElement getShoesImage() {
		return ShoesImage;
	}

	public void setShoesImage(WebElement shoesImage) {
		ShoesImage = shoesImage;
	}
	@FindBy(xpath = "//h4[text()='Specifications']")
	private WebElement Specifications;
	
	
	




}	
