package programmers.level1.a76501;

/**
 * 음양 더하기 클래스
 *
 * @author RWB
 * @since 2021.12.10 Fri 00:09:32
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param absolutes: [int[]] 정수 절대값 배열
	 * @param signs: [int[]] 정수의 부호
	 *
	 * @return [int] 해답
	 */
	public int solution(int[] absolutes, boolean[] signs)
	{
		int answer = 0;
		
		for (int i = 0; i < absolutes.length; i++)
		{
			answer += (signs[i] ? absolutes[i] : -absolutes[i]);
		}
		
		return answer;
	}
}