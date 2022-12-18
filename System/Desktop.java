package week3Day1.classassignments.System;

public class Desktop extends Computer {
	
	public int desktopSize(int size)
	{
		return size;
	}
	
	public String computerModel(String modelName) {
		return modelName;
	
	}
	
	
	public static void main(String[] args) {
		
		Desktop mySystem = new Desktop();
		String computerModel = mySystem.computerModel("DELL DESKTOP-CFJT8VS");
		System.out.println("The computer model name is " + computerModel);
		int desktopSize = mySystem.desktopSize(21);
		System.out.println("The Dekstop size is  " + desktopSize);		
		
	}
}
