package beakjoon.all.a1015;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.SortedMap;
import java.util.TreeMap;

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
		
		SortedMap<Integer, Integer> sortedMap = new TreeMap<>();
		
		String[] temp = reader.readLine().split(" ");
		
		int[][] A = new int[N][3];
		
		for (int i = 0; i < N; i++)
		{
			A[i][0] = Integer.parseInt(temp[i]);
			A[i][1] = i;
		}
		
		Arrays.stream(A).sorted(e -> e[1]) l
		
		//int[] A = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		//int[] B = A.clone();
		
		int[] C = new int[N];
		
		for (int i = 0; i < N; i++)
		{
		
		}
		
		writer.close();
		reader.close();
	}
}