package programmers.level2.a60057;

/**
 * 문자열 압축 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 23:30:16
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param s: [String] 문자열
	 *
	 * @return [int] 해답
	 */
	public int solution(String s)
	{
		for (int i = 1; i < s.length(); i++)
		{
			System.out.println(s.replaceAll(s.substring(0, i), ""));
		}
		
		
		return 1;
	}
}