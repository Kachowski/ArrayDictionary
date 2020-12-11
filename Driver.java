public class Driver {
    public static void main(String[] args) {
        Dictionary d = new Dictionary();

        System.out.println("This dictionary's current size: " + d.size());
        System.out.println("The dictionary will now be populated with two key-value pairs [3, 4] and [key, value].");
        d.put(3,4);
        System.out.println("This should be 4: " + d.get(3));
        d.put("key","value");
        System.out.println("This should be value: " + d.get("key"));

        System.out.println("This should be true to show that 3 is a key in the dictionary: " + d.contains(3));

        System.out.println("This will return a Collection of Keys: " + d.Keys());
        System.out.println("This will return a Collection of Values: " + d.Values());

        System.out.println("This is the current size: " + d.size());
        System.out.println("Key-Value pair [key, value] was just removed and should now display value: " + d.remove("key"));

        System.out.println("There is still one Key-Value pair so isEmpty should display false: " + d.isEmpty());




    }
}
