package Week1.Design_Patterns_And_Principles_Hands_on_01.Code;


public class Main {
  public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        // Prints 'true' if both s1 and s2 reference the same Singleton instance)
        System.out.println(s1 == s2);  
    }
}
