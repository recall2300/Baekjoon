package _03_8_1924_FindDay;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	        int month, day;
	        int totalDay=0;
	        String[] dayString = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
	        Scanner scan = new Scanner(System.in);
	        month = scan.nextInt();
	        day = scan.nextInt();
	        
	        for(int i=1; i<month; i++){
	            switch(i) {
	                case 1:
	                case 3:
	                case 5:
	                case 7:
	                case 8:
	                case 10:
	                case 12:
	                    totalDay += 31;
	                    break;
	                case 4:
	                case 6:
	                case 9:
	                case 11:
	                    totalDay += 30;
	                    break;
	                case 2:
	                    totalDay += 28;
	                    break;
	            }
	        }
	        totalDay += day;
	        System.out.print(dayString[totalDay%7]);
    }
}