package about.chapter04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * 누구나 자료 구조와 알고리즘 버블 정렬 클래스
 *
 * @author RWB
 * @see <a href="https://rwb0104.github.io/posts/2021/07/16/about-algorithm-chapter04/">빅 오로 코드 속도 올리기</a>
 * @since 2021.07.16 Fri 19:11:19
 */
public class BubbleSort
{
	// 배열
	private static int[] array;
	
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
		
		writer.write("버블 정렬할 정수 배열을 띄어쓰기로 구분하여 입력 >> ");
		writer.flush();
		
		array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int[] count = bubbleSort();
		
		writer.newLine();
		writer.write(Arrays.toString(array));
		writer.newLine();
		writer.newLine();
		writer.flush();
		
		writer.write(" - 비교 작업량: ");
		writer.write(String.valueOf(count[0]));
		writer.newLine();
		writer.flush();
		
		writer.write(" - 스왑 작업량: ");
		writer.write(String.valueOf(count[1]));
		writer.newLine();
		writer.flush();
		
		writer.write(" - 총 작업량: ");
		writer.write(String.valueOf(count[0] + count[1]));
		writer.newLine();
		writer.flush();
		
		writer.close();
		reader.close();
	}
	
	/**
	 * 버블 정렬 및 작업량 반환 함수
	 *
	 * @return [int[]] 비교 작업량과 스왑 작업량
	 */
	private static int[] bubbleSort()
	{
		// 비교 작업량
		int compareCount = 0;
		
		// 스왑 작업량
		int swapCount = 0;
		
		// 스왑 여부
		boolean isSwaped = true;
		
		// 비교 인덱스
		int index = array.length - 1;
		
		// 스왑이 일어나지 않을 때까지
		while (isSwaped)
		{
			isSwaped = false;
			
			for (int i = 0; i < index; i++)
			{
				compareCount++;
				
				// 현재 요소가 다음 요소보다 클 경우
				if (array[i] > array[i + 1])
				{
					// 스왑 발생
					isSwaped = true;
					swapCount++;
					
					int temp = array[i];
					
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
			
			index--;
		}
		
		return new int[] { compareCount, swapCount };
	}
}