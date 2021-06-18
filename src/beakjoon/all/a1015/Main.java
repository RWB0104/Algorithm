package beakjoon.all.a1015;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * 백준 전체 1015 문제 알고리즘 클래스
 *
 * @author RWB
 * @see <a href="https://rwb0104.github.io/posts/2021/06/19/A1014/">1015 풀이</a>
 * @since 2021.06.13 Sun 04:34:19
 */
public class Main
{
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
		
		// 배열의 크기
		int N = Integer.parseInt(reader.readLine());
		
		int[] A = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] B = A.clone();
		
		Arrays.sort(B);
		
		int[] C = new int[N];
		
		for (int i = 0; i < N; i++)
		{
			C[i] = A[i]
		}
		
		writer.close();
		reader.close();
	}
}