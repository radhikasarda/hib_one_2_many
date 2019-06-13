package Hib_mapping_one_to_many_eg;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class College {

	@Id
	private int col_id;
	
	private String col_name;
	
	private String col_add;
	
	@OneToMany(mappedBy="college")
	
	private List<Branch> branch=new ArrayList<>();
	
	public College() {}

	public College(int col_id, String col_name, String col_add, List<Branch> branch) {
		super();
		this.col_id = col_id;
		this.col_name = col_name;
		this.col_add = col_add;
		this.branch = branch;
	}


	public List<Branch> getBranch() {
		return branch;
	}


	public void setBranch(List<Branch> branch) {
		this.branch = branch;
	}


	public int getCol_id() {
		return col_id;
	}

	public void setCol_id(int col_id) {
		this.col_id = col_id;
	}

	public String getCol_name() {
		return col_name;
	}

	public void setCol_name(String col_name) {
		this.col_name = col_name;
	}

	public String getCol_add() {
		return col_add;
	}

	public void setCol_add(String col_add) {
		this.col_add = col_add;
	}

	@Override
	public String toString() {
		return "College [col_id=" + col_id + ", col_name=" + col_name + ", col_add=" + col_add + ", branch=" + branch
				+ "]";
	}
	
	
	
	
}
