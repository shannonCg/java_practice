package enumTest;

public enum DayAdvanced {
	SUNDAY(4),
	MONDAY(5),
	SATURDAY(11);
	
	private int value;
	
	private DayAdvanced(int value){
		this.value = value;
	}
	
	public int getValue(){
		return this.value;
	}
}
