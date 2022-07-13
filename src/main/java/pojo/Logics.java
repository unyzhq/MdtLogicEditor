package pojo;

public class Logics{
	public int Lid;
	public String Lvalue;
	public Tips Tip;
	public void setLid(int Lid) {
		this.Lid = Lid;
	}
	public int getLid() {
		return Lid;
	}
	public void setLvalue(String Lvalue) {
		this.Lvalue = Lvalue;
	}
	public String getLvalue() {
		return Lvalue;
	}
	public void setTip(Tips Tip) {
		this.Tip = Tip;
	}
	public Tips getTip() {
		return Tip;
	}
	@Override
	public String toString() {
		return "Logics : [Lid = " + Lid
			 + ", Lvalue = " + Lvalue
			 + ", Tip = " + Tip + "]";
	}
}
