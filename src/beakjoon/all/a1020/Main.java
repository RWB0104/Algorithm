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
		
		int target = Arrays.stream(numbers).reduce(0, (left, right) -> left += FLAG[right]);
		
		// 숫자 자릿수
		int N = numbers.length;
		
		dp = new long[N + 1][(N * 7) + 1];
		
		for (long[] arr : dp)
		{
			// 전체 배열에 long의 최대값으로 초기화
			Arrays.fill(arr, Long.MAX_VALUE);
		}
		
		// 초기값 설정
		dp[0][0] = 0;
		
		// 초기값 설정
		for (int i = 0; i < 10; i++)
		{
			dp[1][FLAG[i]] = Math.min(dp[1][FLAG[i]], i);
		}
		
		for (int i = 2; i < dp.length; i++)
		{
			for (int num = 0; num < 10; num++)
			{
				for (int j = 0; j < dp[i].length; j++)
				{
					// 초기값이 아닌 유효한 값을 가질 경우
					if (dp[i - 1][j] != Long.MAX_VALUE)
					{
						dp[i][j + FLAG[num]] = Math.min(dp[i][j + FLAG[num]], dp[i - 1][j] + (long) Math.pow(10, i - 1) * num);
					}
				}
			}
		}
		
		// 결과
		long result = (long) Math.pow(10, N);
		
		// 1의 자리 숫자만 비교
		for (int num = 0; num < 10; num++)
		{
			// 1의 자리 숫자와 num의 선분 갯수가 동일하며, 1의 자리 숫자와 num이 같지 않을 경우
			if (FLAG[numbers[N - 1]] == FLAG[num] && numbers[N - 1] != num)
			{
				// num이 1의 자리 숫자보다 클 경우
				if (num > numbers[N - 1])
				{
					result = Math.min(result, num - numbers[N - 1]);
				}
				
				// num이 1의 자리 숫자보다 작을 경우
				else
				{
					result = Math.min(result, num - numbers[N - 1] + (long) Math.pow(10, N));
				}
			}
		}
		
		int count = FLAG[numbers[N - 1]];
		
		// 10의 자리 숫자부터 하나씩 비교
		for (int i = 2; i < N + 1; i++)
		{
			count += FLAG[numbers[N - i]];
			for (int num = 0; num < 10; num++)
			{
				if (target - count + FLAG[num] == count - FLAG[num])
				{
					
					
					result = Math.min(result, dp[i - 1][count - FLAG[num]]);
				}
			}
		}
		
		writer.write(String.valueOf(result));
		
		writer.close();
		reader.close();
	}
}