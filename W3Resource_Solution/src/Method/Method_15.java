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
		 * Formatter Ŭ������ ����
		 * 
		 * ������ ������ ���ڿ��� ��µ� ���� Appendable �������̽���
		 * ������ Ŭ�������� �Ѵ�.
		 * StringBuffer, PrintStream, FileWriter ���� �ִ�.
		 * 
		 * */
		StringBuffer sb = new StringBuffer();
		Formatter f = new Formatter(sb);
		Calendar c = Calendar.getInstance();
		
		// Wednesday January 25, 2017 7:47:43
		f.format(Locale.US, "%tA %tB %te, %tY %tk:%tM:%tS", 
				c, c, c, c, c, c, c);
		System.out.println(f);
		
		// ���ۿ� ����Ǿ� �ִ� ���ڿ����� ��� ����� �Ǹ鼭 
		// ���۸� ���� �Լ�
		//f.flush();

		// Calendar.getInstance()�� parameter�� locale, timezone 
		// �� ���� ���� �� �ִ�.
		// locale�� ����ϴ� ��ǻ���� ������ ��Ÿ���°� ����
		// timezone�� �޾ƿ��� �ð��� �����ϴ°� ����.
		Calendar cUS = Calendar.getInstance(Locale.US);
		f.format("%tA %tB %te, %tY %tk:%tM:%tS", 
				cUS, cUS, cUS, cUS, cUS, cUS, cUS);
		
		System.out.println(f);
	}
}
