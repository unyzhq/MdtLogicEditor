package pojo;

public class Options{
	public int Oid;
	public String Ovalue;
	public int Olid;
	public Tips Tip;
	public void setOid(int Oid) {
		this.Oid = Oid;
	}
	public int getOid() {
		return Oid;
	}
	public void setOvalue(String Ovalue) {
		this.Ovalue = Ovalue;
	}
	public String getOvalue() {
		return Ovalue;
	}
	public void setOlid(int Olid) {
		this.Olid = Olid;
	}
	public int getOlid() {
		return Olid;
	}
	public void setTip(Tips Tip) {
		this.Tip = Tip;
	}
	public Tips getTip() {
		return Tip;
	}
	@Override
	public String toString() {
		return "Options : [Oid = " + Oid
			 + ", Ovalue = " + Ovalue
			 + ", Olid = " + Olid
			 + ", Tip = " + Tip + "]";
	}
}
