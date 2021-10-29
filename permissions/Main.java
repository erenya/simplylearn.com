package permissions;

public class Main {

	public static void main(String[] args) {
		
		
		SuperAdmin user = new SuperAdmin();
		
		
		user.canDelete();		
		user.canEdit();
		user.canAddNewAdmin();

		
		
		
	}

}
