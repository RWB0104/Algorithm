package programmers.level1.a81301;

/**
 * 테스트 클래스
 *
 * @author RWB
 * @since 2021.12.09 Thu 18:47:19
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
		
		System.out.println(solution.solution("one4seveneight"));
		System.out.println(solution.solution("23four5six7"));
		System.out.println(solution.solution("2three45sixseven"));
		System.out.println(solution.solution("123"));
	}
}