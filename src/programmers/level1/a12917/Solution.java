package programmers.level1.a12917;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 문자열 내림차순으로 배치하기 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 15:11:19
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param s: [String] 문자열
	 *
	 * @return [String] 해답
	 */
	public String solution(String s)
	{
		List<String> list = s.chars().sorted().mapToObj(Character::toString).collect(Collectors.toList());
		
		StringBuilder builder = new StringBuilder();
		
		for (int i = list.size() - 1; i > -1; i--)
		{
			builder.append(list.get(i));
		}
		
		return builder.toString();
	}
}