package about.chapter06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * 누구나 자료 구조와 알고리즘 삽입 정렬 클래스
 *
 * @author RWB
 * @see <a href="https://blog.itcode.dev/posts/2021/07/24/about-algorithm-chapter06">긍정적인 시나리오 최적화</a>
 * @since 2021.07.24 Sat 02:40:19
 */
public class InsertionSort
{
	private static int compareCount = 0;
	private static int shiftCount = 0;
	private static int deleteCount = 0;
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
		
		writer.write("중복 확인할 정수 배열을 띄어쓰기로 구분하여 입력 >> ");
		writer.flush();
		
		// 배열
		int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		selectionSort(array);
		
		writer.write(Arrays.toString(array));
		writer.newLine();
		writer.flush();
		
		writer.write(" - 비교 작업량: ");
		writer.write(String.valueOf(compareCount));
		writer.newLine();
		writer.flush();
		
		writer.write(" - 시프트 작업량: ");
		writer.write(String.valueOf(shiftCount));
		writer.newLine();
		writer.flush();
		
		writer.write(" - 삭제 작업량: ");
		writer.write(String.valueOf(deleteCount));
		writer.newLine();
		writer.flush();
		
		writer.write(" - 삽입 작업량: ");
		writer.write(String.valueOf(insertCount));
		writer.newLine();
		writer.flush();
		
		writer.write(" - 총 작업량: ");
		writer.write(String.valueOf(compareCount + shiftCount + deleteCount + insertCount));
		writer.newLine();
		writer.flush();
		
		writer.close();
		reader.close();
	}
	
	/**
	 * 삽입 정렬 알고리즘
	 *
	 * @param array: [int[]] 대상 배열
	 */
	private static void selectionSort(int[] array)
	{
		for (int i = 1; i < array.length; i++)
		{
			// 임시 변수
			int temp = array[i];
			
			// 빈 공간
			int blank = i;
			
			// 삭제 작업 추가
			deleteCount++;
			
			// 공백 표시
			array[i] = Integer.MIN_VALUE;
			
			for (int j = i - 1; j > -1; j--)
			{
				// 비교 작업 추가
				compareCount++;
				
				// 현재 요소가 임시 변수보다 클 경우
				if (array[j] > temp)
				{
					// 시프트 작업 추가
					shiftCount++;
					
					array[blank] = array[j];
					
					blank--;
					
					array[blank] = Integer.MIN_VALUE;
				}
				
				// 아닐 경우
				else
				{
					break;
				}
			}
			
			// 삽입 작업 추가
			insertCount++;
			
			array[blank] = temp;
		}
	}
}