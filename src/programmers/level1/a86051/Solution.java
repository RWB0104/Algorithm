package programmers.level1.a86051;

/**
 * 없는 숫자 더하기 클래스
 *
 * @author RWB
 * @since 2021.12.10 Fri 00:04:47
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param numbers: [int[]] 숫자 배열
	 *
	 * @return [int] 해답
	 */
	public int solution(int[] numbers)
	{
		int answer = 45;
		
		for (int number : numbers)
		{
			answer -= number;
		}
		
		return answer;
	}
}