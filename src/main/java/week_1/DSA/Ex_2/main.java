package week_1.DSA.Ex_2;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Product product1 = new Product("Shoes", "Footwear", 1);
        Product product2 = new Product("T-Shirt", "Clothes", 2);
        Product product3 = new Product("Phone", "Electronics", 3);
        Product product4 = new Product("Television", "Electronics", 4);
        Product product5 = new Product("Coffee", "Beverage", 5);

        Product[] arr = new Product[5];
        arr[2] = product1;
        arr[3] = product2;
        arr[0] = product3;
        arr[1] = product4;
        arr[4] = product5;

        Product p2= linear_Search(4,arr);
        System.out.println("Used linear search->"+p2.productName);

      Product[] arr_sorted = Arrays.copyOf(arr,arr.length);// This will create a new array with elements of arr
Arrays.sort(arr_sorted, Comparator.comparingInt(p->p.productId));
Product p1=binary_search(2,arr_sorted);
        System.out.println("Used binary search->"+p1.productName);




    }
    public static Product linear_Search(int id,Product[] arr){
        Product ans=null;
        for(Product i:arr){
            if(i.productId==id){
                ans=i;
            }
        }
        return  ans;
    }
    public  static Product binary_search(int id,Product[] arr){
        int s=0;int e=arr.length-1;
        int mid=0;
        Product ans=null;
        while(s<=e){
            mid=((e-s)/2)+s;
            if(arr[mid].productId==id){
                ans=arr[mid];
                break;
            }else if(arr[mid].productId<id){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return ans;
    }
}
