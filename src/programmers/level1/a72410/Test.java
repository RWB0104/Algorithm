package programmers.level1.a72410;

/**
 * 테스트 클래스
 *
 * @author RWB
 * @since 2021.12.09 Thu 16:04:57
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
		
		System.out.println(solution.solution("...!@BaT#*..y.abcdefghijklm"));
		System.out.println(solution.solution("z-+.^."));
		System.out.println(solution.solution("=.="));
		System.out.println(solution.solution("123_.def"));
		System.out.println(solution.solution(""));
		System.out.println(solution.solution(".c"));
		System.out.println(solution.solution("ab"));
	}
}