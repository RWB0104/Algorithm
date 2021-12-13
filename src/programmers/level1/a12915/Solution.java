package programmers.level1.a12915;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 문자열 내 마음대로 정렬하기 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 14:22:36
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param strings: [String[]] 문자열 배열
	 * @param n: [int] 정렬 대상 인덱스
	 *
	 * @return [String[]] 해답
	 */
	public String[] solution(String[] strings, int n)
	{
		return Arrays.stream(strings).sorted().sorted(Comparator.comparingInt(o -> o.charAt(n))).toArray(String[]::new);
	}
}