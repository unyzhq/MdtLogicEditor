package pojo;

public class Tips {
	public int Tid;
	public String TadvanceExpression;
	public String TbasisExpression;
	public String Texplain;
	public void setTid(int Tid) {
		this.Tid = Tid;
	}
	public int getTid() {
		return Tid;
	}
	public void setTadvanceExpression(String TadvanceExpression) {
		this.TadvanceExpression = TadvanceExpression;
	}
	public String getTadvanceExpression() {
		return TadvanceExpression;
	}
	public void setTbasisExpression(String TbasisExpression) {
		this.TbasisExpression = TbasisExpression;
	}
	public String getTbasisExpression() {
		return TbasisExpression;
	}
	public void setTexplain(String Texplain) {
		this.Texplain = Texplain;
	}
	public String getTexplain() {
		return Texplain;
	}
	@Override
	public String toString() {
		return "Tips : [Tid = " + Tid
		     + ", TadvanceExpression = " + TadvanceExpression
		     + ", TbasisExpression" + TbasisExpression
		     + ", Texplain = " + Texplain + "]";
	}
}
