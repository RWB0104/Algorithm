package about.chapter01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * 누구나 자료 구조와 알고리즘 배열 삭제 클래스
 *
 * @author RWB
 * @see <a href="https://rwb0104.github.io/posts/2021/07/09/about-algorithm-chapter01/">자료구조가 중요한 까닭</a>
 * @since 2021.07.10 Sat 00:59:02
 */
public class ArrayDelete
{
	// 배열
	private static final int[] ARRAY = { 6, 43, 14, 9, 94, -1, -1, -1, -1, -1 };
	
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
		
		// 삭제할 인덱스
		int index = 2;
		
		remove(index);
		
		StringBuilder builder = new StringBuilder();
		builder.append(index);
		builder.append("번째 요소 삭제 ");
		builder.append(Arrays.toString(ARRAY));
		
		writer.write(builder.toString());
		writer.newLine();
		writer.flush();
		writer.close();
	}
	
	/**
	 * 배열 삭제 함수
	 *
	 * @param index: [int] 삭제 위치
	 */
	@SuppressWarnings("ManualArrayCopy")
	private static void remove(int index)
	{
		// 배열의 값이 -1(빈 요소)가 아닐 경우
		if (ARRAY[index] != -1)
		{
			for (int i = index; i < ARRAY.length - 1; i++)
			{
				ARRAY[i] = ARRAY[i + 1];
			}
			
			ARRAY[ARRAY.length - 1] = -1;
		}
	}
}