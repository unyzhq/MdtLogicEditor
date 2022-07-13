package pojo;

public class Entrys {
	public Logics logic;
	public Options option;
	public GlobalVars globalVar;
	public String value;
	public Entrys(Logics logic) {
		this.logic = logic;
		value = logic.Lvalue;
	}
	public Entrys(Options option) {
		this.option = option;
		value = option.Ovalue;
	}
	public Entrys(GlobalVars globalVar) {
		this.globalVar = globalVar;
		value = globalVar.Gvalue;
	}
	public boolean isLogics() {
		return logic != null;
	}
	public boolean isOptions() {
		return option != null;
	}
	public boolean isGlobalVars() {
		return globalVar != null;
	}
}
