package kata;

public class ASum {

	public static void main(String[] args) {
		System.out.println(ASum.findNb(4183059834009L));
		System.out.println(ASum.findNb(24723578342962L));
		System.out.println(ASum.findNb(135440716410000L));
		System.out.println(ASum.findNb(40539911473216L));
	}
	
	public static long findNb(long m) {
	    int n = -1;
	    long calculateM = 0;
	    int i = 1;
	    
	    while(calculateM < m){
	      calculateM += (long)i*i*i;
	      if(calculateM == m){
	        n = i;
	      }
	      
	      i++;
	    }
	    
	    return n;
	}	

}
