class Attempt {

	private ProposedCombination proposedCombination;
	private SecretCombination secretCombination;

	private int nBlacks=0;
	private int nWhites=0;

	public Attempt (ProposedCombination proposedCombination,SecretCombination secretCombination){
		this.proposedCombination=new ProposedCombination();			
		this.proposedCombination=proposedCombination;
		this.secretCombination=new SecretCombination();
		this.secretCombination=secretCombination;
		calculateSpikes();
	}

	private void calculateSpikes() {
		calculateBlacks();
		calculateWhites();
	}

	private void calculateWhites() {
		for (int x=0;x<Combination.NUM_COLORS;x++){
			for (int y=0;y<Combination.NUM_COLORS;y++){
				if (this.secretCombination.colorCombination[x].isEquals(this.proposedCombination.colorCombination[y].nColor())){
					nWhites++;
				}
			}
		}
		nWhites=nWhites - nBlacks;
	}

	private void calculateBlacks() {
		
		for (int x=0;x<Combination.NUM_COLORS;x++){
			if (this.secretCombination.colorCombination[x].isEquals(this.proposedCombination.colorCombination[x].nColor())){
				nBlacks++;
			}
		}
	}

	public String print() {
		return (this.proposedCombination.getCombinationString() + " ---> " + nBlacks + " black and " + nWhites + " whites");
	}
}