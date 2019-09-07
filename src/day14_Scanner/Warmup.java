package day14_Scanner;

public class Warmup {
	
	public static void main(String[] args) {
		
		int score = 80 ;
        char Finals = ' ';
        
        Finals   =( score >= 90 && score <=100) ? 'A'
                : (score >= 80 && score <= 89) ?  'B'
                : (score >= 70 && score <= 79) ? 'C'
                : (score >= 60 && score <= 69) ? 'D'
                : (score >= 0 && score <= 59) ?  'F' 
                :' ';
        System.out.println(Finals);​
             
       
		
		
		
	}

}
