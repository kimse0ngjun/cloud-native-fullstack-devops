package exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ObjectStreamRun {
   /*
     실행결과 
     제목1  내용1, 글쓴이1  2026-01-09
     제목2  내용2, 글쓴이2  2026-01-09
     제목3  내용3, 글쓴이3  2026-01-09
    */
   
   
   public static void writeList() {
      // List 생성
	  List<Board> sList = new ArrayList<Board>(); 
	  sList.add(new Board(1, "제목1", "내용1", "글쓴이1", new Date()));
	  sList.add(new Board(2, "제목2", "내용2", "글쓴이2", new Date()));
	  sList.add(new Board(3, "제목3", "내용3", "글쓴이3", new Date()));
      // List에 Board 객체 저장
      // 출력 스트림을 이용해서 출력
	  FileOutputStream fos = null;
	  ObjectOutputStream oos = null;
	  try {
		  fos = new FileOutputStream("C:\\Temp\\board.db"); // C:\\Temp\\board.db
		  oos = new ObjectOutputStream(fos);
		  oos.writeObject(sList);
		  
	  } catch (Exception e) {
		e.getMessage();
	  } finally {
		try {
			oos.close();
			fos.close();
			System.out.println("board.db 파일에 출력했습니다.");
		} catch (Exception e2) {
			System.out.println("예외 발생 : " + e2.getMessage());
		}
	  }
   }
   
   public static List<Board> readList() {
      //입력 스트림 이용해서 List 읽기
	   FileInputStream fis = null;
	   ObjectInputStream ois = null;
	   
	   try {
		fis = new FileInputStream("C:\\Temp\\board.db");
		ois = new ObjectInputStream(fis);
		List<Board> sList = (List<Board>) ois.readObject();
		
		return sList;
		
	   } catch (Exception e) {
		   e.getMessage();
	   } finally {
			try {
				ois.close();
				fis.close();
				System.out.println("board.db 입력을 종료합니다.");
			} catch (Exception e2) {
				System.out.println("예외 발생 : " + e2.getMessage());
			}
		}
	return null;
   }

   public static void main(String[] args) {
	   
	  writeList();
	  List<Board> slist = readList();
//	  readList();
	  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //hh-mm-ss -> 시간 분 초
	  
	  for (Board board : slist) {
		  System.out.println(board.getBno() + "\t" + board.getTitle() + "\t" + board.getContent() 
		  + "\t" + board.getWriter() + "\t" + sdf.format(board.getDate()));
	  }
   }

}