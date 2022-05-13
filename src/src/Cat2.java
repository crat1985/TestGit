package src;

public class Cat2 {
	private String name;
	private int age;
	private String owner;
	private boolean isSterilised;
	public static class Cat2Builder{
		private String name;
		private int age;
		private String owner;
		private boolean isSterilised;
		public Cat2Builder withName(String name) {
			this.name = name;
			return this;
		}
		public Cat2Builder withAge(int age) {
			this.age = age;
			return this;
		}
		public Cat2Builder withOwner(String owner) {
			this.owner = owner;
			return this;
		}
		public Cat2Builder withIsSterilised(boolean isSterilised) {
			this.isSterilised = isSterilised;
			return this;
		}
		public Cat2 build() {
			Cat2 cat2 = new Cat2();
			cat2.name = name;
			cat2.age = age;
			cat2.owner = owner;
			cat2.isSterilised = isSterilised;
			return cat2;
		}
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getOwner() {
		return owner;
	}
	public boolean getIsSterilised() {
		return isSterilised;
	}
}
