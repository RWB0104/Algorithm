package programmers.level1.a12933;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 정수 내림차순으로 배치하기 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 19:04:28
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param n: [long] 자연수
	 *
	 * @return [long] 해답
	 */
	public long solution(long n)
	{
		long answer = 0;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		while (n >= 10)
		{
			list.add((int) (n % 10));
			
			n /= 10;
		}
		
		list.add((int) n);
		
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++)
		{
			answer += list.get(i) * Math.pow(10, i);
		}
		
		return answer;
	}
}