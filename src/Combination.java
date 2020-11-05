class Combination {
    
    public Color[] colorCombination;

    public static final int NUM_COLORS = 4;

    public Combination(){
        colorCombination=new Color[NUM_COLORS];
    }

    public String getCombinationString(){
        //  for (Color[] color : colorCombination){
        //      color.show();
        //  }
        assert colorCombination!=null;
        String strCombination="";
        for (int x = 0; x < NUM_COLORS ; x++) {
            strCombination+=colorCombination[x].strColor();
        }
        return strCombination;
    }
}
