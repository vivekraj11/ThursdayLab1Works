package thursdayLab1;
import java.util.Random;

public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 {
		        Random ran = new Random() ;
		        int in = ran.nextInt(10) ;
		        String[] studName={"Vivek","Raj","Sonu","Zia","Kabir","Arun","Uttam","Anish","Pawan","Dimple"};
		        System.out.print(studName[in]);
		    }

	}

}
