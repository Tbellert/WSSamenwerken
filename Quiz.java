import java.util.Scanner;

public class Quiz {
	String[] jokes = {
			"Did you hear the one about the guy with the broken hearing aid? Neither did he.", 
			"What do you call a fly without wings? A walk.", 
			"When my wife told me to stop impersonating a flamingo, I had to put my foot down.",
			"What do you call someone with no nose? Nobody knows.", 
			"What time did the man go to the dentist? Tooth hurt-y.", 
			"Why can’t you hear a pterodactyl go to the bathroom? The p is silent.",
			"How many optometrists does it take to change a light bulb? 1 or 2? 1... or 2?", 
			"I was thinking about moving to Moscow but there is no point Russian into things.", 
			"Why does Waldo only wear stripes? Because he doesn't want to be spotted.", 
			"Do you know where you can get chicken broth in bulk? The stock market.", 
			"I used to work for a soft drink can crusher. It was soda pressing.", 
			"A ghost walks into a bar and asks for a glass of vodka but the bar tender says, “sorry we don’t serve spirits”",
			"I went to the zoo the other day, there was only one dog in it. It was a shitzu.",
			"I gave all my dead batteries away today, free of charge.",
			"Why are skeletons so calm? Because nothing gets under their skin.",
			"There’s a new type of broom out, it’s sweeping the nation.",
			"Why don’t seagulls fly over the bay? Because then they’d be bay-gulls!",
			"What did celery say when he broke up with his girlfriend? She wasn't right for me, so I really don't carrot all.",
			"Q: What’s 50 Cent’s name in Zimbabwe? A: 400 Million Dollars.",
			"What's the worst thing about ancient history class? The teachers tend to Babylon.",
			};
	
	Scanner input = new Scanner(System.in);
	
	Quiz() {
		System.out.println("Welcome to Dadjoke Mayhem");
		System.out.println("THE place for dadjokes!");
		System.out.println("");
	}
	
	public void gameMenu() {
		boolean inMenu = true;
		while (inMenu) {
			System.out.println("What would you like to do?");
			System.out.println("S | Start");
			System.out.println("Q | Leave");
			String menuChoice = input.next();
			switch(menuChoice.toLowerCase()) {
			case "s": 
				runGame();
				break;
			case "q":
				System.out.println("Bye Bye");
				System.exit(0);
				break;
			default: 
				System.out.println("This is not a valid option. Try again!");
				break;
			}
		}
	}
	
	public void runGame() {
		boolean start = true;
		while (start) {
			System.out.println("Would you like to hear a dadjoke?");
			System.out.println("Y | Yes please");
			System.out.println("N | No thanks");
			String choice = input.next();
			switch(choice) {
			case "y": 
				getJoke();
				break;
			case "n":
				gameMenu();
				break;
			default: 
				System.out.println("This is not a valid option. Try again!");
				break;
			}
		}
	}
	
	public void getJoke() {
		int random = (int) Math.floor(Math.random() *(jokes.length - 0 + 1) + 0);
		System.out.println("");
		System.out.println(jokes[random]);
		System.out.println("");
	}
}
