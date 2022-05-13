package src;

public class Cat {
	private String name;
	private String owner;
	private int age;
	private String color;
	public static class CatBuilder{
		private String name;
		private String owner;
		private int age;
		private String color;
		
		public CatBuilder withName(String name) {
			this.name = name;
			return this;
		}
		public CatBuilder withOwner(String owner) {
			this.owner = owner;
			return this;
		}
		public CatBuilder withAge(int age) {
			this.age = age;
			return this;
		}
		public CatBuilder withColor(String color) {
			this.color = color;
			return this;
		}
		public Cat build() {
			Cat cat = new Cat();
			cat.name = name;
			cat.owner = owner;
			cat.age = age;
			cat.color = color;
			return cat;
		}
	}
	public String getName() {
		return name;
	}
	public String getOwner() {
		return owner;
	}
	public int getAge() {
		return age;
	}
	public String getColor() {
		return color;
	}
}
