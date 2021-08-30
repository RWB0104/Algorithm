package about.chapter08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

/**
 * 누구나 자료 구조와 알고리즘 큐 프린터 클래스
 *
 * @author RWB
 * @see <a href="https://blog.itcode.dev/posts/2021/07/31/about-algorithm-chapter08">스택과 큐로 간결한 코드 생성</a>
 * @since 2021.07.31 Sat 03:21:35
 */
public class Printer
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
		
		Queue<String> queue = new LinkedList<>();
		
		while (true)
		{
			writer.write("출력할 문자열 입력 (x: 종료) >> ");
			writer.flush();
			
			String work = reader.readLine();
			
			// 입력을 종료할 경우
			if (work.equalsIgnoreCase("x"))
			{
				break;
			}
			
			// 작업할 입력이 들어올 경우
			else
			{
				queue.offer(work);
			}
		}
		
		while (!queue.isEmpty())
		{
			writer.write("[INFO] ");
			writer.write(Objects.requireNonNull(queue.poll()));
			writer.newLine();
			writer.flush();
		}
		
		writer.close();
		reader.close();
	}
}