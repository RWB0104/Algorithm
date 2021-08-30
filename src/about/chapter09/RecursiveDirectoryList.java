package about.chapter09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
 * 누구나 자료 구조와 알고리즘 재귀 폴더 리스트 클래스
 *
 * @author RWB
 * @see <a href="https://blog.itcode.dev/posts/2021/08/04/about-algorithm-chapter09">재귀를 사용한 재귀적 반복</a>
 * @since 2021.08.03 Tue 23:36:43
 */
public class RecursiveDirectoryList
{
	private static final ArrayList<String> LIST = new ArrayList<>();
	
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
		
		writer.write("폴더 리스트를 출력할 경로를 입력하세요 >> ");
		writer.flush();
		
		String path = reader.readLine();
		
		getList(path);
		
		writer.write(String.valueOf(LIST));
		writer.newLine();
		writer.flush();
		
		writer.close();
		reader.close();
	}
	
	/**
	 * 폴더 리스트 산출 함수
	 *
	 * @param path: [String] 경로
	 */
	private static void getList(String path)
	{
		File[] files = new File(path).listFiles(File::isDirectory);
		
		// 파일 배열이 유효할 경우
		if (files != null)
		{
			for (File file : files)
			{
				LIST.add(file.getName());
				
				getList(file.getPath());
			}
		}
	}
}