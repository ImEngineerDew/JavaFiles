public class Main {
  public static void main(String[] args) {

    Long res = modulePower(963178184,1707957542,168995389);
    System.out.println(res);
  }

  public static long modulePower(long base, long exp, long mod)
  {
    if(mod==1)
    {
      return 0;
    }
    if(exp==0)
    {
      return 1;
    }
    long temporal = modulePower(base,exp/2, mod);
    Long result = ((temporal*temporal)%mod);

    if(exp%2==1)
    {
      result = (result*base) % mod;
    }
    return result;
  }
}