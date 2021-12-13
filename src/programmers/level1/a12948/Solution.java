package programmers.level1.a12948;

/**
 * 핸드폰 번호 가리기 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 22:06:10
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param phone_number: [String] 핸드폰 번호
	 *
	 * @return [String] 해답
	 */
	public String solution(String phone_number)
	{
		char[] chars = phone_number.toCharArray();
		
		for (int i = 0; i < phone_number.length() - 4; i++)
		{
			chars[i] = '*';
		}
		
		return new String(chars);
	}
}