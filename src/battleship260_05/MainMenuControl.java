
package battleship260_05;

/**
 *
 * @author Logan Work
 */
public class MainMenuControl {
    
    public void displayPSelectMenu(){
        PlayerMenuView playerMenu = new PlayerMenuView();
        playerMenu.getInput();
        //System.out.println("This will point to the Player Select Menu");
    }
    public void displayOptionsMenu(){
        OptionsMenuView optionMenu = new OptionsMenuView();
        optionMenu.getInput();
        //System.out.println("This will point to the Options Menu");
    }
    public void displayRulesMenu(){
        RulesMenuView ruleMenu = new RulesMenuView();
        ruleMenu.getInput(); 
    }
    public void displayCreditsMenu(){
        //CreditMenuView creditMenu = new CreditMenuView();
        //creditMenu.getCredits();
        System.out.println("This will point to the Dev Credits Menu");
    }
    public void displayHelpMenu(){
        HelpMenuView helpMenu = new HelpMenuView(); 
        helpMenu.getInput();
    }
    public void displayHighScores(){
        HighScoreView highScores = new HighScoreView();
        highScores.getInput(); 
    }
}
