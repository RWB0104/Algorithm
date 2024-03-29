package programmers.level1.a12977;

/**
 * 소수 만들기 클래스
 *
 * @author RWB
 * @since 2021.12.10 Fri 00:21:09
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param nums: [int[]] 숫자 배열
	 *
	 * @return [int] 소수가 되는 경우의 수
	 */
	public int solution(int[] nums)
	{
		int answer = 0;
		
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = i + 1; j < nums.length; j++)
			{
				for (int k = j + 1; k < nums.length; k++)
				{
					int sum = nums[i] + nums[j] + nums[k];
					
					answer += isPrime(sum) ? 1 : 0;
				}
			}
		}
		
		return answer;
	}
	
	/**
	 * 소수 여부 반환 메서드
	 *
	 * @param num: [int] 숫자
	 *
	 * @return [boolean] 소수 여부
	 */
	private boolean isPrime(int num)
	{
		for (int i = 2; i <= Math.sqrt(num); i++)
		{
			// 나눠 떨어질 경우
			if (num % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}
}