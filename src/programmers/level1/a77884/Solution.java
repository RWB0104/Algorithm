package programmers.level1.a77884;

import java.util.ArrayList;

/**
 * 약수의 개수와 덧셈 클래스
 *
 * @author RWB
 * @since 2021.12.12 Sun 00:33:56
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param left: [int] 정수 1
	 * @param right: [int] 정수 2
	 *
	 * @return [int[]] 해답
	 */
	public int solution(int left, int right)
	{
		int answer = 0;
		
		for (int i = left; i <= right; i++)
		{
			int count = measure(i).length;
			
			answer += count % 2 == 0 ? i : -i;
		}
		
		return answer;
	}
	
	/**
	 * 약수 반환 메서드
	 *
	 * @param num: [int] 숫자
	 *
	 * @return [int[]] 약수
	 */
	private int[] measure(int num)
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 1; i <= Math.sqrt(num); i++)
		{
			// 임의의 수와 나누어 떨어질 경우
			if (num % i == 0)
			{
				list.add(i);
				
				// num의 제곱근값이 아닐 경우
				if (i * i != num)
				{
					list.add(num / i);
				}
			}
		}
		
		return list.stream().sorted().mapToInt(Integer::intValue).toArray();
	}
}
