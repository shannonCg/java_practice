package other;

public class SwitchStatement {

	public static void main(String[] args) {
		int i = 5;
		switch(i){
		case 1:{
			System.out.println("this is 1");
			System.out.println("--------");
			break;
		}
		case 2:
			System.out.println("this is 2");
			System.out.println("--------");
			break;
		case 3:
			System.out.println("this is 3");
			System.out.println("--------");
		case 4:
			System.out.println("this is 4");
			System.out.println("--------");
			break;
		default:
			System.out.println("this is "+i);
			System.out.println("--------");			
		}
			

	}

}
