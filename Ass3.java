public class Ass3 {

        public static void main(String[] args) {
            int mark[]={44,54,33,45,765,989,123,21,34,89,34,21,90,78};
            int mx=0;
            for(int i=0;i<mark.length;i++){
                if(mark[i]>mx)
                mx=mark[i];
            }
            System.out.println(mx);
        }
}
