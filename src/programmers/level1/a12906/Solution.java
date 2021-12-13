package programmers.level1.a12906;

import java.util.ArrayList;

/**
 * 같은 숫자는 싫어 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 13:32:56
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param arr: [int[]] 0 ~ 9 사이의 숫자 배열
	 *
	 * @return [int[]] 해답
	 */
	public int[] solution(int[] arr)
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(arr[0]);
		
		int index = 1;
		
		for (int i = 1; i < arr.length; i++)
		{
			// list의 마지막 숫자와 같지 않을 경우
			if (list.get(index - 1) != arr[i])
			{
				index++;
				list.add(arr[i]);
			}
		}
		
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}