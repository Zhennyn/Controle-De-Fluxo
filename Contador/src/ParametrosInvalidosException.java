//usar extends Exception
//sempre criar uma public junto

public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException() {
        System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
    }
}
