public class Test{
    public static void main(String[] args){
	System.out.println(Stats.mean(3,4)); // 3
	System.out.println(Stats.mean(2,4)); //3
	System.out.println(Stats.mean(3.5,3.7));//3.6
	System.out.println(Stats.mean(3.0,5.0));//4.0
	System.out.println(Stats.mean(-1,9));//4
	System.out.println(Stats.max(5,10));//10
	System.out.println(Stats.max(5,5));//5
	System.out.println(Stats.max(7.8,7.5));//7.8
	System.out.println(Stats.geoMean(2,32));//8
	System.out.println(Stats.geoMean(2.7,1.3));//1.8734994
    }
}
			   
