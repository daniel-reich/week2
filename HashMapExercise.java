import java.util.*;
    
    
class HashMapExercise {
    private HashMap<String,String> names = new HashMap<String,String>();
    
    public static void main(String[] args) {
        HashMapExercise hash = new HashMapExercise();
        hash.addElement("Utah", "Salt Lake City");
        hash.addElement("Utah", "St. George");
        hash.addElement("Colorado", "Denver");
        
        System.out.println(hash.getValue("Utah"));
        System.out.println(hash.getValue("Colorado"));
        
        hash.printAllElements();
        
    }
    

    
    public void addElement(String key,String value) {
        names.put(key,value);
    }

    // get a value from the HashMap at a specific key
    public String getValue(String key) {
        String value = names.get(key);
        return value;
    }

    // print out all the Strings in the HashMap
    public void printAllElements() {
        System.out.println(names);
    }

}
