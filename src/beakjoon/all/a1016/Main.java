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
		
		long sqrtMin = (long) Math.ceil(Math.sqrt(min));
		long sqrtMax = (long) Math.floor(Math.sqrt(max));
		
		System.out.println(max - min + 1 - (sqrtMax - sqrtMin + 1));
		
		writer.close();
		reader.close();
	}
}