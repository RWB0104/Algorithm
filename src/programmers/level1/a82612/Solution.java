package programmers.level1.a82612;

/**
 * 부족한 금액 계산하기 클래스
 *
 * @author RWB
 * @since 2021.12.12 Sun 16:43:20
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param price: [int] 이용료
	 * @param money: [int] 소지금
	 * @param count: [int] 놀이기구를 이용한 횟수
	 *
	 * @return [long] 해답
	 */
	public long solution(int price, int money, int count)
	{
		long total = 0;
		
		while (count > 0)
		{
			total += (long) price * count;
			
			count--;
		}
		
		return Math.max(total - money, 0);
	}
}