package org.abhi.beans;

public class DemoBean {
	private A a;
	private B b;
	private C c;
	
	public DemoBean() {
		System.out.println("Constructor : default");
	}
	
	public DemoBean(A a) {
		this.a = a;
		System.out.println("Constructor : A a"  );
	}
	
	public DemoBean(B b) {
		this.b = b;
		System.out.println("Constructor : B b"  );
	}
	
	public DemoBean(C c) {
		this.c = c;
		System.out.println("Constructor : C c"  );
	}
	
	public DemoBean(A a, B b) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor : A a, B b"  );
	}
	
	public DemoBean(B b, A a) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor : B b, A a"  );
	}
	
	
	public DemoBean(A a, B b, C c) {
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("Constructor : A a, B b, C c"  );
	}
	
	public DemoBean(C c, A a, B b) {
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("Constructor : C c, A a, B b"  );
	}
	
	public DemoBean(B b, C c, A a) {
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println("Constructor : B b, C c, A a"  );
	}
	
	
	public A getA() {
		return a;
	}
	public void setA(A a) {
		this.a = a;
	}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	public C getC() {
		return c;
	}
	public void setC(C c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "DemoBean [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
}
