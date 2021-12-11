package programmers.level1.a72410;

/**
 * 신규 아이디 추천 클래스
 *
 * @author RWB
 * @since 2021.12.07 Tue 00:47:16
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param new_id: [String] 새로운 아이디
	 *
	 * @return [String] 해답
	 */
	public String solution(String new_id)
	{
		String answer = step1(new_id);
		answer = step2(answer);
		answer = step3(answer);
		answer = step4(answer);
		answer = step5(answer);
		answer = step6(answer);
		answer = step7(answer);
		
		return answer;
	}
	
	/**
	 * 1단계 결과 반환 메서드
	 * 대문자를 모두 소문자로 치환
	 *
	 * @param new_id: [String] 새로운 아이디
	 *
	 * @return [String] 1단계 결과
	 */
	private String step1(String new_id)
	{
		return new_id.toLowerCase();
	}
	
	/**
	 * 2단계 결과 반환 메서드
	 * 영문 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 문자 제거
	 *
	 * @param new_id: [String] 새로운 아이디
	 *
	 * @return [String] 2단계 결과
	 */
	private String step2(String new_id)
	{
		return new_id.replaceAll("[^a-z0-9-_.]", "");
	}
	
	/**
	 * 3단계 결과 반환 메서드
	 * 두번 이상 연속된 마침표 하나로 치환
	 *
	 * @param new_id: [String] 새로운 아이디
	 *
	 * @return [String] 3단계 결과
	 */
	private String step3(String new_id)
	{
		return new_id.replaceAll("\\.{2,}", ".");
	}
	
	/**
	 * 4단계 결과 반환 메서드
	 * 맨 앞이나 뒤에 마침표가 있을 경우 제거
	 *
	 * @param new_id: [String] 새로운 아이디
	 *
	 * @return [String] 4단계 결과
	 */
	private String step4(String new_id)
	{
		return new_id.replaceAll("^[.]|[.]$", "");
	}
	
	/**
	 * 5단계 결과 반환 메서드
	 * 빈 문자열일 경우 a 대입
	 *
	 * @param new_id: [String] 새로운 아이디
	 *
	 * @return [String] 5단계 결과
	 */
	private String step5(String new_id)
	{
		return new_id.equals("") ? "a" : new_id;
	}
	
	/**
	 * 6단계 결과 반환 메서드
	 * 16자 이상일 경우, 15자로 제한. 끝에 마침표가 오게 될 경우 제거
	 *
	 * @param new_id: [String] 새로운 아이디
	 *
	 * @return [String] 6단계 결과
	 */
	private String step6(String new_id)
	{
		return new_id.length() > 15 ? step4(new_id.substring(0, 15)) : new_id;
	}
	
	/**
	 * 7단계 결과 반환 메서드
	 * 2자 이하일 경우, 길이가 3이 될 때까지 마지막 글자 이어붙이기
	 *
	 * @param new_id: [String] 새로운 아이디
	 *
	 * @return [String] 7단계 결과
	 */
	private String step7(String new_id)
	{
		int more = 3 - new_id.length();
		
		// 필요한 글자가 하나 이상 있을 경우
		if (more > 0)
		{
			char last = new_id.charAt(new_id.length() - 1);
			
			StringBuilder builder = new StringBuilder();
			builder.append(new_id);
			builder.append(String.valueOf(last).repeat(more));
			
			return builder.toString();
		}
		
		// 아닐 경우
		else
		{
			return new_id;
		}
	}
}