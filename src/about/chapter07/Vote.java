package about.chapter07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
 * 누구나 자료 구조와 알고리즘 전자 투표 기계 클래스
 *
 * @author RWB
 * @see <a href="https://blog.itcode.dev/posts/2021/07/29/about-algorithm-chapter07">해시 테이블로 매우 빠른 룩업</a>
 * @since 2021.07.29 Thu 22:15:32
 */
public class Vote
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
		
		ArrayList<String> list = new ArrayList<>();
		
		while (true)
		{
			writer.write("후보 이름 입력 (x: 종료) >> ");
			writer.flush();
			
			String name = reader.readLine().trim();
			
			// x가 입력되었을 경우
			if (name.equalsIgnoreCase("x"))
			{
				break;
			}
			
			// 빈 문자가 입력되었을 경우
			else if (name.equals("") || name.isEmpty())
			{
				writer.newLine();
				writer.write("올바른 이름을 입력하세요.");
			}
			
			// 일반적인 이름이 입력되었을 경우
			else
			{
				list.add(name);
			}
		}
		
		writer.write(list.toString());
		writer.flush();
		
		writer.close();
		reader.close();
	}
}