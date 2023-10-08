package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int GivenNumber[] = { 2,23,7,12,91,-4,1,8};
		int NumberOfGivenNumbers = GivenNumber.length;
		
		for (int i=0; i<NumberOfGivenNumbers-1; i++) {
			boolean sorted = true;
			for(int j=0 ;j<NumberOfGivenNumbers-1-i;j++) {
			   if(GivenNumber[j+1] < GivenNumber[j] ){
				   int temp = GivenNumber[j+1];
				   GivenNumber[j+1] = GivenNumber[j];
				   GivenNumber[j]= temp ;
				   
				   sorted = false;
			   }
		}
			if(sorted) break;
		     }
		
		for(int RequiredNumber: GivenNumber) {
			System.out.print(RequiredNumber + " ");
		}
		
		}
	}


