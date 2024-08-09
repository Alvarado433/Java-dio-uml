import java.java.dio.interfaces.AparelhoTelefonico;
import java.java.dio.interfaces.NavegadorWeb;
import java.java.dio.interfaces.ReprodutorMusical;

public class Iphone implements NavegadorWeb,ReprodutorMusical,AparelhoTelefonico{

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando no telefone");
    }

    @Override
    public void AtenderTelefone(String atender) {
    }

    @Override
    public void GravarCorreioVoz(String numero) {
       
    }

    @Override
    public void TocarMusica() {
        
    }

    @Override
    public void GravarMusica() {
      
    }

    @Override
    public void selecionarMusica() {
        
    }

    @Override
    public void ExibirPagina(String mostrar) {
       
    }

    @Override
    public void AdicionarPAgina(String adicionar) {
       
    }

    @Override
    public void AtualizarPagina() {
        
    }
    

}
