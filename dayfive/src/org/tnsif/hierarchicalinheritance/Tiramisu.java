package org.tnsif.hierarchicalinheritance;

public class Tiramisu extends Android{
	//private data member
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "Tiramisu [version=" + version +super.toString()+ "]";
	}

	

	public Tiramisu(String brandName, String slotType,int version) {
		super(brandName, slotType);
		// TODO Auto-generated constructor stub
		this.version=version;
	}
	

}
