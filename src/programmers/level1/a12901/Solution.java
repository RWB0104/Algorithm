package programmers.level1.a12901;

import java.sql.Date;

/**
 * 2016년 클래스
 *
 * @author RWB
 * @since 2021.12.12 Sun 03:38:13
 */
class Solution
{
	/**
	 * 해답 반환 메서드
	 *
	 * @param a: [int] 월
	 * @param b: [int] 일
	 *
	 * @return [int] 해답
	 */
	public String solution(int a, int b)
	{
		String dateStr = new StringBuilder().append("2016-").append(a).append("-").append(b).toString();
		
		int dayOfWeek = Date.valueOf(dateStr).toLocalDate().getDayOfWeek().getValue();
		
		return getDayName(dayOfWeek);
	}
	
	/**
	 * 요일 이름 반환 메서드
	 *
	 * @param dayOfWeek: [int] 주별 요일 번호
	 *
	 * @return [String] 요일 이름
	 */
	private String getDayName(int dayOfWeek)
	{
		return switch (dayOfWeek)
				{
					case 1 -> "MON";
					case 2 -> "TUE";
					case 3 -> "WED";
					case 4 -> "THU";
					case 5 -> "FRI";
					case 6 -> "SAT";
					default -> "SUN";
				};
	}
}