import org.junit.Assert;
import org.junit.Test;

public class TesteSimulado {

    @Test
    public void TesteSomaNumerosImpares(){
        Simulado simulado = new Simulado();
        int numeros[] = {1,2,3,4,5,6,7,8,9,10};
        int resultado = simulado.somaNumerosImpares(numeros);
        System.out.println(resultado);
        Assert.assertEquals(25,resultado);

    }

    @Test
    public void TestaconcatenaArrayEmString(){
        Simulado simulado = new Simulado();
        int numeros[] = new int [10];
        String resultado = simulado.concatenaArrayEmString(numeros);
        Assert.assertEquals("0,0,0,0,0,0,0,0,0,0,",resultado);
    }

    @Test
    public void TestaQuantidadeLetraNome(){
        Simulado simulado = new Simulado();
        int resultado = simulado.quantidadeLetraNome("Mendes");
        Assert.assertEquals(0,resultado);
    }

    @Test
    public void TestadiasDeMilitar(){
        Simulado simulado = new Simulado();
        int resultado = simulado.diasDeMilitar(25,9,2022);
        System.out.println(resultado);
        Assert.assertEquals(844,resultado);
    }
}
