package src;

public class PineApple extends Fruit implements PeelFruit{
	private boolean peeled = false;
	
	public PineApple() {
		super("ananas");
	}

	@Override
	public void taste() {
		System.out.println("L'ananas a un goût un peu acide");
		super.miam();
	}

	@Override
	public int getSize() {
		return 2;
	}

	@Override
	public boolean hasSeed() {
		return true;
	}

	@Override
	public boolean isPeeled() {
		return peeled;
	}

	@Override
	public String getSkinType() {
		return "piquante";
	}

}
