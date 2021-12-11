package programmers.level1.a1845;

/**
 * 테스트 클래스
 *
 * @author RWB
 * @since 2021.12.11 Sat 02:20:18
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
		
		System.out.println(solution.solution(new int[] { 3, 1, 2, 3 }));
		System.out.println(solution.solution(new int[] { 3, 3, 3, 2, 2, 4 }));
		System.out.println(solution.solution(new int[] { 3, 3, 3, 2, 2, 2 }));
	}
}