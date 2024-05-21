import org.junit.*;
public class Teste {
        CompraParcelada compra1 = new CompraParcelada(1000.0, 1, 0.01);
        CompraParcelada compra2 = new CompraParcelada(1000.0, 2, 0.01);
        CompraParcelada compra5 = new CompraParcelada(1000.0, 5, 0.01);
        CompraParcelada compra10 = new CompraParcelada(1000.0, 10, 0.01);

        @BeforeClass
        public static void beforeClass(){
            System.out.println("Começo dos testes");
        }

        @AfterClass
        public static void afterClass(){
            System.out.println("Fim dos testes");
        }

        @Before
        public void before(){
            System.out.println("Realizando teste:");
        }

        @After
                public void after(){
            System.out.println("Teste finalizado!");
        }

        @Test
        public void test1(){
            System.out.println("Total para 1 parcela: " + compra1.total());
        }

        @Test
        public void test2(){
            System.out.println("Total para 2 parcelas: " + compra2.total());
        }

        @Test
        public void test3(){
            System.out.println("Total para 5 parcelas: " + compra5.total());
        }

        @Test
        public void test4(){
            System.out.println("Total para 10 parcelas: " + compra10.total());
        }
}
