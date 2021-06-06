package beakjoon.all.a1003;

import java.util.Scanner;

/**
 * 백준 전체 1003 문제 알고리즘 클래스
 *
 * @author RWB
 * @see <a href="https://rwb0104.github.io/posts/2021/05/21/A1003/">1003 풀이</a>
 * @since 2021.04.21 Wed 23:29:03
 */
public class Main
{
	static Integer[] arr = new Integer[41];
	
	/**
	 * 메인 함수
	 *
	 * @param args: [String[]] 매개변수
	 */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		// 피보나치 수열 초기값 (N = 0)
		arr[0] = 0;
		
		// 피보나치 수열 초기값 (N = 1)
		arr[1] = 1;
		
		int length = scanner.nextInt();
		
		for (int i = 0; i < length; i++)
		{
			int n = scanner.nextInt();
			
			fibonacci(n);
			
			// n이 0일 경우
			if (n == 0)
			{
				System.out.println("1 0");
			}
			
			// n이 1일 경우
			else if (n == 1)
			{
				System.out.println("0 1");
			}
			
			// 초기값이 아닐 경우
			else
			{
				System.out.println(new StringBuffer().append(arr[n - 1]).append(" ").append(arr[n]).toString());
			}
		}
		
		scanner.close();
	}
	
	/**
	 * 피보나치 값 반환 함수
	 *
	 * @param n: [int] 인덱스
	 *
	 * @return [int] 피보나치 값
	 */
	private static int fibonacci(int n)
	{
		// 해당 인덱스의 피보나치가 아직 연산되지 않았을 경우
		if (arr[n] == null)
		{
			arr[n] = fibonacci(n - 1) + fibonacci(n - 2);
		}
		
		return arr[n];
	}
}