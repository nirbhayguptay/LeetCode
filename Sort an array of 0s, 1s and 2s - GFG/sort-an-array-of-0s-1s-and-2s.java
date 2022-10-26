//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int zeroCount = 0, oneCount = 0,twoCount = 0,x=0;
        for(x=0;x<n;x++){
            if(a[x]==0)
                zeroCount ++;
            if(a[x]==1)
                oneCount ++;
            if(a[x]==2)
                twoCount ++;
        }
        
        x=0;
        while(zeroCount>0){
            a[x]=0;
            x++;
            zeroCount --;
        }
        while(oneCount>0){
            a[x]=1;
            x++;
            oneCount --;
        }
        while(twoCount>0){
            a[x]=2;
            x++;
            twoCount --;
        }
    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends