package about.chapter07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

/**
 * 누구나 자료 구조와 알고리즘 해시 테이블을 적용한 향상된 전자 투표 기계 클래스
 *
 * @author RWB
 * @see <a href="https://rwb0104.github.io/posts/2021/07/29/about-algorithm-chapter07/">해시 테이블로 매우 빠른 룩업</a>
 * @since 2021.07.29 Thu 22:31:45
 */
public class ImproveHashVote
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
		
		HashMap<String, Integer> map = new HashMap<>();
		
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
				// 이미 등록된 이름일 경우
				if (map.containsKey(name))
				{
					map.put(name, map.get(name) + 1);
				}
				
				// 등록되지 않은 이름일 경우
				else
				{
					map.put(name, 1);
				}
			}
		}
		
		writer.write(map.toString());
		writer.flush();
		
		writer.close();
		reader.close();
	}
}