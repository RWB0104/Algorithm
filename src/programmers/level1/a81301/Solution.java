package programmers.level1.a81301;

/**
 * 숫자 문자열과 영단어 클래스
 *
 * @author RWB
 * @since 2021.12.06 Thu 18:47:19
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param s: [String] 문자열
	 *
	 * @return [int] 해답
	 */
	public int solution(String s)
	{
		String answer = s;
		
		for (Number number : Number.values())
		{
			answer = answer.replaceAll(number.name().toLowerCase(), number.getNum());
		}
		
		return Integer.parseInt(answer);
	}
	
	/**
	 * 숫자 enum
	 */
	private enum Number
	{
		ZERO("0"),
		ONE("1"),
		TWO("2"),
		THREE("3"),
		FOUR("4"),
		FIVE("5"),
		SIX("6"),
		SEVEN("7"),
		EIGHT("8"),
		NINE("9");
		
		private final String num;
		
		/**
		 * 생성자 메서드
		 *
		 * @param num: [String] 숫자
		 */
		Number(String num)
		{
			this.num = num;
		}
		
		/**
		 * 숫자 반환 메서드
		 *
		 * @return [String] 숫자
		 */
		public String getNum()
		{
			return num;
		}
	}
}