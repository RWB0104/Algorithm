package programmers.level1.a12910;

import java.util.ArrayList;

/**
 * 나누어 떨어지는 숫자 배열 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 14:08:59
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param arr: [int[]] 자연수 배열
	 * @param divisor: [int] 나눌 수
	 *
	 * @return [int[]] 해답
	 */
	public int[] solution(int[] arr, int divisor)
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int item : arr)
		{
			// 나누어 떨어질 경우
			if (item % divisor == 0)
			{
				list.add(item);
			}
		}
		
		// 나누어 떨어진 수가 하나도 없을 경우
		if (list.isEmpty())
		{
			list.add(-1);
		}
		
		return list.stream().sorted().mapToInt(Integer::intValue).toArray();
	}
}