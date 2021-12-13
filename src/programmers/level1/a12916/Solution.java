package programmers.level1.a12916;

import java.util.Arrays;

/**
 * 문자열 내 p와 y의 개수 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 15:01:11
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param s: [String] 문자열
	 *
	 * @return [String[]] 해답
	 */
	public boolean solution(String s)
	{
		int p = (int) Arrays.stream(s.toLowerCase().split("")).filter(item -> item.equals("p")).count();
		int y = (int) Arrays.stream(s.toLowerCase().split("")).filter(item -> item.equals("y")).count();
		
		return p == y;
	}
}