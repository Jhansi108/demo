package DrawbacksofArray;

public class JtpExample1 {  
    private final String s;  
    JtpExample1(final String s) {  
    this.s = s;  
    }  
    public final String getName() {  
    return s;  
    }  
    public static void main(String[] args) {  
    JtpExample1 obj = new JtpExample1("Core Java Training");  
    System.out.println(obj.getName());  
    }  
    }