package lab2;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  pbremer
 */
public class NameService {
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws IllegalArgumentException if fullName is null or empty or has 
     * fewer than two parts
     */
    public String extractLastName(String fullName) {
        
        String splitter[] = fullName.split(" ");
        String lastName = splitter[1];
        if(lastName == null || lastName.isEmpty()){
            throw new IllegalArgumentException("Sorry, last name can't be empty or null.");
        } else if(splitter.length < 1){
            throw new ArrayIndexOutOfBoundsException("");
        }else{}
        
        return lastName;
    }
    

    
    
}
