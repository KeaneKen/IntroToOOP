public class PersonDemo {
    public static void main(String[] args) {
        // Create a person using the default constructor
        Person alice = new Person();
        // Update attributes using setter methods
        alice.setName("Alice");
        alice.setAge(25);
        alice.setGender("Female");
        alice.setHobby("Playing Hockey");
        alice.setOccupation("Student");
        
        // Create a person using the parameterized constructor
        Person bob = new Person("Bob", 30, "Male", "Gaming", "Underpaid Teacher");
        
        // Display information for alice
        System.out.println("Alice's Information:");
        alice.displayInfo();
        System.out.println(alice.greet());
        System.out.println();
        
        // Display information for bob
        System.out.println("Bob's Information:");
        bob.displayInfo();
        System.out.println(bob.greet());
    }
}

