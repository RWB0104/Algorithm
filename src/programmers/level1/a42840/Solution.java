package programmers.level1.a42840;

import java.util.*;

/**
 * 모의고사 클래스
 *
 * @author RWB
 * @since 2021.12.10 Fri 21:43:26
 */
class Solution
{
	private static final Queue<Integer> ONE = new LinkedList<>();
	private static final Queue<Integer> TWO = new LinkedList<>();
	private static final Queue<Integer> THREE = new LinkedList<>();
	
	/**
	 * 해답 반환 메서드
	 *
	 * @param answers: [int[]] 최고 득점자
	 *
	 * @return [int[]] k번째의 수
	 */
	public int[] solution(int[] answers)
	{
		initQueue();
		
		int[] counts = { 0, 0, 0 };
		
		for (int item : answers)
		{
			int one = Objects.requireNonNull(ONE.poll());
			int two = Objects.requireNonNull(TWO.poll());
			int three = Objects.requireNonNull(THREE.poll());
			
			counts[0] += item == one ? 1 : 0;
			counts[1] += item == two ? 1 : 0;
			counts[2] += item == three ? 1 : 0;
			
			ONE.add(one);
			TWO.add(two);
			THREE.add(three);
		}
		
		int max = Arrays.stream(counts).max().getAsInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < counts.length; i++)
		{
			// 최고 점수를 얻었을 경우
			if (counts[i] == max)
			{
				list.add(i + 1);
			}
		}
		
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
	
	/**
	 * 큐 초기화 메서드
	 */
	private void initQueue()
	{
		ONE.clear();
		TWO.clear();
		THREE.clear();
		
		ONE.add(1);
		ONE.add(2);
		ONE.add(3);
		ONE.add(4);
		ONE.add(5);
		
		TWO.add(2);
		TWO.add(1);
		TWO.add(2);
		TWO.add(3);
		TWO.add(2);
		TWO.add(4);
		TWO.add(2);
		TWO.add(5);
		
		THREE.add(3);
		THREE.add(3);
		THREE.add(1);
		THREE.add(1);
		THREE.add(2);
		THREE.add(2);
		THREE.add(4);
		THREE.add(4);
		THREE.add(5);
		THREE.add(5);
	}
}