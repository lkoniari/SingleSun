
package singlesun;


public class MainClass {


    public static void main(String[] args) {
        Sun s = Sun.getUniqueSun();
        Sun s3 = Sun.getUniqueSun();
        
        System.out.println(s==s3);
    }
    
}
