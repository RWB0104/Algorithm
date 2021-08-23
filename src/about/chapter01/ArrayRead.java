package about.chapter01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 누구나 자료 구조와 알고리즘 배열 읽기 클래스
 *
 * @author RWB
 * @see <a href="https://rwb0104.github.io/posts/2021/07/09/about-algorithm-chapter01/">자료구조가 중요한 까닭</a>
 * @since 2021.07.09 Fri 22:53:39
 */
public class ArrayRead
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
		
		// 읽을 인덱스
		int index = 4;
		
		int result = read(index);
		
		StringBuilder builder = new StringBuilder();
		builder.append(index);
		builder.append("번 째 아이템: ");
		builder.append(result);
		
		writer.write(builder.toString());
		writer.newLine();
		writer.flush();
		writer.close();
	}
	
	/**
	 * 배열 읽기 결과 반환 함수
	 *
	 * @param index: [int] 인덱스
	 *
	 * @return [int] 인덱스에 해당하는 값
	 */
	private static int read(int index)
	{
		return ARRAY[index];
	}
}