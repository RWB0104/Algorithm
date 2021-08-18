package about.chapter05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * 누구나 자료 구조와 알고리즘 선택 정렬 클래스
 *
 * @author RWB
 * @see <a href="https://rwb0104.github.io/posts/2021/07/23/about-algorithm-chapter05/">빅 오를 사용하거나 사용하지 않는 코드 최적화</a>
 * @since 2021.07.23 Fri 01:12:20
 */
public class SelectionSort
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
		
		writer.write("중복 확인할 정수 배열을 띄어쓰기로 구분하여 입력 >> ");
		writer.flush();
		
		// 배열
		int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int[] processes = selectionSort(array);
		
		writer.write(Arrays.toString(array));
		writer.newLine();
		writer.flush();
		
		writer.write(" - 비교 작업량: ");
		writer.write(String.valueOf(processes[0]));
		writer.newLine();
		writer.flush();
		
		writer.write(" - 스왑 작업량: ");
		writer.write(String.valueOf(processes[1]));
		writer.newLine();
		writer.flush();
		
		writer.write(" - 총 작업량: ");
		writer.write(String.valueOf(processes[0] + processes[1]));
		writer.newLine();
		writer.flush();
		
		writer.close();
		reader.close();
	}
	
	/**
	 * 선택 정렬 함수
	 *
	 * @param array : [int[]] 대상 배열
	 *
	 * @return [int[]] 작업 갯수 배열
	 */
	private static int[] selectionSort(int[] array)
	{
		int compareCount = 0;
		int swapCount = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			// 패스스루의 최소값 인덱스
			int min = i;
			
			for (int j = i + 1; j < array.length; j++)
			{
				compareCount++;
				
				// 현재 요소의 값이 패스스루의 최소값보다 작을 경우
				if (array[j] < array[min])
				{
					min = j;
				}
			}
			
			// 최소 인덱스에 변화가 있었을 경우
			if (min != i)
			{
				int temp = array[min];
				
				array[min] = array[i];
				array[i] = temp;
				
				swapCount++;
			}
		}
		
		return new int[] { compareCount, swapCount };
	}
}