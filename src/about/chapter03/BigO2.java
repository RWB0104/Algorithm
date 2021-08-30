package about.chapter03;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 누구나 자료 구조와 알고리즘 빅 오 표기 클래스
 *
 * @author RWB
 * @see <a href="https://blog.itcode.dev/posts/2021/07/14/about-algorithm-chapter03">빅 오 표기법</a>
 * @since 2021.07.14 Wed 17:56:49
 */
public class BigO2
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
		
		writer.write("Hello world!");
		writer.newLine();
		writer.flush();
		writer.close();
	}
}