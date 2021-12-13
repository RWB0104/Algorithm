package programmers.level1.a12932;

import java.util.ArrayList;

/**
 * 자연수 뒤집어 배열로 만들기 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 18:31:27
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param n: [long] 자연수
	 *
	 * @return [int[]] 해답
	 */
	public int[] solution(long n)
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		while (n >= 10)
		{
			list.add((int) (n % 10));
			
			n /= 10;
		}
		
		list.add((int) n);
		
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}