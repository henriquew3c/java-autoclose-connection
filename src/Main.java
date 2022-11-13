public class Main {
    public static void main(String[] args) {
        try (Conexao conexao = new Conexao()) {
            conexao.lerDados();
        } catch (Exception e) {
            System.out.println("Deu erro na aplicação!");;
        }
    }
}