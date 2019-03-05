package enumTest;

public class UseEnum {
	Day day;
	
	public UseEnum(Day day){
		this.day = day;
	}
	
	public void tellItLikeItIs(){
		switch(day){
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;
		case SUNDAY:
			System.out.println("Sundays are better.");
			break;
		case SATURDAY:
			System.out.println("Weekends are best.");
			break;
		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
	}
}
