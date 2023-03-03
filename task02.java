import java.util.*;
public class task02 {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start= sc.nextInt();

        System.out.print("Enter the ending number: ");
        int end= sc.nextInt();

        if(start > end){
            System.out.print("You Choosed the Wrong Numbers.");
        }
        else {
            System.out.print("  ");
            for(int i = start - 1; i <= end; i++){
                if(i > start){
                    System.out.printf("%d|", i);
                }
                else if (i == start){
                    System.out.print("   ");
                    for(int a = 0; a < (end-start+1)*6; a++){
                        System.out.print("-");
                    }
                    System.out.print("\n");
                    System.out.printf("%d|", i);
                }




                for(int  j = start; j <= end; j++){
                    if(i == start -1){
                        System.out.printf("%6d", j);
                    }
                    else{
                        System.out.printf("%6d", i*j);
                    }
                }

                System.out.print("\n");
            }

        }

    }

}

