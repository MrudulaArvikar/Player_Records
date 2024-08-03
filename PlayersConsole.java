package players.com.mrudula;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlayersConsole {
	private PlayersDB pdb;
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
	public PlayersConsole() {
		super();
		pdb=new PlayersDB();
	}
	
		int menu() throws IOException
		 { 
		int choice=0;
		 System.out.println("1--->Add a Player");
		 System.out.println("2--->Show all Players");
		 System.out.println("3--->Search a Player by name");
		 System.out.println("4--->Remove a Player");
		 System.out.println("5--->Edit a Player");
		 System.out.println("6--->Exit");
		 System.out.println("Enter your choice");
		 choice=Integer.parseInt( br.readLine());
		 return choice;
		 }
		public void start() throws IOException
		 {
		 while (true) {

		 int choice=menu();
		 switch (choice) {
		 case 1: // add Student
		 add();
		 break;
		 case 2:// Show all
		 showAll();
		 break;
		 
		 case 3: //Search a Student
		 search();

		 break;
		 case 4: //Remove a Student
		 remove();

		 break;
		 case 5: //Edit a Student
		 edit();

		 break;
		 case 6: //exit
		 System.exit(0);

		 break;

		 default: System.out.println("You entered wrong choice");
		 }
		 }
	 }//start
		

		public void search() throws IOException {
			// TODO Auto-generated method stub
			System.out.println("Enter name of player to be searched");
	        String target = br.readLine();
	        Players p = pdb.findByName(target);
	        if (p == null) {
	            System.out.println("No such player found");
	        } else {
	            System.out.println("Player found: " + p);
	        }
			
		}

		public void edit() throws IOException {
			// TODO Auto-generated method stub
			System.out.println("Enter name of player to be edited");
	        String target = br.readLine();
	        Players p = pdb.findByName(target);
	        if (p == null) {
	            System.out.println("No such player found");
	        } else {
	            System.out.println("Enter new name for the player:");
	            String newName = br.readLine();
	            System.out.println("Enter new runs for the player:");
	            int newRuns = Integer.parseInt(br.readLine());
	            pdb.edit(target, newName, newRuns);
	            System.out.println("Player details updated successfully");
	        }
			
		}


		public void add() throws IOException {
		 System.out.println("Enter data (name,runs)");
		 System.out.print("Name:\t");
		 String name = br.readLine();
		 System.out.print("Runs:\t");
		 int runs= Integer.parseInt(br.readLine());
		 Players p=new Players(name,runs);
		 if(pdb.add(p)) {
 			System.out.println("Student added successfully...");
 		}
	 }//add
		
		public void showAll() {
		System.out.println("The data entered "+pdb.toString());
		}//show all
		
		
		public void remove() throws IOException {
		    System.out.println("Enter player name to be removed");
		    String targetName = br.readLine();
		    Players p = pdb.findByName(targetName);
		    if (p == null) {
		        System.out.println("No such player found");
		    } else {
		        pdb.remove(p);
		        System.out.println("Player removed successfully");
		    }
		}

		
		
	
}
