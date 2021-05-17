
public class Main {

	public static void main(String[] args) {
		//year to be checked 
		int year = 1996;
		boolean leap = false;
		
		//year is divided by 4
		if (year%4==0) {
			
		//if year is century
		 if(year%100==0) {
			 
		  //if year is divided by 400
		  // then its leap year 
			if(year %400==0)
				leap = true ;
			else 
			    leap =false;
			
		 }
		 //if the year is not century 
		 else 
			 leap = true;
		}
		 else 
			 leap =false ;
		 if(leap)
			 System.out.println(year +"is leap year");
		 else 
			System.out.println(year +" is not leap year");
	
}

}
