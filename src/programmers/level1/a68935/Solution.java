package programmers.level1.a68935;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 3진법 뒤집기 클래스
 *
 * @author RWB
 * @since 2021.12.12 Sun 00:47:33
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param n: [int] 자연수
	 *
	 * @return [int] 해답
	 */
	public int solution(int n)
	{
		ArrayList<Integer> list = dec2ter(n);
		
		Collections.reverse(list);
		
		return ter2dec(list);
	}
	
	/**
	 * 10진법 -> 3진법 배열 반환 메서드
	 *
	 * @param num: [int] 자연수
	 *
	 * @return [ArrayList] 3진법 배열
	 */
	private ArrayList<Integer> dec2ter(int num)
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		int max = 0;
		
		while (Math.pow(3, max) <= num)
		{
			max++;
		}
		
		for (int i = max - 1; i > -1; i--)
		{
			int pow = (int) Math.pow(3, i);
			
			list.add(num / pow);
			
			num %= pow;
		}
		
		return list;
	}
	
	/**
	 * 3진법 -> 10진법 반환 메서드
	 *
	 * @param nums: [ArrayList] 3진법 배열
	 *
	 * @return [int] 10진법 숫자
	 */
	private int ter2dec(ArrayList<Integer> nums)
	{
		int flag = nums.size() - 1;
		
		int answer = 0;
		
		for (int num : nums)
		{
			answer += (int) Math.pow(3, flag) * num;
			
			flag--;
		}
		
		return answer;
	}
}