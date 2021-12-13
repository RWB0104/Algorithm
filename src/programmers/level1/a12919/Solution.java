package programmers.level1.a12919;

import java.util.Arrays;

/**
 * 서울에서 김서방 찾기 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 15:44:33
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param seoul: [String[]] 문자열
	 *
	 * @return [String] 해답
	 */
	public String solution(String[] seoul)
	{
		return new StringBuilder("김서방은 ").append(Arrays.asList(seoul).indexOf("Kim")).append("에 있다").toString();
	}
}