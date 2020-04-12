
public class Product {
	public Color color;
	private String mark;
	private boolean isWriting;

	public Product(Color color, String mark, boolean isWriting) {
		super();
		this.color = color;
		this.mark = mark;
		this.isWriting = isWriting;
	}

	public Color getColor() {
		return color;
	}

	public String getMark() {
		return mark;
	}

	public boolean isWriting() {
		return isWriting;
	}

	@Override
	public String toString() {
		return "Product [color=" + color + ", mark=" + mark + "]";
	}
	
	

}
