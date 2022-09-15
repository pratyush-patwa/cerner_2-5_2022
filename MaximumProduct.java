//cerner_2tothe5th_2022
import java.util.Arrays;
import java.util.Scanner;

public class MaximumProduct {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a[] = new long[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextLong();
		}
		if (n == 2) {
			System.out.println(a[0]*a[1]);
		}
		else if(n>2) {
		Arrays.sort(a);
		long res = a[n-1]* a[n-2];
		System.out.println(res);
		sc.close();
		}
		else {
			System.out.println(-1);
		}
	}
}
