package UserInterface_MultiPllication;

public class Multi {
	private int a;
	private int b;
	private int r;
	
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public Multi() {
		
	}
	
	public int Multi(int a,int b) {
		r=1;
		for(int i=1;i<=b;++i) {
			r=r*a;
		}
		return r;
	}

}
