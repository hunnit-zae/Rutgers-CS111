public class Recursion1{
		public static void main(String[] args) {
			System.out.println(convert(100));
			System.out.println(gcd(3388, 436));
			int[] arr = {1,2,-3,0,10,4,5};
			System.out.println(findSum(arr, arr.length));
			System.out.println(findMin(arr, arr.length));
		}

		public static String convert(int n){
			if(n == 1 )
				return "1";
			return convert(n/2) + (n%2);
		}

		public static int gcd(int num1, int num2){
			if (num2 == 0){
				return num1;
			}
			else{
			   int remainder = num1 % num2;
			   return gcd(num2, remainder);
			}
		}
		//Return sum of elements in A[0..N-1] using recursion
		//Precondition: n >= 0
		public static int findSum(int A[], int n){
			if(n == 0) return 0;
			return findSum(A, n - 1) + A[n-1];
		}

		//Recursive Minimum
		// Precondition: n >= 1 (size of the array)
		public static int findMin(int A[], int n){
			if (n == 1) return A[0];
			return  Math.min(findMin(A, n-1),A[n-1]);
		}


		
	}