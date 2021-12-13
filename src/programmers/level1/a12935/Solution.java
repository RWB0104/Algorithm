package programmers.level1.a12935;

import java.util.ArrayList;

/**
 * 제일 작은 수 제거하기 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 19:20:27
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param arr: [int[]] 정수 배열
	 *
	 * @return [int[]] 해답
	 */
	public int[] solution(int[] arr)
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		int min = Integer.MAX_VALUE;
		
		for (int item : arr)
		{
			min = Math.min(min, item);
			
			list.add(item);
		}
		
		list.remove((Integer) min);
		
		// 리스트가 비었을 경우
		if (list.isEmpty())
		{
			list.add(-1);
		}
		
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}