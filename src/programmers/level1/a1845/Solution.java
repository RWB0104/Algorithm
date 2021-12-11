package programmers.level1.a1845;

import java.util.HashSet;

/**
 * 폰켓몬 클래스
 *
 * @author RWB
 * @since 2021.12.11 Sat 01:56:08
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param nums: [int[]] 폰켓몬 종류 배열
	 *
	 * @return [int] 폰켓몬 종류 갯수
	 */
	public int solution(int[] nums)
	{
		HashSet<Integer> set = new HashSet<>();
		
		for (int num : nums)
		{
			set.add(num);
		}
		
		return Math.min(set.size(), nums.length / 2);
	}
}