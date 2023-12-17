package Utils;

import java.util.Scanner;

public class InputManager {
	private static Scanner sc = new Scanner(System.in);
	// 스캐너?
	public static int getInt(String msg) {
		System.out.print(msg);
		int sel = -1;
		try {
			sel = sc.nextInt();
		}catch (Exception e) {
			System.out.println("숫자를 입력하세요");
			sc.nextLine();
		}
		return sel;
	}
	
	public static String getStr(String msg) {
		System.out.println(msg);
		return sc.next();
	}
	
	// 숫자 범위
	public static int selValue(int sel, int start, int end) {
		if (sel < start || sel > end) {
			return -1;
		}
		return sel;
	}
	
	public static void scClose() {
		sc.close();
	}
}
