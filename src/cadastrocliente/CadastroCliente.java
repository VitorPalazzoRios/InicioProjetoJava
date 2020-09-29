package cadastrocliente;

public class CadastroCliente {

    public static void main(String[] args) {
        //Instanciar os objetos
        UICadastroCliente formulario = new UICadastroCliente ();
        Pessoa cliente = new Pessoa(formulario.nome, formulario.CPF, formulario.endereco, formulario.cidade,formulario.estado);
        
    }

}
