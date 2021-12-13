package programmers.level1.a87389;

/**
 * 나머지가 1이 되는 수 찾기 클래스
 *
 * @author RWB
 * @since 2021.12.12 Sun 16:35:58
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
		int x = 1;
		
		while (n % x != 1)
		{
			x++;
		}
		
		return x;
	}
}