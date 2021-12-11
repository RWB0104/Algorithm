package programmers.level1.a70128;

/**
 * 테스트 클래스
 *
 * @author RWB
 * @since 2021.12.10 Fri 00:17:10
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
		
		System.out.println(solution.solution(new int[] { 1, 2, 3, 4 }, new int[] { -3, -1, 0, 2 }));
		System.out.println(solution.solution(new int[] { -1, 0, 1 }, new int[] { 1, 0, -1 }));
	}
}