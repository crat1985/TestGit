package src;

public class CatTPBuilder {
	private String name;
	private int age;
	private String owner;
	private boolean isSterilised;
	public CatTPBuilder withName(String name) {
		this.name = name;
		return this;
	}
	public CatTPBuilder withAge(int age) {
		this.age = age;
		return this;
	}
	public CatTPBuilder withOwner(String owner) {
		this.owner = owner;
		return this;
	}
	public CatTPBuilder withIsSterilised(boolean isSterilised) {
		this.isSterilised = isSterilised;
		return this;
	}
	public CatTP build() {
		CatTP cat2 = new CatTP();
		cat2.setName(name);
		cat2.setAge(age);
		cat2.setOwner(owner);
		cat2.setSterilised(isSterilised);
		return cat2;
	}
}
