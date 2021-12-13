package programmers.level1.a12940;

/**
 * 최대공약수와 최소공배수 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 19:33:08
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param n: [int] 정수 1
	 * @param m: [int] 정수 2
	 *
	 * @return [int[]] 해답
	 */
	public int[] solution(int n, int m)
	{
		int[] answer = new int[2];
		
		answer[0] = gcd(n, m);
		answer[1] = n * m / answer[0];
		
		return answer;
	}
	
	/**
	 * 유클리드 호제법 연산결과 반환 메서드
	 *
	 * @param n: [int] 정수 1
	 * @param m: [int] 정수 2
	 *
	 * @return [int] 최대공약수
	 */
	private int gcd(int n, int m)
	{
		while (m != 0)
		{
			int r = n % m;
			
			n = m;
			m = r;
		}
		
		return n;
	}
}