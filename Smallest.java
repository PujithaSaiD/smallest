import java.util.*;
public class Smallest {
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=s.nextInt();
    }
    int min=a[0],sm=a[0];
    for(int i=0;i<n;i++){
        if(a[i]<min){
            sm=min;
            min=a[i];
        }
        else if(a[i]<sm && a[i]!=min){
            sm=a[i];
        }
    }
    System.out.println(min);
    System.out.print(sm);
            
    }

    }
