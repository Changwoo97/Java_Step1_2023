package chapter03.FOR;

public class ForTest03 {
	public static void main(String[] args) {
		// 1부터 100까지의 합을 구하되 합이 100이하여야 함
		// 방법1
		System.out.println("1부터 100까지의 합을 구하되 합이 100미만인 수중 가장 큰 수");
		
		int i;
		int sum = 0;
		for (i = 1; i <= 100; i++) {
			sum += i;
			if(sum >= 100) break;
			System.out.println("숫자 " + i + "까지의 합: " + sum + "입니다.");
		}
		
		// 방법2
		System.out.println("1부터 100까지의 합을 구하되 합이 100미만인 수중 가장 큰수");
		
		sum = 0;
		for (i = 1; i <= 100; i++) {
			sum += i;
			if(sum >= 100) break;
		}	
		System.out.println("해당 숫자: " + (i - 1) + "입니다.");
		System.out.println("숫자 " + (i - 1) + "까지의 합: " + (sum - i) + "입니다.");
		
		// 방법3
		
		int k;
		int sum2 = 0;
		for(k = 1; sum2 + k < 100; k++) {
			sum2 += k;
		}
		System.out.println("해당 숫자: " + (k - 1) + "입니다.");
		System.out.println("숫자 " + (k - 1) + "까지의 합: " + (sum - k) + "입니다.");
	}
}
