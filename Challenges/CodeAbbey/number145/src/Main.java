public class Main {
  public static void main(String[] args) {

    Long res = modulePower(14L,28L,219431273L);
    System.out.println(res);
  }

  public static Long modulePower(Long base, Long exp, Long mod)
  {
    if(mod==1)
    {
      return 0L;
    }
    if(exp==0)
    {
      return 1L;
    }
    Long temporal = modulePower(base,exp/2, mod);
    Long result = ((long)Math.pow(temporal,2)%mod);

    if(exp%2==1)
    {
      result = (result*base) % mod;
    }
    return result;
  }
}