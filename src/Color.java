

public class Color {

    private int nColor;
    
    public static final char[] COLORS = {'R', 'B', 'G', 'Y','P', 'M', 'O', 'S'};

    public Color(int nColor){
        this.nColor=nColor;
    }

    public Color (char strColor){
        for (int x=0;x<COLORS.length;x++){
            if (strColor==COLORS[x]) {
                nColor=x;
            }
        }
    }

    public boolean isEquals(int nColor){
        return this.nColor==nColor;
    }

    public static boolean isValidColor(char color){
        for (int x=0;x<COLORS.length;x++){
            if (color==COLORS[x]) {
                return true;
            }
        }
        return false;
    }

    public char strColor(){
        return COLORS[this.nColor];
    }

    public int nColor(){
        return nColor;
    }
}
