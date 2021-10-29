package permissions;

public class Registered {
	
	String username;
	int password;
	int usertype =1;
	
	
	public int getUsertype() {
		return usertype;
	}


	public void setUsertype(int usertype) {
		this.usertype = usertype;
	}


	public static void canLogin(){
		
	System.out.println("This user can login to website");	
	

		
	}
	
	

}
