package beakjoon.all.a1008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 전체 1008 문제 알고리즘 클래스
 *
 * @author RWB
 * @see <a href="https://blog.itcode.dev/posts/2021/06/09/a1008">1008 풀이</a>
 * @since 2021.06.09 Tue 10:23:59
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
		
		String[] line = reader.readLine().split(" ");
		
		double a = Double.parseDouble(line[0]);
		double b = Double.parseDouble(line[1]);
		
		System.out.println(a / b);
		
		reader.close();
	}
}