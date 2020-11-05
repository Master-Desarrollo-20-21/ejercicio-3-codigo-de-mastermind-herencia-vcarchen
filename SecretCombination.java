import java.util.Random;

public class SecretCombination extends Combination{
	
private boolean isWon;  

	public void generate() {
		Random aleatorio = new Random();
		for (int x=0;x<Combination.NUM_COLORS;x++){
			int nColor = aleatorio.nextInt(8);
			Color color;
			color=new Color(nColor);
			this.colorCombination[x]=color;
		}
	}

	@Override
	public String getCombinationString() {
		return ("XXXX " + super.getCombinationString());
	}

	public boolean isWon() {
		return isWon;
	}

	public void checkWin(Combination proposedCombination) {
		isWon=true;
		for (int x=0;x<Combination.NUM_COLORS;x++){
			if (!proposedCombination.colorCombination[x].isEquals(this.colorCombination[x].nColor())){
				isWon=false;
			}
		}
	}
}
