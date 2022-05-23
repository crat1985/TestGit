package src;

public class User {
	private String lastName;
	private String firstName;
	private String phone;
	private String address;
	
	public static class UserBuilder{
		private String lastName = "<non défini>";
		private String firstName = "<non défini>";
		private String phone = "<non défini>";
		private String address = "<non définie>";
		
		public UserBuilder withLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		public UserBuilder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		public UserBuilder withPhone(String phone) {
			this.phone = phone;
			return this;
		}
		public UserBuilder withAddress(String address) {
			this.address = address;
			return this;
		}
		public User build() {
			User user = new User();
			user.firstName = firstName;
			user.lastName = lastName;
			user.address = address;
			user.phone = phone;
			return user;
		}
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getAddress() {
		return address;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getPhone() {
		return phone;
	}
}
