package beakjoon.all.a1010;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 전체 1009 문제 알고리즘 클래스
 *
 * @author RWB
 * @see <a href="https://rwb0104.github.io/posts/2021/06/09/A1009/">1010 풀이</a>
 * @since 2021.06.09 Tue 14:14:09
 */
public class Main
{
	private static int[][] dp;
	
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
		
		int T = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < T; i++)
		{
			String[] temp = reader.readLine().split(" ");
			
			int N = Integer.parseInt(temp[0]);
			int M = Integer.parseInt(temp[1]);
			
			dp = new int[M + 1][N + 1];
			
			System.out.println(combination(M, N));
		}
		
		reader.close();
	}
	
	private static int combination(int n, int r)
	{
		if (dp[n][r] > 0)
		{
			return dp[n][r];
		}
		
		if (n == r || r == 0)
		{
			return dp[n][r] = 1;
		}
		
		else
		{
			return dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
		}
	}
}