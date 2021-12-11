package programmers.level1.a86051;

/**
 * 테스트 클래스
 *
 * @author RWB
 * @since 2021.12.10 Fri 00:04:47
 */
public class Test
{
	/**
	 * 메인 메서드
	 *
	 * @param args: [String[]] 파라미터
	 */
	public static void main(String[] args)
	{
		Solution solution = new Solution();
		
		System.out.println(solution.solution(new int[] { 1, 2, 3, 4, 6, 7, 8, 0 }));
		System.out.println(solution.solution(new int[] { 5, 8, 4, 0, 6, 7, 9 }));
	}
}