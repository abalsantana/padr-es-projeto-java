package facede;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadePatternClient {

	public static void main(String[] args) {
		int choice = 0;
		// public static void main(String args[]) throws NumberFormatException,
		// IOException {
		do {
			System.out.print("========= Mobile Shop ============ \n");
			System.out.print("1. IPHONE.              \n");
			System.out.print("2. SAMSUNG.              \n");
			System.out.print("3. NOKIA.                 \n");
			System.out.print("4. Exit.                   \n");
			System.out.print("Enter your choice: ");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				choice = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ShopKeeper shopKeeper = new ShopKeeper();

			switch (choice) {
			case 1: {
				shopKeeper.iphonePhoneSale();
			}
				break;
			case 2: {
				shopKeeper.samsungPhoneSale();
			}
				break;
			case 3: {
				shopKeeper.nokiaPhoneSale();
			}
				break;
			default: {
				System.out.println("Nothing You purchased");
			}
				return;
			}
		} while (choice != 4);
	}

}
