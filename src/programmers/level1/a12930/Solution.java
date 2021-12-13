package programmers.level1.a12930;

/**
 * 이상한 문자 만들기 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 18:03:00
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
		String[] answer = s.split("");
		
		int index = 0;
		
		for (int i = 0; i < answer.length; i++)
		{
			// 공백일 경우
			if (answer[i].equals(" "))
			{
				index = 0;
				answer[i] = " ";
			}
			
			// 문자열일 경우
			else
			{
				// 짝수 인덱스일 경우
				if (index % 2 == 0)
				{
					answer[i] = answer[i].toUpperCase();
				}
				
				// 홀수 인덱스일 경우
				else
				{
					answer[i] = answer[i].toLowerCase();
				}
				
				index++;
			}
		}
		
		return String.join("", answer);
	}
}