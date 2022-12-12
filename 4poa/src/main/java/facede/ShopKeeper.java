package facede;

public class ShopKeeper {
	private FabricaMobile iphone;
	private FabricaMobile samsung;
	private FabricaMobile nokia;

	
	public ShopKeeper() {
		iphone = new Iphone();
		samsung = new Samsung();
		nokia = new Nokia();
	}

	public void iphonePhoneSale() {
		iphone.getMobileModelNumber();
		iphone.getMobilePrice();
	}

	public void samsungPhoneSale() {
		samsung.getMobileModelNumber();
		samsung.getMobilePrice();
	}

	public void nokiaPhoneSale() {
		nokia.getMobileModelNumber();
		nokia.getMobilePrice();
	}
}
