package programmers.level1.a12912;

/**
 * 두 정수 사이의 합 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 14:16:50
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param a: [int] 정수 1
	 * @param b: [int] 정수 2
	 *
	 * @return [long] 해답
	 */
	public long solution(int a, int b)
	{
		long answer = 0;
		
		int start = Math.min(a, b);
		int end = Math.max(a, b);
		
		for (int i = start; i <= end; i++)
		{
			answer += i;
		}
		
		return answer;
	}
}