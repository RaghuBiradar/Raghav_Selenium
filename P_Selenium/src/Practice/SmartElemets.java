package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartElemets {

	public SmartElemets(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy (id = "shopbar-wishlist") 
	private WebElement Wishlist;

	@FindBy(xpath = "//a[@title='Remove']")
	private WebElement removeProduct;

	@FindBy(xpath = "//a[@title='Add to cart']")
	private WebElement MoovetheProductTocart;

	@FindBy(xpath = "//a[.='Trainer Ball']/../../../..//i[@class='fa fa-plus']")
	private WebElement IncreaseQtyInWishlist;

	@FindBy(xpath = "//a[.='Trainer Ball']/../../../..//i[@class='fa fa-minus']")
	private WebElement DecreaseQtyInWishlist;

	//Shopping cart

	@FindBy(id ="shopbar-cart")
	private WebElement Shoppingcart;

	@FindBy(xpath = "//a[contains(text(),'Go to cart')]")
	private WebElement GotoCart;

	@FindBy(xpath = "//a[.='Trainer Ball']/../../../..//i[@class='fa fa-plus']")
	private WebElement IncreaseQtyInCart;

	@FindBy(xpath = "//a[.='Trainer Ball']/../../../..//i[@class='fa fa-minus']")
	private WebElement DecreaseQtyInCart;
	
	@FindBy(xpath = "//a[@data-action='addfromcart']")
	private WebElement movetheProductToWishlist;
	
	public WebElement getMovetheProductToWishlist() {
		return movetheProductToWishlist;
	}

	@FindBy(xpath = "//a[@title='Remove']")
	private WebElement removeProductFromCart;
	
	@FindBy(id = "checkout")
	private WebElement Checkout;


	////////////////////////////////////////////////////

	public WebElement getWishlist() {
		return Wishlist;
	}

	public void setWishlist(WebElement wishlist) {
		Wishlist = wishlist;
	}

	public WebElement getRemoveProduct() {
		return removeProduct;
	}

	public void setRemoveProduct(WebElement removeProduct) {
		this.removeProduct = removeProduct;
	}

	public WebElement getMoovetheProductTocart() {
		return MoovetheProductTocart;
	}

	public void setMoovetheProductTocart(WebElement moovetheProductTocart) {
		MoovetheProductTocart = moovetheProductTocart;
	}

	public WebElement getIncreaseQtyInWishlist() {
		return IncreaseQtyInWishlist;
	}

	public WebElement getIncreaseQtyInCart() {
		return IncreaseQtyInCart;
	}

	public WebElement getDecreaseQtyInWishlist() {
		return DecreaseQtyInWishlist;
	}

	public WebElement getShoppingcart() {
		return Shoppingcart;
	}


	public WebElement getGotoCart() {
		return GotoCart;
	}

	

	public WebElement getIncreaseQty() {
		return IncreaseQtyInCart;
	}

	public WebElement getDecreaseQtyInCart() {
		return DecreaseQtyInCart;
	}
	

	public WebElement getRemoveProductFromCart() {
		return removeProductFromCart;
	}

	public WebElement getCheckout() {
		return Checkout;
	}

	


}
