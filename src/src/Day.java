package src;

public enum Day {
	
	MATIN(8, "il est l'heure de se lever XD"),
	MIDI(12, "à table"),
	APRESMIDI(15, "bon après-midi !"),
	SOIR(22, "à table"),
	NUIT(2, "bonne nuit");
	
	private int hour;
	private String msg;
	
	Day(int hour, String msg){
		this.hour = hour;
		this.msg = msg;
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public String getMsg() {
		return this.msg;
	}
}