import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        int input;
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		int[] x;
		x = new int[input+1];
		
		for(int i=1;i<=input;i++){
			x[i]=i;
			if(x[i]%15==0){
				System.out.print(x[i]+" ");
			}
			if(x[i]%3!=0 && x[i]%5!=0){
				System.out.print(x[i]+" ");
			}
		}
		
		
    }
}