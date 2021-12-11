package programmers.level1.a70128;

/**
 * 내적 클래스
 *
 * @author RWB
 * @since 2021.12.10 Fri 00:17:10
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param a: [int[]] 정수 배열
	 * @param b: [int[]] 정수 배열
	 *
	 * @return [int] 해답
	 */
	public int solution(int[] a, int[] b)
	{
		int answer = 0;
		
		for (int i = 0; i < a.length; i++)
		{
			answer += a[i] * b[i];
		}
		
		return answer;
	}
}