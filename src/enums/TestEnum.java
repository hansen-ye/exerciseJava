package enums;

import java.util.ArrayList;

public enum TestEnum {
	
	S("FC0001", "01"),
	A("FC0010", "01");

	private String a;
	private String b;
	ArrayList < Integer > al = new ArrayList < Integer > ();
	private TestEnum(String a, String b) {
		this.a = a;
		this.b = b;
	}

	public String getA() {
		return this.a;
	}

	public String getB() {
		return this.b;
	}
}
