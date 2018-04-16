import java.util.*;

public class Persona{
	public String PersonaName;
	public String Arcana;
	public int HP;

//Default constructor
	public Persona(){
		PersonaName = "";
		Arcana = "";
		HP = 0;
	}

//Constructor with Arguments

	public Persona (String PersonaName,String Arcana,int HP){
		PersonaName=this.PersonaName;
		Arcana = this.Arcana;
		HP = this.HP;
	}

	public void DisplayPersonaStats(){
		System.out.println(this.PersonaName);
	}


public static void main(String[] args) {
	

	System.out.println("Create a Persona \n");
	//Create a scanner

	/*FIXED BUG: Whenever entering String input with spaces, it only takes first space.
	Solution: Instead of using reader.next, it should be reader.nextLine()*/

	Scanner reader = new Scanner(System.in);

	//Persona Name

	System.out.println("Persona Name: ");
	String InputName = reader.nextLine();

	//Arcana Name

	System.out.println("Representative Arcana: ");
	String InputArcana = reader.nextLine();

	//HP
	//Enhancement Request: Retry if they don't put int.

	System.out.println("Initial HP: ");
	int PersonaHP = reader.nextInt();

	Persona FirstPersona = new Persona(InputName,InputArcana,PersonaHP);

	FirstPersona.DisplayPersonaStats();



	}//End of Main

}//End of Program
