package about.chapter01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 누구나 자료 구조와 알고리즘 배열 검색 클래스
 *
 * @author RWB
 * @see <a href="https://rwb0104.github.io/posts/2021/07/09/about-algorithm-chapter01/">자료구조가 중요한 까닭</a>
 * @since 2021.07.09 Fri 23:47:03
 */
public class ArrayFind
{
	// 배열
	private static final int[] ARRAY = { 6, 43, 14, 9, 94 };
	
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
		
		// 목표 숫자
		int target = 14;
		
		int result = find(target);
		
		StringBuilder builder = new StringBuilder();
		builder.append(target);
		builder.append("이 포함된 인덱스: ");
		builder.append(result);
		
		writer.write(builder.toString());
		writer.newLine();
		writer.flush();
		writer.close();
	}
	
	/**
	 * 요소 검색 및 인덱스 반환 함수
	 *
	 * @param target: [int] 목표 숫자
	 *
	 * @return [int] 인덱스
	 */
	private static int find(int target)
	{
		// 인덱스
		int result = -1;
		
		for (int i = 0; i < ARRAY.length; i++)
		{
			// 목표 숫자와 배열의 값이 일치할 경우
			if (target == ARRAY[i])
			{
				result = i;
				break;
			}
		}
		
		return result;
	}
}