import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
	public static void main(String[] args) {

		Product[] products = new Product[50];
		List<Color> colors = new ArrayList<Color>(Arrays.asList(Color.green, Color.black, Color.blue, Color.red));
		List<String> marks=new ArrayList<>(Arrays.asList("he","map","prosv","buda"));
		
		Random random=new Random();
		for (int i = 0; i < products.length-1; i++) {
			products[i]=new Marker(colors.get(random.nextInt(4)), marks.get(random.nextInt(4)), true, 2.5, 115, true);
			products[i+1]=new Pen(colors.get(random.nextInt(4)), marks.get(random.nextInt(4)), false);

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
