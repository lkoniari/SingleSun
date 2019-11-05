
package singlesun;

public class Sun {
    private static Sun sun; 
/*prepei na einai static(kai ta dio) gia na mporo na
tin kaleso me to onoma tis klasis*/
    
    // mesa se mia klasi exo anafora tis idias klasis. 
    // afto einai to periergo alla
    //afto einai to singleton pattern
    
    private Sun(){
    }

    public static Sun getUniqueSun(){
        if(sun==null){
            sun = new Sun();
        }
        return sun;
    }
}
