package about.chapter02;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * 누구나 자료 구조와 알고리즘 정렬된 배열 삽입 클래스
 *
 * @author RWB
 * @see <a href="https://blog.itcode.dev/posts/2021/07/10/about-algorithm-chapter02">알고리즘이 중요한 까닭</a>
 * @since 2021.07.10 Sat 02:41:14
 */
public class SortedArrayInsert
{
	// 배열
	private static final int[] ARRAY = { 6, 9, 14, 43, 94, -1, -1, -1, -1, -1 };
	
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
		
		// 삽입할 요소
		int item = 55;
		
		int result = run(item);
		
		StringBuilder builder = new StringBuilder();
		builder.append(result);
		builder.append("번 째 인덱스에 ");
		builder.append(item);
		builder.append(" 삽입: ");
		builder.append(Arrays.toString(ARRAY));
		
		writer.write(builder.toString());
		writer.newLine();
		writer.flush();
		writer.close();
	}
	
	/**
	 * 집합 배열 삽입 및 삽입된 인덱스 반환 함수
	 *
	 * @param item: [int] 삽입할 요소
	 *
	 * @return [int] 삽입된 인덱스
	 */
	private static int run(int item)
	{
		int result = find(item);
		
		insert(result, item);
		
		return result;
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
			// 목표 숫자보다 배열의 값이 클 경우
			if (target < ARRAY[i])
			{
				result = i;
				break;
			}
		}
		
		return result;
	}
	
	/**
	 * 배열 삽입 함수
	 *
	 * @param index: [int] 삽입 위치
	 * @param item: [int] 삽입할 요소
	 */
	@SuppressWarnings("ManualArrayCopy")
	private static void insert(int index, int item)
	{
		// 배열의 값이 -1(빈 요소)가 아닐 경우
		if (ARRAY[index] != -1)
		{
			for (int i = ARRAY.length - 1; i > index; i--)
			{
				ARRAY[i] = ARRAY[i - 1];
			}
		}
		
		ARRAY[index] = item;
	}
}