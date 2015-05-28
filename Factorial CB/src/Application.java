
class Function {
	
  int FirstFactorial(int num) { 
  
   if(num == 1){
		return 1;
	}
	return FirstFactorial(num-1) * num;

  }
}  
 public class Application{
	  public static void main (String[] args) {  
		    // keep this function call here     
		    Function c = new Function();
		    System.out.println(c.FirstFactorial(3));
		  }  
 }
 
  
 








  