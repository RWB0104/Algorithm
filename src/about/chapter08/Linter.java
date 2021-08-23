package about.chapter08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

/**
 * 누구나 자료 구조와 알고리즘 괄호 린트 클래스
 *
 * @author RWB
 * @see <a href="https://rwb0104.github.io/posts/2021/07/31/about-algorithm-chapter08/">스택과 큐로 간결한 코드 생성</a>
 * @since 2021.07.30 Fri 23:30:56
 */
public class Linter
{
	/**
	 * 메인 함수
	 *
	 * @param args: [String[]] 매개변수
	 *
	 * @throws IOException 데이터 입출력 예외
	 */
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		writer.write("후보 이름 입력 (x: 종료) >> ");
		writer.flush();
		
		String code = reader.readLine();
		
		char c = lint(code);
		
		// 린트 결과가 정상일 경우
		if (c == '0')
		{
			writer.write("오류 없음");
		}
		
		// 여는 괄호가 없을 경우
		else if (c == 'x')
		{
			writer.write("여는 괄호 존재하지 않음");
		}
		
		// 닫는 괄호가 없을 경우
		else
		{
			writer.write(c);
			writer.write(" 닫는 괄호 존재하지 않음");
		}
		
		writer.newLine();
		writer.flush();
		
		writer.close();
		reader.close();
	}
	
	/**
	 * 린트 결과 반환 함수
	 *
	 * @param text: [String] 구문
	 *
	 * @return [char] 린트 결과
	 */
	private static char lint(String text)
	{
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < text.length(); i++)
		{
			char c = text.charAt(i);
			
			// 여는 괄호일 경우
			if (isOpenBrace(c))
			{
				stack.push(c);
			}
			
			// 닫는 괄호일 경우
			else if (isCloseBrace(c))
			{
				// 스택이 비어있을 경우
				if (stack.isEmpty())
				{
					return 'x';
				}
				
				// 스택이 비어있지 않을 경우
				else
				{
					char co = stack.pop();
					
					// 괄호가 서로 매칭되지 않을 경우
					if (!isMatched(co, c))
					{
						return co;
					}
				}
			}
		}
		
		// 스택이 비어이쓸 경우
		if (stack.isEmpty())
		{
			return '0';
		}
		
		// 스택이 비어있지 않을 경우
		else
		{
			return stack.pop();
		}
	}
	
	/**
	 * 여는 괄호 여부 반환 함수
	 *
	 * @param c: [char] 문자
	 *
	 * @return [boolean] 여는 괄호 여부
	 */
	private static boolean isOpenBrace(char c)
	{
		return c == '(' || c == '{' || c == '[';
	}
	
	/**
	 * 닫는 괄호 여부 반환 함수
	 *
	 * @param c: [char] 문자
	 *
	 * @return [boolean] 여는 괄호 여부
	 */
	private static boolean isCloseBrace(char c)
	{
		return c == ')' || c == '}' || c == ']';
	}
	
	/**
	 * 괄호 매칭 여부 반환 함수
	 *
	 * @param open: [char] 여는 괄호
	 * @param close: [char] 닫는 괄호
	 *
	 * @return [boolean] 괄호 매칭 여부
	 */
	private static boolean isMatched(char open, char close)
	{
		// 소괄호가 서로 매칭될 경우
		if (open == '(' && close == ')')
		{
			return true;
		}
		
		// 중괄호가 서로 매칭될 경우
		else if (open == '{' && close == '}')
		{
			return true;
		}
		
		// 아닐 경우
		else
		{
			return open == '[' && close == ']';
		}
	}
}