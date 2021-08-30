package about.chapter03;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 누구나 자료 구조와 알고리즘 빅 오 표기 클래스
 *
 * @author RWB
 * @see <a href="https://blog.itcode.dev/posts/2021/07/14/about-algorithm-chapter03">빅 오 표기법</a>
 * @since 2021.07.14 Wed 17:40:00
 */
public class BigO
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
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 배열
		String[] things = { "apples", "baboons", "cribs", "delcimers" };
		
		// 배열마다 하나씩 순회
		for (String thing : things)
		{
			StringBuilder builder = new StringBuilder();
			builder.append("Here's a thing: ");
			builder.append(thing);
			
			writer.write(builder.toString());
			writer.newLine();
		}
		
		writer.newLine();
		writer.flush();
		writer.close();
	}
}