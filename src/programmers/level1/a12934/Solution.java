package programmers.level1.a12934;

/**
 * 정수 제곱근 판별 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 19:15:59
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param n: [long] 정수
	 *
	 * @return [long] 해답
	 */
	public long solution(long n)
	{
		double sqrt = Math.sqrt(n);
		
		long num = (long) sqrt;
		
		return sqrt == num ? (long) Math.pow(sqrt + 1, 2) : -1;
	}
}