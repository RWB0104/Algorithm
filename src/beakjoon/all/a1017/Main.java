package beakjoon.all.a1017;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * 백준 전체 1017 문제 알고리즘 클래스
 *
 * @author RWB
 * @see <a href="https://rwb0104.github.io/posts/2021/06/22/A1017/">1017 풀이</a>
 * @since 2021.06.22 Tue 01:48:22
 */
public class Main
{
	private static final boolean[] IS_NOT_PRIME = eratosthenes();
	
	// 입력값 갯수
	private static int N;
	
	// 왼쪽 배열 (이분매칭의 기준)
	private static int[] left;
	
	// 오른쪽 배열
	private static int[] right;
	
	private static boolean[][] hasNode;
	
	// 방문 여부
	private static boolean[] isVisit;
	private static boolean[] isMatch;
	
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
		
		N = Integer.parseInt(reader.readLine());
		
		// 입력값 배열
		int[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		// 첫 번째 수가 홀수일 경우
		if (numbers[0] % 2 != 0)
		{
			// 왼쪽 배열에 홀수를 할당
			left = Arrays.stream(numbers).filter(value -> value % 2 != 0).toArray();
			right = Arrays.stream(numbers).filter(value -> value % 2 == 0).toArray();
		}
		
		// 첫 번째 수가 짝수일 경우
		else
		{
			// 왼쪽 배열에 짝수를 할당
			left = Arrays.stream(numbers).filter(value -> value % 2 == 0).toArray();
			right = Arrays.stream(numbers).filter(value -> value % 2 != 0).toArray();
		}
		
		hasNode = new boolean[left.length][right.length];
		
		// left[i] + right[j]가 소수일 경우 간선을 잇는다.
		for (int i = 0; i < left.length; i++)
		{
			for (int j = 0; j < right.length; j++)
			{
				int ref = left[i] + right[j];
				
				// 소수일 경우
				if (!IS_NOT_PRIME[ref])
				{
					// left[i]와 right[j] 사이에 간선 연결
					hasNode[i][j] = true;
				}
			}
		}
		
		writer.close();
		reader.close();
	}
	
	private static int bipartite()
	{
		int size = 0;
		
		isVisit = new boolean[left.length];
		isMatch = new boolean[left.length];
		
		for (int i = 0; i < left.length; i++)
		{
		
		}
		
		return 0;
	}
	
	/**
	 * DFS 알고리즘 결과 반환 함수
	 *
	 * @param num: [int] 시작점
	 *
	 * @return [int] 매칭 갯수
	 */
	private static int dfs(int num)
	{
		for (int i = 0; i < left.length; i++)
		{
		
		}
		
		return 0;
	}
	
	/**
	 * 아레토스 테네스의 체 배열 반환 함수
	 *
	 * @return [boolean[]] 아레토스 테네스의 체
	 */
	private static boolean[] eratosthenes()
	{
		boolean[] isNotPrime = new boolean[2000];
		
		isNotPrime[0] = true;
		isNotPrime[1] = true;
		
		int maxPrime = (int) Math.ceil(Math.sqrt(2000));
		
		for (int i = 2; i < maxPrime; i++)
		{
			// 소수일 경우
			if (!isNotPrime[i])
			{
				for (int j = i + i; j < isNotPrime.length; j += i)
				{
					// 아직 소수가 아님을 표시하지 않았을 경우
					if (!isNotPrime[j])
					{
						// 소수의 배수는 소수가 아니므로 제외함
						isNotPrime[j] = true;
					}
				}
			}
		}
		
		return isNotPrime;
	}
}