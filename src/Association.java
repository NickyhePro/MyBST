
import java.util.*;

/**
 *
 * @author Nick He
 */
public class Association{
    
    private int key; // the key of the key-value pair
    private List<String> values = new ArrayList<>(); // the value of the key-value pair

   
    // pre: key is non-null
    // post: constructs a key-value pair
    public Association(int key, String value)
    {
        this.key = key;
        this.values.add(value);
    }

    // post: returns value from association
    public List getValue() 
    {
        return this.values;
    }

    // post: returns key from association
    public int getKey() 
    {
        return this.key;
    }

    // post: sets association's value to value
    public List<String> setValue(List<String> values) 
    {
        this.values = values;
        return values;
    }
}
