package programmers.level1.a12928;

/**
 * 약수의 합 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 17:52:04
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param n: [int] 정수
	 *
	 * @return [int] 해답
	 */
	public int solution(int n)
	{
		int answer = 0;
		
		for (int i = 1; i <= Math.sqrt(n); i++)
		{
			// 나누어 떨어질 경우
			if (n % i == 0)
			{
				// n의 제곱근일 경우
				if (i * i == n)
				{
					answer += i;
				}
				
				// n의 제곱근이 아닐 경우
				else
				{
					answer += i;
					answer += n / i;
				}
			}
		}
		
		return answer;
	}
}