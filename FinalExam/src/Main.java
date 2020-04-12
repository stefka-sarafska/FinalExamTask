import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		Product[] products = new Product[50];
		Color[] colors = new Color[4];
		colors[0] = Color.green;
		colors[1] = Color.black;
		colors[2] = Color.blue;
		colors[3] = Color.red;
		int colorCount = 0;
		for (int i = 0; i < products.length-1; i++) {
			for (int j = colorCount; j < colors.length; j++) {
				products[i] = new Marker(colors[j], "helikon", true, 2.5, 150, false);
				products[i+1] = new Pen(colors[j], "pen", false);
				if (j < colors.length - 1) {
					colorCount = ++j;
				} else {
					colorCount = 0;
				}
				break;
			}

		}

		List<Product> finalProducts = new ArrayList<>();
		finalProducts.addAll(Arrays.asList(products));

		for (int i = 0; i < finalProducts.size(); i++) {
			Product product = finalProducts.get(i);
			if (i % 2 == 0 && product.getColor().equals(Color.blue)) {
				System.out.println(product);
			}
		}

	}

}
