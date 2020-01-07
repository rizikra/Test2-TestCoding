public class DeretBilangan{
	public static void main (String[] args){
		int num = 0;
		
		for(int i=1; i<=100; i++){
			num++;
			if (num%2==0 && num%3==0){
				System.out.print("INDONESIA ");
			}
			else if (num%2!=0){
				System.out.print("ganjil ");
			}
			else if (num%2==0){
				System.out.print(num+ " ");
			}
		}
	}
}