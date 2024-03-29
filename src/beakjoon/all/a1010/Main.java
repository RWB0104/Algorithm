package beakjoon.all.a1010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 전체 1010 문제 알고리즘 클래스
 *
 * @author RWB
 * @see <a href="https://blog.itcode.dev/posts/2021/06/09/a1010">1010 풀이</a>
 * @since 2021.06.09 Tue 14:14:09
 */
public class Main
{
	// 다리 건설 경우의 수
	private static final int[][] dp = new int[31][31];
	
	/**
	 * 메인 함수
	 *
	 * @param args: [String[]] 매개변수
	 *
	 * @throws IOException 데이터 입출력 예외
	 */
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 케이스 수
		int T = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < T; i++)
		{
			String[] temp = reader.readLine().split(" ");
			
			int N = Integer.parseInt(temp[0]);
			int M = Integer.parseInt(temp[1]);
			
			System.out.println(combination(M, N));
		}
		
		reader.close();
	}
	
	/**
	 * 조합 결과 반환 함수
	 *
	 * @param n: [int] 원소 갯수
	 * @param r: [int] 조합 갯수
	 *
	 * @return [int] 조합
	 */
	private static int combination(int n, int r)
	{
		// 이미 계산된 값일 경우
		if (dp[n][r] > 0)
		{
			return dp[n][r];
		}
		
		// 원소의 갯수가 조합의 갯수와 동일하거나 0일 경우
		else if (n == r || r == 0)
		{
			return dp[n][r] = 1;
		}
		
		// 일반적인 경우
		else
		{
			return dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
		}
	}
}