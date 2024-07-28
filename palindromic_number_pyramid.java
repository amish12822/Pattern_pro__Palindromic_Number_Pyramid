/**
 * palindromic_number_pyramid
*/
public class palindromic_number_pyramid {

    public static void main(String[] args) {
        
        // first method

        int a = 5;
         
        for ( int i=1; i<=a; i++){

            for ( int j=1; j<=a-i; j++){
                System.out.print("  ");
            }

            for ( int j=i; j>=1; j--){
                System.out.print(j + " ");
            }

            for ( int j=2; j<=i; j++){
                System.out.print(j + " ");
            }

            System.out.println();
        }

        // second method

        int n = 5;

        for (int i=1; i<=n; i++){

            // space
            int space = ( n-i );
            for (int j=1; j<=space; j++){
                System.out.print("  ");
            }

            for (int j=i; j>=1; j--){
                System.out.print(j + " ");
            }

            for (int j=2; j<=i; j++){
                System.out.print(j + " ");
            }

            System.out.println();
        }

    }
}
