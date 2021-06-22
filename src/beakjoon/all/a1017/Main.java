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
	private static int N;
	
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
		
		int[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int[] odd = Arrays.stream(numbers).filter(value -> value % 2 == 0).toArray();
		int[] even = Arrays.stream(numbers).filter(value -> value % 2 != 0).toArray();
		
		boolean[] isNotPrime = eratosthenes();
		
		writer.close();
		reader.close();
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
				for (int j = i * i; j < isNotPrime.length; j += i)
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
	
	private static int bipartite()
	{
		int size = 0;
		
		boolean[] isVisit = new boolean[N];
		
		for (int i = 0; i < N; i++)
		{
		
		}
	}
}