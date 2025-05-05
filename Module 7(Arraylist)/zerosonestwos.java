public class zerosonestwos {
    
    public static void main(String[] args) {
        int[] arr ={0,1,1,0,2,0,1,2,0,2,1,1,2,2,2};
        int n=arr.length;
        
        int noofones=0;
        int noofzeroes=0;
       //methodb-1 two pass sluytion 
        for( int i=0;i<n;i++){
            if(arr[i]==0) noofzeroes++;
            if(arr[i]==1) noofones++;
        }
        for( int i=0;i<n;i++){
            if(i<noofzeroes) arr[i]=0;
            else if (i<noofzeroes+noofones) arr[i]=1;
            else arr[i]=2;

        }
        for( int i=0;i<n;i++){
            System.out.print(arr[i]);
        

    }
}}
