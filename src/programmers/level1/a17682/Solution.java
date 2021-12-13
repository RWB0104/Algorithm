package programmers.level1.a17682;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 다트 게임 클래스
 *
 * @author RWB
 * @since 2021.12.12 Sun 17:55:08
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param dartResult: [String] 점수|보너스|옵션 문자열 (옵션은 선택사항)
	 *
	 * @return [int] 해답
	 */
	public int solution(String dartResult)
	{
		int answer = 0;
		int index = 0;
		
		Matcher matcher = Pattern.compile("([0-9]0?)([SDT])([*#]?)").matcher(dartResult);
		
		ArrayList<Integer> scores = new ArrayList<>();
		
		while (matcher.find())
		{
			int type = matcher.group(2).equals("T") ? 3 : matcher.group(2).equals("D") ? 2 : 1;
			int option = matcher.group(3).equals("*") ? 2 : matcher.group(3).equals("#") ? -1 : 1;
			
			int score = (int) Math.pow(Integer.parseInt(matcher.group(1)), type) * option;
			scores.add(index, score);
			
			// 인덱스가 0보다 크고, 스타상을 받았을 경우
			if (index > 0 && option == 2)
			{
				// 이전 점수도 스타상의 영향으로 2배가 된다.
				scores.set(index - 1, scores.get(index - 1) * option);
			}
			
			index++;
		}
		
		for (Integer score : scores)
		{
			answer += score;
		}
		
		return answer;
	}
}