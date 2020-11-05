public class Game {

	private SecretCombination secretCombination;
	private ProposedCombination proposedCombination;
	private Attempt[] attempts; 
	private final int NUMMAXATTEMPS=10;
	private int numAttemps;

	public void play() {
		secretCombination=new SecretCombination();
		secretCombination.generate();
		attempts=new Attempt[NUMMAXATTEMPS];
		numAttemps=0;
		proposedCombination=new ProposedCombination();
		new Console().out("\n----- MASTERMIND -----");
		do{
			this.mostrar();
			proposedCombination= proposedCombination.ask();
			attempts[numAttemps]=new Attempt(proposedCombination,secretCombination); 
			secretCombination.checkWin(proposedCombination);
			numAttemps++;
		} while (!secretCombination.isWon() && numAttemps<NUMMAXATTEMPS);
		if (secretCombination.isWon()){
			new Console().out("\nYou've WON!!! ;-)");
		}
		else{
			new Console().out("\nYou've lost!!! :-(");
		}
	}

	private void mostrar() {
		new Console().out("\n" + numAttemps + " attemp(s):");
		new Console().out("\n" + secretCombination.getCombinationString());
		for (Attempt attempt : attempts) {
			if (attempt!=null){
				new Console().out("\n" + attempt.print());
			}
		}
	}
}
