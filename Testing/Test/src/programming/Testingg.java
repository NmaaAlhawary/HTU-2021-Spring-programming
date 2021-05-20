package programming;

public class Testingg {

	public static void main(String[] args) {
	
		
		 int []arrayBeforSort= {10,15,5,50};
		  
		 int [] array2= arraySort(arrayBeforSort);
		 printArray(array2);
		fob(array2);
		 
	}

	
	



	public  static int [] arraySort (int [] array)
	{
		
		int size=array.length;
	 for(int i=0;i<size-1;i++)
	 {
		 for(int j=0;j<size-1;j++)
		 {
			  if (array[j
			            ]>array[j+1])
			  {
				  int temp= array[j];
					array[j]=array[j+1];
					array[j+1]=temp; 
			  }
			
		 }
	 }
		return array;
	}

		
		public  static void printArray (int [] array)
		
		{
		
			for(int i=0;i<array.length;i++)
			{
				System.out.println(array[i]);
			}
		}
			public  static void fob (int [] array)
			
			{
			
				for(int i=2;i<array.length;i++)
				{
				if(array[i]==array[i-1]+array[i-2]) {
				System.out.println("yes");
				}
				else
				{
					System.out.println("no");
				}
				
				}
	
	}

}
