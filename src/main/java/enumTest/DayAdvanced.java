package enumTest;

public enum DayAdvanced {
	SUNDAY(4),
	MONDAY(5),
	SATURDAY(11){
		public String getComment(){
			this.nothing();
			return "5";
		}
	};
	
	private int value;
	
	private DayAdvanced(int value){
		this.value = value;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public String getComment(){
		return "100";
	}
	
	public void nothing(){
		System.out.println("nothing~");
	}
}
