package beakjoon.all.a1022;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * 백준 전체 1022 문제 알고리즘 클래스
 *
 * @author RWB
 * @see <a href="https://blog.itcode.dev/posts/2021/08/26/a1021">1022 풀이</a>
 * @since 2021.08.26 00:48:27
 */
public class Main
{
	private static final int[] DX = { 0, -1, 0, 1 };
	private static final int[] DY = { -1, 0, 1, 0 };
	
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
		
		int[] temp = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int r1 = temp[0];
		int c1 = temp[1];
		int r2 = temp[2];
		int c2 = temp[3];
		
		makeSwirl(r1, c1, r2, c2);
		
		writer.close();
		reader.close();
	}
	
	private static int[][] makeSwirl(int r1, int c1, int r2, int c2)
	{
		int[][] swirl = new int[r2 - r1 + 1][c2 - c1 + 1];
		
		int max = Math.max(Math.max(Math.abs(r1), Math.abs(c1)), Math.max(Math.abs(r2), Math.abs(c2)));
		
		int num = 1;
		int count = 0;
		int direct = 0;
		
		int r = max;
		int c = max;
		
		int[][] temp = new int[max * 2][max * 2];
		
		return swirl;
	}
}