package programmers.level1.a12931;

/**
 * 자릿수 더하기 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 18:27:11
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
		
		String[] numbers = String.valueOf(n).split("");
		
		for (String number : numbers)
		{
			answer += Integer.parseInt(number);
		}
		
		return answer;
	}
}