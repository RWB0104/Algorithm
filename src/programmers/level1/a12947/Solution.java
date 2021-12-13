package programmers.level1.a12947;

/**
 * 하샤드 수 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 21:52:12
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param x: [int] 정수 배열
	 *
	 * @return [boolean] 해답
	 */
	public boolean solution(int x)
	{
		int temp = x;
		int sum = 0;
		
		while (temp >= 10)
		{
			sum += temp % 10;
			
			temp /= 10;
		}
		
		sum += temp;
		
		return x % sum == 0;
	}
}