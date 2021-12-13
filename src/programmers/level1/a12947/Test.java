package programmers.level1.a12947;

/**
 * 테스트 클래스
 *
 * @author RWB
 * @since 2021.12.13 Mon 21:52:12
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
		
		System.out.println(solution.solution(10));
		System.out.println(solution.solution(12));
		System.out.println(solution.solution(11));
		System.out.println(solution.solution(13));
		System.out.println(solution.solution(100));
	}
}