public class ProposedCombination extends Combination {

	public ProposedCombination ask() {
        String answer;
        boolean error;
        
        do{
            new Console().out("\nPropose a combination:");
            Console console = new Console();
            answer=console.inString();
            error=checkproposedCombination(answer);
        }while(!error);
        
        return convertStringToCombination(answer);
    }

    private boolean checkproposedCombination(String answer) {
        if (answer.length()!=NUM_COLORS){
            new Console().out("\nWrong proposed combination length");
            return false;
        }
        if (!checkColorsProposedCombination(answer)) {
            new Console().out("\nWrong colors, they must be: RBYGOP");
            return false;
        };
        return true;
    }

    private ProposedCombination convertStringToCombination(String answer) {
        ProposedCombination proposedCombination;
        proposedCombination=new ProposedCombination();
        for (int x=0; x<NUM_COLORS;x++){
            Color color;
            color=new Color(answer.charAt(x));
            proposedCombination.colorCombination[x] = color;
        }
		return proposedCombination;
	}

    private boolean checkColorsProposedCombination(String answer) {
        assert answer.length()!=4;
        
        for(int x=0;x<Combination.NUM_COLORS;x++){
            if (!Color.isValidColor(answer.charAt(x))) {
                return false;
            }
        }
        return true;
    }
}
