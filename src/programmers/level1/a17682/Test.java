package programmers.level1.a17682;

/**
 * 테스트 클래스
 *
 * @author RWB
 * @since 2021.12.12 Sun 17:55:08
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
		
		System.out.println(solution.solution("1S2D*3T"));
		System.out.println(solution.solution("1D2S#10S"));
		System.out.println(solution.solution("1D2S0T"));
		System.out.println(solution.solution("1S*2T*3S"));
		System.out.println(solution.solution("1D#2S*3S"));
		System.out.println(solution.solution("1T2D3D#"));
		System.out.println(solution.solution("1D2S3T*"));
	}
}