package about.chapter04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 누구나 자료 구조와 알고리즘 향상된 중복 확인 클래스
 *
 * @author RWB
 * @see <a href="https://blog.itcode.dev/posts/2021/07/16/about-algorithm-chapter04">빅 오로 코드 속도 올리기</a>
 * @since 2021.07.16 Fri 21:18:05
 */
public class ImproveDuplicateCheck
{
	private static int count = 0;
	
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
		
		writer.write("중복 확인할 정수 배열을 띄어쓰기로 구분하여 입력 >> ");
		writer.flush();
		
		// 배열
		int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		boolean result = isDuplicated(array);
		
		// 중복된 요소가 있을 경우
		if (result)
		{
			writer.write("중복된 요소가 존재합니다.");
		}
		
		// 없을 경우
		else
		{
			writer.write("중복된 요소가 존재하지 않습니다.");
		}
		
		writer.newLine();
		writer.flush();
		
		writer.write("작업량: ");
		writer.write(String.valueOf(count));
		writer.newLine();
		writer.flush();
		
		writer.close();
		reader.close();
	}
	
	/**
	 * 요소의 중복 여부 반환 함수
	 *
	 * @param array: [int[]] 배열
	 *
	 * @return [boolean] 중복 여부
	 */
	private static boolean isDuplicated(int[] array)
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int item : array)
		{
			count++;
			
			// 중복되지 않았을 경우
			if (!list.contains(item))
			{
				list.add(item);
			}
			
			// 중복된 경우
			else
			{
				return true;
			}
		}
		
		return false;
	}
}