package beakjoon.all.a1011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 전체 1011 문제 알고리즘 클래스
 *
 * @author RWB
 * @see <a href="https://rwb0104.github.io/posts/2021/06/11/A1011/">1011 풀이</a>
 * @since 2021.06.11 Fri 09:06:34
 */
public class Main
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
		
		// 케이스 수
		int T = Integer.parseInt(reader.readLine());
		
		for (int i = 0; i < T; i++)
		{
			String[] temp = reader.readLine().split(" ");
			
			// 현재 위치
			double x = Double.parseDouble(temp[0]);
			
			// 목표 위치
			double y = Double.parseDouble(temp[1]);
			
			// x, y 사이의 거리
			double distance = y - x;
			
			System.out.println(solve(distance));
		}
		
		reader.close();
	}
	
	/**
	 * 가동횟수 반환 함수
	 *
	 * @param distance: [double] 거리
	 *
	 * @return [int] 가동횟수
	 */
	private static int solve(double distance)
	{
		int result;
		
		double ref = Math.sqrt(distance);
		
		// 제곱수일 경우
		if (ref % 1 == 0)
		{
			result = (int) (2 * ref - 1);
		}
		
		// 아닐 경우
		else
		{
			double next = Math.ceil(ref);
			
			// 이전 제곱수와 다음 제곱수의 중간보다 큰 수일 경우
			if (distance > Math.pow(next, 2) - next)
			{
				result = (int) (2 * next - 1);
			}
			
			// 아닐 경우
			else
			{
				result = (int) (2 * next - 2);
			}
		}
		
		return result;
	}
}