import containers.*;
public class Main {

    public static void main(String[] args) {
        // write test code here
    	ProductContainerRecorder juice = new ProductContainerRecorder("juice", 1000.0, 1000.0);
    
    	juice.takeFromTheContainer(11.3);
    	//System.out.println(juice.getName());
    	juice.addToTheContainer(1.0);
    	//System.out.println(juice);
    	//System.out.println(juice.history());
    	juice.printAnalysis();
    	
        
    } 	

}
