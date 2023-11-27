package entity;

public class Employee {

	
	private String ename;
	private int eid;
	private long ephno;
	private double esal;
	private int eage;
	private String edesgn;
	
	public Employee(String ename, int eid, long ephno, double esal, int eage, String edesgn) {
		super();
		this.ename = ename;
		this.eid = eid;
		this.ephno = ephno;
		this.esal = esal;
		this.eage = eage;
		this.edesgn = edesgn;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public long getEphno() {
		return ephno;
	}

	public void setEphno(long ephno) {
		this.ephno = ephno;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	public int getEage() {
		return eage;
	}

	public void setEage(int eage) {
		this.eage = eage;
	}

	public String getEdesgn() {
		return edesgn;
	}

	public void setEdesgn(String edesgn) {
		this.edesgn = edesgn;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", ephno=" + ephno + ", esal=" + esal + ", eage=" + eage
				+ ", edesgn=" + edesgn + "]";
	}
	
}
