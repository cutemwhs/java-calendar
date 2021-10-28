import java.util.Scanner;

public class Prompt {

	private static final String PROMPT ="> ";
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		Calendar cal = new Calendar();
		
		while (true) {
			System.out.println("달을 입력하세요");
			System.out.print(PROMPT);
			int month = scanner.nextInt();
			if (month == -1) {
				break;
			}
			if(month>12) {
				continue;
			}
			System.out.printf("%d월은 %d일까지 있습니다.\n",month,cal.getMaxDaysOfMonth(month));
			cal.printCalendar(2017, month);
		}
		System.out.println("Bye");
		scanner.close();
	}

}
