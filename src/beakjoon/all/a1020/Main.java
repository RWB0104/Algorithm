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
	private static final int[] FLAG = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 5 };
	
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
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] numbers = Arrays.stream(reader.readLine().split("")).mapToInt(Integer::parseInt).toArray();
		
		int N = numbers.length;
		
		dp = new int[N + 1][(N * 7) + 1];
		
		long num = 1;
		long pos = 1;
		
		long result = (long) Math.pow(10, N);
		
		int count = Arrays.stream(numbers).reduce(0, (acc, i) -> acc += FLAG[i]);
		
		
		writer.close();
		reader.close();
	}
}