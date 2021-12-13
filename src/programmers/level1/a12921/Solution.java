package programmers.level1.a12921;

/**
 * 소수 찾기 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 15:51:37
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param n: [int] 자연수
	 *
	 * @return [int] 해답
	 */
	public int solution(int n)
	{
		int answer = 0;
		
		for (int i = 2; i <= n; i++)
		{
			answer += isPrime(i) ? 1 : 0;
		}
		
		return answer;
	}
	
	/**
	 * 소수 여부 반환 메서드
	 *
	 * @param n: [int] 숫자
	 *
	 * @return [boolean] 소수 여부
	 */
	private boolean isPrime(int n)
	{
		for (int i = 2; i * i <= n; i++)
		{
			// 나눠 떨어질 경우
			if (n % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}
}