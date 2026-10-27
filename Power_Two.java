public class Power_Two {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
			return false;
		}
		if(n==1){
			return true;
		}
		long res=1;
		for(int i=0;i<=(int)Math.pow(n,0.5);i++){
			res*=2;
			if(res==n){
				return true;
			}
		}
		return false;
    }
    public static void main(String[] args) {
        Power_Two pt=new Power_Two();
        int n=216;
        System.out.println(pt.isPowerOfTwo(n));
    }
}
