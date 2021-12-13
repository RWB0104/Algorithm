package programmers.level1.a12937;

/**
 * 짝수와 홀수 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 19:28:38
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param num: [int] 정수
	 *
	 * @return [String] 해답
	 */
	public String solution(int num)
	{
		return num % 2 == 0 ? "Even" : "Odd";
	}
}