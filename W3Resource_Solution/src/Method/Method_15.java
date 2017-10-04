package Method;
/*
 * Write a Java method to display the current date and time.
 * 
 * Expected Output:
 * Current date and time: Wednesday January 25, 2017 7:47:43
 * 
 * */
import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

public class Method_15 {

	public static void main(String[] args) {
		
		timeDisplayByCalendar();
	}

	public static void timeDisplayByCalendar() {
		/*
		 * Formatter 클래스의 사용법
		 * 
		 * 포맷을 지정한 문자열이 출력될 곳은 Appendable 인터페이스를
		 * 구현한 클래스여야 한다.
		 * StringBuffer, PrintStream, FileWriter 등이 있다.
		 * 
		 * */
		StringBuffer sb = new StringBuffer();
		Formatter f = new Formatter(sb);
		Calendar c = Calendar.getInstance();
		
		// Wednesday January 25, 2017 7:47:43
		f.format(Locale.US, "%tA %tB %te, %tY %tk:%tM:%tS", 
				c, c, c, c, c, c, c);
		System.out.println(f);
		
		// 버퍼에 저장되어 있는 문자열들이 모두 출력이 되면서 
		// 버퍼를 비우는 함수
		//f.flush();

		// Calendar.getInstance()에 parameter를 locale, timezone 
		// 두 가지 보낼 수 있다.
		// locale은 사용하는 컴퓨터의 지역을 나타내는것 같고
		// timezone은 받아오는 시간을 지정하는것 같다.
		Calendar cUS = Calendar.getInstance(Locale.US);
		f.format("%tA %tB %te, %tY %tk:%tM:%tS", 
				cUS, cUS, cUS, cUS, cUS, cUS, cUS);
		
		System.out.println(f);
	}
}
