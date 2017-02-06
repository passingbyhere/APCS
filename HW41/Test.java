public class Test
{
    public static void grow(byte[] a, int n)
    {
	byte[] b = new byte[a.length + n];
	for(int s = 0; s < a.length; s++){
	    b[s] = a[s];
	}
	a = b;
    }
    public static void main(String[] arg)
    {
	byte[] a = {1,2,3,4,5,6,7};
	System.out.println(a.length);
        grow(a,3);
	System.out.println(a.length);
    }
}
