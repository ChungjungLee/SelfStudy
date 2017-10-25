package study.Enum;

public class EnumTestComplexed {

	public static void main(String[] args) {
		// CommandEnum class�� START������ �����ϴ� ��ó�� ����
		CommandEnum commandEnum = CommandEnum.START;
		
		switch (commandEnum) {
			case START:
			case STOP:
				System.out.println(commandEnum.name());
				System.out.println(commandEnum.getCommand());
				System.out.println(commandEnum.getOpt());
				System.out.println(commandEnum.getNum());
				break;
		}
		
	}

}

enum CommandEnum {
	/*
	 * enum class�� constructor ���Ĵ�� ������ �����ϸ� �ȴ�.
	 */
	START("start", "opt", 1), STOP("stop", "opt", 2);
	
	private String command;
	private String opt;
	private int num;
	
	CommandEnum(String command, String opt, int num) {
		this.command = command;
		this.opt = opt;
		this.num = num;
	}
	
	public String getCommand() {
		return this.command;
	}
	
	public String getOpt() {
		return this.opt;
	}
	
	public int getNum() {
		return this.num;
	}
}