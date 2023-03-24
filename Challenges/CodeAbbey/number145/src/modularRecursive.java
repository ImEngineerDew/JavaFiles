public class modularRecursive {
  public static void main(String args[]) {

  }

  public Long calculateModular(Long base, Long exp, Long module) {
    if (module == 1) {
      return 0L;
    }
    if (exp == 0) {
      return 1L;
    }
    Long temporal = calculateModular(base, exp / 2, module);
    Long result = ((long) Math.pow(temporal, 2) % module);

    if (exp % 2 == 1) {
      result = (result * base) % module;
    }
    return result;
  }
}
