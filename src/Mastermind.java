class Mastermind {

    private Game game;

    public Mastermind(){
        this.game=new Game();
    }

    public static void main(String[] args) {
        new Mastermind().play();
      }

      private void play() {
          do{
              this.game.play();
          } while (this.isResumed());
      }

      private boolean isResumed() {
          String answer;
          do{
            new Console().out("\nRESUME? (y/n)");
            Console console = new Console();
            answer=console.inString();  
          } while (!answer.equals("Y") && !answer.equals("y") && !answer.equals("n") && !answer.equals("N"));
          return answer.equals("Y") || answer.equals("y");
      }
} 
