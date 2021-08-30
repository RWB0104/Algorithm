package about.chapter06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 누구나 자료 구조와 알고리즘 교집합 클래스
 *
 * @author RWB
 * @see <a href="https://blog.itcode.dev/posts/2021/07/24/about-algorithm-chapter06">긍정적인 시나리오 최적화</a>
 * @since 2021.07.24 Sat 04:21:40
 */
public class Intersection
{
	private static int compareCount = 0;
	private static int insertCount = 0;
	
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
		
		writer.write("첫 번째 정수 배열을 띄어쓰기로 구분하여 입력 >> ");
		writer.flush();
		
		int[] array1 = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		writer.write("두 번째 정수 배열을 띄어쓰기로 구분하여 입력 >> ");
		writer.flush();
		
		int[] array2 = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int[] result = intersection(array1, array2);
		
		writer.write(Arrays.toString(result));
		writer.newLine();
		writer.flush();
		
		writer.write(" - 비교 작업량: ");
		writer.write(String.valueOf(compareCount));
		writer.newLine();
		writer.flush();
		
		writer.write(" - 삽입 작업량: ");
		writer.write(String.valueOf(insertCount));
		writer.newLine();
		writer.flush();
		
		writer.write(" - 총 작업량: ");
		writer.write(String.valueOf(compareCount + insertCount));
		writer.newLine();
		writer.flush();
		
		writer.close();
		reader.close();
	}
	
	/**
	 * 교집합 배열 반환 함수
	 *
	 * @param array1: [int[]] 첫 번째 배열
	 * @param array2: [int[]] 두 번째 배열
	 *
	 * @return [int[]] 교집합 배열
	 */
	private static int[] intersection(int[] array1, int[] array2)
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int item1 : array1)
		{
			for (int item2 : array2)
			{
				compareCount++;
				
				// 두 배열의 요소가 같을 경우
				if (item1 == item2)
				{
					insertCount++;
					
					list.add(item1);
				}
			}
		}
		
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}