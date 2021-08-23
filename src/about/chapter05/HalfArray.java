package about.chapter05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * 누구나 자료 구조와 알고리즘 배열 선택 클래스
 *
 * @author RWB
 * @see <a href="https://rwb0104.github.io/posts/2021/07/23/about-algorithm-chapter05/">빅 오를 사용하거나 사용하지 않는 코드 최적화</a>
 * @since 2021.07.23 Fri 22:32:54
 */
public class HalfArray
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
		
		writer.write("요소의 갯수가 짝수개인 정수 배열을 띄어쓰기로 구분하여 입력 >> ");
		writer.flush();
		
		// 배열
		int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int[] result = solve(array);
		
		writer.write(Arrays.toString(result));
		writer.newLine();
		writer.flush();
		
		writer.close();
		reader.close();
	}
	
	/**
	 * 알고리즘 결과 반환 함수
	 *
	 * @param array: [int[]] 대상 배열
	 *
	 * @return [int[]] 결과 배열
	 */
	private static int[] solve(int[] array)
	{
		int length = (int) Math.ceil(array.length / 2D);
		
		int[] result = new int[length];
		
		int count = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			// 인덱스가 짝수일 경우
			if (i % 2 == 0)
			{
				result[count] = array[i];
				
				count++;
			}
		}
		
		return result;
	}
}