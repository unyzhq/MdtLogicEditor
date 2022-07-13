package pojo;

public class GlobalVars{
	public int Gid;
	public String Gvalue;
	public int Glid;
	public String Gexplain;
	public void setGid(int Gid) {
		this.Gid = Gid;
	}
	public int getGid() {
		return Gid;
	}
	public void setGvalue(String Gvalue) {
		this.Gvalue = Gvalue;
	}
	public String getGvalue() {
		return Gvalue;
	}
	public void setGlid(int Glid) {
		this.Glid = Glid;
	}
	public int getGlid() {
		return Glid;
	}
	public void setGexplain(String Gexplain) {
		this.Gexplain = Gexplain;
	}
	public String getGexplain() {
		return Gexplain;
	}
	@Override
	public String toString() {
		return "GlobalVars : [Gid = " + Gid
			 + ", Gvalue = " + Gvalue
			 + ", Glid = " + Glid
			 + ",Gexplain = " + Gexplain + "]";
	}
}
