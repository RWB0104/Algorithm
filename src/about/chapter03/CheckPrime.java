package about.chapter03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 누구나 자료 구조와 알고리즘 소수 판별 클래스
 *
 * @author RWB
 * @see <a href="https://blog.itcode.dev/posts/2021/07/14/about-algorithm-chapter03">빅 오 표기법</a>
 * @since 2021.07.14 Wed 18:01:20
 */
public class CheckPrime
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
		
		writer.write("소수를 판별할 값 입력 >> ");
		writer.flush();
		
		// 입력값
		int target = Integer.parseInt(reader.readLine());
		
		// 소수일 경우
		if (isPrime(target))
		{
			writer.write("소수로 판별됨");
		}
		
		// 아닐 경우
		else
		{
			writer.write("소수가 아닌 것으로 판별됨");
		}
		
		writer.newLine();
		writer.flush();
		
		writer.close();
		reader.close();
	}
	
	/**
	 * 소수 여부 반환 함수
	 *
	 * @param num: [int] 대상 값
	 *
	 * @return [boolean] 소수 여부
	 */
	private static boolean isPrime(int num)
	{
		for (int i = 2; i < num; i++)
		{
			// 나누어 떨어지는 수가 있을 경우
			if (num % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}
}