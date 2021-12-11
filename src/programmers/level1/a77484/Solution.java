package programmers.level1.a77484;

import java.util.Arrays;

/**
 * 로또의 최고 순위와 최저 순위 클래스
 *
 * @author RWB
 * @since 2021.12.06 Mon 23:35:13
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param lottos: [int[]] 로또 번호
	 * @param win_nums: [int[]] 당첨 번호
	 *
	 * @return [int[]] 해답
	 */
	public int[] solution(int[] lottos, int[] win_nums)
	{
		int[] answer = new int[46];
		
		int zeros = 0;
		
		for (int lotto : lottos)
		{
			// 번호를 알아볼 수 있을 경우
			if (lotto > 0)
			{
				answer[lotto]++;
			}
			
			// 없을 경우
			else
			{
				zeros++;
			}
		}
		
		for (int win_num : win_nums)
		{
			answer[win_num]++;
		}
		
		int matched = Arrays.stream(answer).filter(e -> e == 2).toArray().length;
		
		int high = 7 - (matched + zeros) == 7 ? 6 : 7 - (matched + zeros);
		int low = 7 - matched == 7 ? 6 : 7 - matched;
		
		return new int[]{high, low};
	}
}
