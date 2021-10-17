package Headphones;

public class Headphone {
	
	String color ="Red";
	
	static boolean status =  false;
	static int volume =0;

	
	public static void volumeUp() {
		volume++;	
		
		
		System.out.println(volume);
		
	}
	
	public static void volumeDown() {
		volume--;	
		
		System.out.println(volume);
		
	}

}
