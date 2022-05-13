package src;

public enum TestEnum {
	DAY(7),
	NIGHT(20);

	private int hour;
	TestEnum(int hour) {
		this.hour = hour;
	}
	public int getHour() {
		return this.hour;
	}
}
