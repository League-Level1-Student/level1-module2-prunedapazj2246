package _07_tea_party;

public class TeaParty {
	/*private String name;
	private boolean isWoman;
	private boolean isKnighted;
	public TeaParty(String name, boolean isWoman, boolean isKnighted) {
    
this.name=name;
this.isWoman=isWoman;
this.isKnighted=isKnighted;
}
   
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public boolean getIsWoman() {
return isWoman;	
}
public void setIsWoman(boolean isWoman) {
this.isWoman= isWoman;
}
public boolean getIsKnighted() {
return isKnighted;	
}
public void setIsKnighted(boolean isKnighted) {
this.isKnighted= isKnighted;
}*/

public String welcome(String name, boolean isWoman  , boolean isKnighted) {
   if(isWoman == true) {
	if(isKnighted == true) {
		String h = "Hello Lady "+ name ;	
		return h;
	}
	else {
		String h = "Hello Ms. "+ name ;
		return h;
	}
	
}
else {
	if(isKnighted == true) {
		String h =	"Hello Sir "+ name ;
		return h;
		}
		else {
			String h ="Hello Mr. "+ name ;
			return h;
		}
		
}

}
}


