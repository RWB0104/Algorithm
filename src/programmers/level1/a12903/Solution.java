package programmers.level1.a12903;

/**
 * 가운데 글자 가져오기 클래스
 *
 * @author RWB
 * @since 2021.12.12 Sun 17:43:58
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
		int index = s.length() / 2;
		
		return s.length() % 2 == 0 ? s.substring(index - 1, index + 1) : s.substring(index, index + 1);
	}
}