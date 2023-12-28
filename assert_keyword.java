class assert_keyword 
{
    public static void main(String[] args) {
        int age = 15;

        // Assuming age should be greater than or equal to 18
        assert age >= 18 : "Age must be 18 or older";

        System.out.println("You are an adult!");
    } 
}