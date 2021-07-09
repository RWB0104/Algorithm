package beakjoon.all.a1021;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * 백준 전체 1021 문제 알고리즘 클래스
 *
 * @author RWB
 * @see <a href="https://rwb0104.github.io/posts/2021/07/06/A1021/">1021 풀이</a>
 * @since 2021.07.06 11:36:34
 */
public class Main
{
	private static int N;
	
	private static int M;
	
	private static LinkedList<Integer> queue = new LinkedList<>();
	
	private static LinkedList<Integer> sorted;
	
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
		
		// N과 M
		int[] meta = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		// 수의 위치
		String[] line = reader.readLine().split(" ");
		
		for (int i = 0; i < N; i++)
		{
		
		}
		
		// 큐의 크기
		N = meta[0];
		
		// 수의 갯수
		M = meta[1];
		
		writer.newLine();
		
		writer.close();
		reader.close();
	}
}