package programmers.level1.a12926;

import java.util.stream.Collectors;

/**
 * 시저 암호 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 16:12:50
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param s: [String] 문자열
	 * @param n: [int] 이동 거리
	 *
	 * @return [String] 해답
	 */
	public String solution(String s, int n)
	{
		return s.chars().mapToObj(value -> Character.toString(converter(value, n))).collect(Collectors.joining(""));
	}
	
	/**
	 * 변환 결과 반환 메서드
	 *
	 * @param num: [int] 원본 숫자
	 * @param n: [int] 이동 거리
	 *
	 * @return [int] 변환환 숫자
	 */
	private int converter(int num, int n)
	{
		// 대문자일 경우
		if (num >= 65 && num <= 90)
		{
			// 대문자 영역을 넘어버릴 경우
			if (num + n > 90)
			{
				return num + n - 90 + 65 - 1;
			}
			
			return num + n;
		}
		
		// 소문자일 경우
		else if (num >= 97 && num <= 122)
		{
			// 소문자 영역을 넘어버릴 경우
			if (num + n > 122)
			{
				return num + n - 122 + 97 - 1;
			}
			
			return num + n;
		}
		
		// 공백일 경우
		else
		{
			return ' ';
		}
	}
}