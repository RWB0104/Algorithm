package about.chapter09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 누구나 자료 구조와 알고리즘 팩토리얼 클래스
 *
 * @author RWB
 * @see <a href="https://blog.itcode.dev/posts/2021/08/04/about-algorithm-chapter09">재귀를 사용한 재귀적 반복</a>
 * @since 2021.08.02 Mon 22:57:53
 */
public class Factorial
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
		
		int index = Integer.parseInt(reader.readLine());
		
		writer.write(String.valueOf(factorial(index)));
		
		writer.close();
		reader.close();
	}
	
	/**
	 * 팩토리열 연산 결과 반환 함수
	 *
	 * @param index: [int] 인덱스
	 *
	 * @return [int] 팩토리얼 연산 결과
	 */
	private static int factorial(int index)
	{
		// 인덱스가 1일 경우
		if (index == 1)
		{
			return 1;
		}
		
		// 인덱스가 1이 아닐 경우
		else
		{
			return index * factorial(index - 1);
		}
	}
}