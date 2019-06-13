package Hib_mapping_one_to_many_eg;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Branch {

	@Id
	private int bid;
	private String bname;

	@ManyToOne
	private College college;
	
	
	public Branch() {}
	
	
	


	public Branch(int bid, String bname, College college) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.college = college;
	}





	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	
	


	public College getCollege() {
		return college;
	}





	public void setCollege(College college) {
		this.college = college;
	}





	@Override
	public String toString() {
		return "Branch [bid=" + bid + ", bname=" + bname + ", college=" + college + "]";
	}
	
	
	
	
}
