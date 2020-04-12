
public class Marker extends Product {

	private double thicknessOfFilter;
	private double weigth;
	private boolean isPermanent;

	public Marker(Color color, String mark, boolean isWriting, double thicknessOfFilter, double weigthInGrams,
			boolean isPermanent) {
		super(color, mark, isWriting);
		this.thicknessOfFilter = thicknessOfFilter;
		setWeigth(weigthInGrams);
		this.isPermanent = isPermanent;
	}

	private void setWeigth(double weight) {
		if (weight <= 500) {
			this.weigth = weight;
		}
	}

	public double getThicknessOfFilter() {
		return thicknessOfFilter;
	}

	public void setThicknessOfFilter(double thicknessOfFilter) {
		this.thicknessOfFilter = thicknessOfFilter;
	}

	public boolean isPermanent() {
		return isPermanent;
	}

	public void setPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}

	public double getWeigth() {
		return weigth;
	}
	

}
