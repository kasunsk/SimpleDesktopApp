package data;

public class Persion {
	
	private String id;
	private String name;
	private boolean sex;
	private String addres;
	private String tpnumber;
	
	public Persion(){
		
	}
	
	public String getId(){
		return this.id;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setAddres(String addres){
		this.addres = addres;
	}
	
	public void setSex(boolean sex){
		this.sex = sex;
	}
	
	private boolean getSex(){
		return this.sex;
	}
	
	public String getAddress(){
		return this.addres;
	}
	
	public String getTpnum(){
		return this.tpnumber;
	}
	
	public void setTpnumber(String tpnumber){
		this.tpnumber = tpnumber;
	}

}
