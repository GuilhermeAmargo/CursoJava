import org.junit.*;
public class Main {

    Paciente p1 = new Paciente(80,1.40);
    Paciente p2 = new Paciente(60, 1.50);
    Paciente p3 = new Paciente(75, 1.80);

    @Before
    public void before(){
        System.out.println("Começo dos testes");
    }

    @After
    public void after(){
        System.out.println("Fim dos testes");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println();
    }

    @AfterClass
    public static void afterClass(){
        System.out.println();
    }

    @Test
    public void test1(){
        System.out.println("Teste 1");
        System.out.println("IMC (Paciente 1) : "+p1.calcularIMC());
        System.out.println("Diagnóstico (Paciente 1) : " + p1.diagnostico());
    }

    @Test
    public void test2(){
        System.out.println("Teste 2");
        System.out.println("IMC (Paciente 2) : "+p2.calcularIMC());
        System.out.println("Diagnóstico (Paciente 2) : " + p2.diagnostico());
    }

    @Test
    public void test3(){
        System.out.println("Teste 3");
        System.out.println("IMC (Paciente 3) : "+p3.calcularIMC());
        System.out.println("Diagnóstico (Paciente 3) : " + p3.diagnostico());
    }
}