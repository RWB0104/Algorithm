package programmers.level1.a12918;

import java.util.regex.Pattern;

/**
 * 문자열 다루기 기본 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 15:38:26
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param s: [String] 문자열
	 *
	 * @return [boolean] 해답
	 */
	public boolean solution(String s)
	{
		return Pattern.matches("^([0-9]{4}|[0-9]{6})$", s);
	}
}