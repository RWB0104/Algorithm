package programmers.level1.a12943;

/**
 * 콜라츠 추측 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 21:34:17
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param num: [long] 정수
	 *
	 * @return [int] 해답
	 */
	public int solution(long num)
	{
		int count = 0;
		
		while (num != 1)
		{
			// 500번 수행했을 경우
			if (count == 500)
			{
				count = -1;
				
				break;
			}
			
			num = num % 2 == 0 ? num / 2 : num * 3 + 1;
			
			count++;
		}
		
		return count;
	}
}