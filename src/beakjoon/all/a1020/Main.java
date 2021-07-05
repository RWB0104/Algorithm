package beakjoon.all.a1020;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * 백준 전체 1020 문제 알고리즘 클래스
 *
 * @author RWB
 * @since 2021.06.29  09:16:
 */
public class Main
{
	// 숫자 선분 갯수
	private static final int[] FLAG = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 5 };
	
	// 메모이제이션 배열
	private static long[][] dp;
	
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
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//String input = reader.readLine();
		String input = "7788";
		
		long number = Long.parseLong(input);
		
		// 표시된 숫자
		int[] numbers = Arrays.stream(input.split("")).mapToInt(Integer::parseInt).toArray();
		
		// 숫자 자릿수
		int N = numbers.length;
		
		dp = new long[N + 1][(N * 7) + 1];
		
		// 숫자의 선분 갯수
		int count = Arrays.stream(numbers).reduce(0, (left, right) -> left += FLAG[right]);
		int acc = 0;
		
		for (long[] arr : dp)
		{
			// 전체 배열에 long의 최대값으로 초기화
			Arrays.fill(arr, Long.MAX_VALUE);
		}
		
		// 초기값 설정
		dp[0][0] = 0;
		dp[1][2] = 1;
		dp[1][3] = 7;
		dp[1][4] = 4;
		dp[1][5] = 2;
		dp[1][6] = 0;
		dp[1][7] = 8;
		
		/*
		for (int i = 0; i < 10; i++)
		{
			dp[1][FLAG[i]] = Math.min(dp[1][FLAG[i]], i);
		}
		*/
		
		for (int i = 2; i < dp.length; i++)
		{
			for (int num = 0; num < 10; num++)
			{
				for (int j = 0; j < dp[i].length; j++)
				{
					if (dp[i - 1][j] != Long.MAX_VALUE)
					{
						dp[i][j + FLAG[num]] = Math.min(dp[i][j + FLAG[num]], dp[i - 1][j] + (long) Math.pow(10, i - 1) * num);
					}
				}
			}
		}
		
		acc += FLAG[numbers[N - 1]];
		
		for (int num = 0; num < 10; num++)
		{
			if (FLAG[numbers[N - 1]] == FLAG[num] && numbers[N - 1] != num)
			{
			
			}
		}
		
		for (int i = 2; i <= N; i++)
		{
			for (int num = 0; num < 10; num++)
			{
				System.out.println();
			}
		}
		
		writer.close();
		reader.close();
	}
}