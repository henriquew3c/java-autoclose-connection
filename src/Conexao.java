public class Conexao implements AutoCloseable {

    Conexao() {
        System.out.println("Abrindo conexão...");
        throw new IllegalStateException();
    }

    public void lerDados() {
        System.out.println("Lendo dados...");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Fechando conexão...");
    }
}
