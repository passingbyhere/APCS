public class fooya{
    public static boolean booya(int a){
	a = 4;
	return true;
    }
    public static int hooya(){
	int a = 1; int b = 2; int c= 3;
	if(a == 1 || booya(a)){return c;}
	else if(b ==1||booya(a)){return b;}
    }
    public static void fooya(){
	int a = 42;
	//System.out.println(hooya() + this.c);
    }
}
