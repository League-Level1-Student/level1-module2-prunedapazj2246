package _06_minion;

public class Minion {

	
		// TODO Auto-generated method stub
		private String name;
		private int eyes;
		private String color;
		private String master;
			public static void main(String[] args) {
		
			}
			public Minion(String name,int eyes,String color,String master) {
				this.name = name;
				this.eyes = eyes;
				this.color = color;
				this.master=master;
			}
			public int getEyes() {
				return eyes;
			}
			public void setEyes(int eyes) {
				this.eyes =  eyes;}
				
			public String getName() {
					return name;
				}
			
				public void setName(String name) {
					this.name =  name;
				}
				public String getColor() {
					return color;
				}
			
				public void setColor(String color) {
					this.color =  color;
				}
				public String getMaster() {
					return master;
				}
			
				public void setMaster(String master) {
					this.master =  master;
				}
			}
		
	


