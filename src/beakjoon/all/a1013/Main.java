package beakjoon.all.a1013;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

/**
 * 백준 전체 1013 문제 알고리즘 클래스
 *
 * @author RWB
 * @see <a href="https://blog.itcode.dev/posts/2021/06/13/a1013">1013 풀이</a>
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
		
		// 케이스 수
		int T = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < T; i++)
		{
			String text = reader.readLine();
			
			// 정규식 일치 여부
			String result = Pattern.matches("(100+1+|01)+", text) ? "YES" : "NO";
			
			System.out.println(result);
		}
		
		reader.close();
	}
}