package programmers.level1.a12982;

import java.util.Arrays;

/**
 * 예산 클래스
 *
 * @author RWB
 * @since 2021.12.12 Sun 03:07:33
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param d: [int[]] 부서별 신청 금액
	 * @param budget: [int] 예산
	 *
	 * @return [int] 해답
	 */
	public int solution(int[] d, int budget)
	{
		int answer = 0;
		
		Arrays.sort(d);
		
		for (int j : d)
		{
			budget -= j;
			
			// 예산을 초과할 경우
			if (budget < 0)
			{
				break;
			}
			
			answer++;
		}
		
		return answer;
	}
}