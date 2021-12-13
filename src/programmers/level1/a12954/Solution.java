package programmers.level1.a12954;

import java.util.ArrayList;

/**
 * x만큼 간격이 있는 n개의 숫자 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 22:21:01
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param x: [int] 간격
	 * @param n: [int] 갯수
	 *
	 * @return [long[]] 해답
	 */
	public long[] solution(int x, int n)
	{
		ArrayList<Long> list = new ArrayList<>();
		
		while (n != 0)
		{
			list.add((long) x * n);
			
			n--;
		}
		
		return list.stream().sorted((o1, o2) -> (int) (Math.abs(o1) - Math.abs(o2))).mapToLong(Long::longValue).toArray();
	}
}