import model.Vinil;
import service.Estoque;

public class Main {

    public static void main(String[] args) {

        // criando vinis
        Vinil v1 = new Vinil("Backstreet Boys - Millennium", 5);
        Vinil v2 = new Vinil("Avril Lavigne - Let Go", 0);
        Vinil v3 = new Vinil("Britney Spears - Baby One More Time", -3);

        // criando estoque
        Estoque estoque = new Estoque();

        // verificando estoque
        estoque.verificarEstoque(v1);
        estoque.verificarEstoque(v2);
        estoque.verificarEstoque(v3);
    }
}