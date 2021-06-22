package beakjoon.all.a1016;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * 백준 전체 1016 문제 알고리즘 클래스
 *
 * @author RWB
 * @see <a href="https://rwb0104.github.io/posts/2021/06/22/A1016/">1016 풀이</a>
 * @since 2021.06.22 Tue 01:48:22
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
		
		long[] temp = Arrays.stream(reader.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
		
		long min = temp[0];
		long max = temp[1];
		
		int length = (int) (max - min + 1);
		
		boolean[] isNotSqrt = new boolean[length];
		
		//mesh(min, max, isNotSqrt);
		writer.write(Integer.toString(mesh(min, max, isNotSqrt)));
		writer.newLine();
		
		writer.close();
		reader.close();
	}
	
	private static int mesh(long min, long max, boolean[] isNotSqrt)
	{
		int size = 0;
		
		for (long i = 2; i * i <= max; i++)
		{
			long pow = i * i;
			
			long start = min % pow == 0 ? min / pow : (min / pow) + 1;
			
			for (long j = start; j * pow <= max; j++)
			{
				isNotSqrt[(int) (j * pow - min)] = true;
			}
		}
		
		for (boolean item : isNotSqrt)
		{
			if (!item)
			{
				size++;
			}
		}
		
		return size;
	}
}