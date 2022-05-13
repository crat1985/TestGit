package src;

public class Kiwi extends Fruit implements PeelFruit{
	private boolean peeled = true;

	public Kiwi(String name) {
		super("kiwi");
	}

	@Override
	public void taste() {
		System.out.println("Le goût est plutôt sucré");
	}

	@Override
	public int getSize() {
		return 1;
	}

	@Override
	public boolean hasSeed() {
		return false;
	}

	@Override
	public boolean isPeeled() {
		return peeled;
	}

	@Override
	public String getSkinType() {
		return "doux";
	}

}
