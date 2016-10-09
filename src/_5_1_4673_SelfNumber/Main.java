package _5_1_4673_SelfNumber;

public class Main {

	public static void printSelfNumber(){
		int[] checkNumber = new int[10001];
		int result = 0;
		for(int i=1; i<=10000;i++){
			if(i<10){
				result = i+i;
				checkNumber[result]++;
			}
			else if(i<100){
				result = i+i%10+i/10;
				checkNumber[result]++;
			}
			else if(i<1000){
				result = i+i%10+i/10%10+i/100;
				checkNumber[result]++;
			}
			else {
				result = i+i%10+i/10%10+i/100%10+i/1000;
				if(result<10000){
					checkNumber[result]++;
				}
			}
		}
		for (int i=1; i<10000;i++){
			if(checkNumber[i]==0){
				System.out.println(i);
			}
		}
		
	}

	public static void main(String[] args) {
		printSelfNumber();
	}
}