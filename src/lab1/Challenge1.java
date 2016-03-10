package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using
 * Java Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong
 * with this program and use exception handling where appropriate to prevent
 * the program from crashing. In addition you must display a friendly error
 * message in a JOptionPane and ask the user to try again. (Yes, this violates 
 * the Single Responsibility Principle, but for this lab, we'll overlook that.)
 * 
 * @author  pbremer
 */
public class Challenge1 {
    private static final int LAST_NAME_IDX = 1;
    //private String name;
    //private String lastName;

    public static void main(String[] args) {
        Challenge1 app = new Challenge1();
        
        String fullName = JOptionPane.showInputDialog("Enter full name (use Format: first last):");
        String lastName = app.extractLastName(fullName);
        try{
            lastName = app.extractLastName(fullName);
            String msg = "To the best of our knowledge, your last name is: " + lastName;
            JOptionPane.showMessageDialog(null, msg);
        } catch(IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    // write the code to extract the lastName from the fullName
    // Use exception handling to prevent a crash in the event that fullName
    // is null or empty. Throw the exception the calling method. and handle
    // it there.
    public String extractLastName(String fullName) throws IllegalArgumentException{
        
        String lastName = null;
        String[] parts = null;
        if(fullName == null || fullName.isEmpty() || fullName.split(" ").length < 2){
            throw new IllegalArgumentException("Sorry, full name must contain both first and last name.");
        }
        parts = fullName.split(" ");
        lastName = parts[parts.length-1];
//        String splitter[] = fullName.split(" ");
//        String lastName = splitter[1];
        //name = fullName.split(" ");
//        if(lastName == null || lastName.isEmpty()){
//            throw new IllegalArgumentException("Sorry, last name can't be empty or null.");
//        } else if(splitter.length < 1){
//            throw new ArrayIndexOutOfBoundsException("");
//        }else{}
//        
        return lastName;
    }

}
