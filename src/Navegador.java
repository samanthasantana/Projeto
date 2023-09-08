public interface Navegador extends AparelhoTelefonico{

    private void ExibirPagina(){
        System.out.println("Tela Inicial");
    }

    private void AdicionarNovaAba(){
        System.out.println("Abrir Nova Aba");
    }
    private void AtualizarPagina(){
        System.out.println("Atualizar Pagina Selecionada");
    }
}
