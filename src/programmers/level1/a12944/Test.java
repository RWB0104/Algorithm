package programmers.level1.a12944;

/**
 * 테스트 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 21:49:40
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
		
		System.out.println(solution.solution(new int[] { 1, 2, 3, 4 }));
		System.out.println(solution.solution(new int[] { 5, 5 }));
	}
}