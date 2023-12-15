import java.util.Scanner;

/**
 * suhail
 */
public class suhail {

    public static void main(String[] args) {
        

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of persons sitting for job: ");
        int n=sc.nextInt();
        int tm=Integer.MAX_VALUE;
        int am=Integer.MAX_VALUE;
        int tam=Integer.MAX_VALUE;
        int indexT=0,indexA=0,indexTA=0;
        int []cost=new int[n];
        int []type=new int[n];
        for (int i = 0; i < cost.length; i++) {
            
            System.out.println("enter the salary demanded by person "+(i+1));
            cost[i]=sc.nextInt();
        }
        
        for (int i = 0; i < type.length; i++) {
            System.out.println("enter what person "+(i+1)+" profession is (1 for typist; 2 for author; 3 for person who is both typist  and author)");
            type[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(type[i]==1){
                tm=Math.min(tm, cost[i]);
                indexT=i;

            }
             else if(type[i]==2){
                am=Math.min(am, cost[i]);
                indexA=i;
            }
            else if(type[i]==3){
                tam=Math.min(tam, cost[i]);
                indexTA=i;
            }
        }

        if ((am+tm)<=tam) {
            System.out.println("u should hire person "+(indexT-1)+" and "+(indexA-1)+" to get most profit and get your work done");
          // System.out.println(am+tm);
        }
        else{
            System.out.println("you should hire person "+(indexTA+1)+" to get most profit and get your work done");
            //System.out.println(tam);
        }
        


    }
}