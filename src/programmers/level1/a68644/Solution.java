package programmers.level1.a68644;

import java.util.HashSet;

/**
 * 두 개 뽑아서 더하기 클래스
 *
 * @author RWB
 * @since 2021.12.12 Sun 03:19:39
 */
class Solution
{
	private HashSet<Integer> set;
	
	/**
	 * 해답 반환 메서드
	 *
	 * @param numbers: [int[]] 정수 배열
	 *
	 * @return [int] 해답
	 */
	public int[] solution(int[] numbers)
	{
		set = new HashSet<>();
		
		boolean[] isCheck = new boolean[numbers.length];
		
		combination(numbers, isCheck, 0, 2);
		
		return set.stream().mapToInt(Integer::intValue).sorted().toArray();
	}
	
	/**
	 * 조합 메서드 (백트래킹)
	 *
	 * @param numbers: [int[]] 대상 배열
	 * @param isCheck: [int[]] 백트래킹 체크 여부 배열
	 * @param start: [int] 시작값
	 * @param target: [int] 조합할 갯수
	 */
	private void combination(int[] numbers, boolean[] isCheck, int start, int target)
	{
		// 조합할 갯수가 0개일 경우 (탐색 완료)
		if (target == 0)
		{
			int sum = 0;
			
			for (int i = 0; i < numbers.length; i++)
			{
				// 백트래킹 체크일 경우
				if (isCheck[i])
				{
					sum += numbers[i];
				}
			}
			
			set.add(sum);
		}
		
		// 아닐 경우
		else
		{
			for (int i = start; i < numbers.length; i++)
			{
				isCheck[i] = true;
				
				combination(numbers, isCheck, i + 1, target - 1);
				
				isCheck[i] = false;
			}
		}
	}
}