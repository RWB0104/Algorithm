package about.chapter09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
 * 누구나 자료 구조와 알고리즘 폴더 리스트 클래스
 *
 * @author RWB
 * @see <a href="https://blog.itcode.dev/posts/2021/08/04/about-algorithm-chapter09">재귀를 사용한 재귀적 반복</a>
 * @since 2021.08.03 Tue 23:32:46
 */
public class MoreDirectoryList
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
		
		writer.write("폴더 리스트를 출력할 경로를 입력하세요 >> ");
		writer.flush();
		
		String path = reader.readLine();
		
		ArrayList<String> list = getList(path);
		
		writer.write(String.valueOf(list));
		writer.newLine();
		writer.flush();
		
		writer.close();
		reader.close();
	}
	
	/**
	 * 폴더 리스트 반환 함수
	 *
	 * @param path: [String] 경로
	 *
	 * @return [ArrayList<String>] 폴더 리스트
	 */
	private static ArrayList<String> getList(String path)
	{
		ArrayList<String> list = new ArrayList<>();
		
		File[] files = new File(path).listFiles(File::isDirectory);
		
		// 파일 배열이 유효할 경우
		if (files != null)
		{
			for (File file : files)
			{
				list.add(file.getName());
				
				File[] files1 = file.listFiles(File::isDirectory);
				
				// 파일 배열이 유효할 경우
				if (files1 != null)
				{
					for (File file1 : files1)
					{
						list.add(file1.getName());
					}
				}
			}
		}
		
		return list;
	}
}