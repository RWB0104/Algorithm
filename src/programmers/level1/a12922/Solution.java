package programmers.level1.a12922;

/**
 * 수박수박수박수박수박수? 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 16:05:46
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param n: [int] 자연수
	 *
	 * @return [String] 해답
	 */
	public String solution(int n)
	{
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < n; i++)
		{
			builder.append(i % 2 == 0 ? "수" : "박");
		}
		
		return builder.toString();
	}
}