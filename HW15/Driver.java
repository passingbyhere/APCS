public class Driver{
    public static void main(String[] args){
	System.out.println(Stats.mean(3,4)); // 3?
	System.out.println(Stats.mean(2,4)); //3
	System.out.println(Stats.mean(3.5,3.7));//3.6
	System.out.println(Stats.mean(3.0,5.0));//4.0
	System.out.println(Stats.max(5,10));//10
	System.out.println(Stats.max(5,5));//5?
	System.out.println(Stats.max(7.8,7.5));//7.8
	System.out.println(Stats.max(50,3,12));//50
	System.out.println(Stats.max(2,6.4,9.1));//9.1
        System.out.println(Stats.max(2.9,2.9,2.9));//2.9
	System.out.println(Stats.geoMean(2,32));//8
	System.out.println(Stats.geoMean(2.7,1.3));//1.8735
	System.out.println(Stats.geoMean(2,6,8));//4
	System.out.println(Stats.geoMean(12.6,15.3,1));//5.7768
    }
}
	
