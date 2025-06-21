package Week1.Design_Patterns_And_Principles_Hands_on_01.Code;

public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {  
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
