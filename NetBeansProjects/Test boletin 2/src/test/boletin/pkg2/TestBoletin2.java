
package test.boletin.pkg2;
public class TestBoletin2 {

    public static void main(String[] args) {
      float v=1000,sb,sl;
      int k=200,d=5;
      final int sf =1000;
      sb=sf+(5*v)/100+2*k+30*d;
      sl=sb-(18*sb)/100-36;
      float r=(18*sb)/100;
      System.out.println("O soldo bruto a percivir é de "+sb+"euros ó mes,");
      System.out.println("e o salario líquido é de "+sl+" euros mensuais");
      System.out.println(r);
    }
    
}
