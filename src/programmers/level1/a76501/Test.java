package programmers.level1.a76501;

/**
 * 테스트 클래스
 *
 * @author RWB
 * @since 2021.12.10 Fri 00:09:32
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
		
		System.out.println(solution.solution(new int[] { 4, 7, 12 }, new boolean[] { true, false, true }));
		System.out.println(solution.solution(new int[] { 1, 2, 3 }, new boolean[] { false, false, true }));
	}
}