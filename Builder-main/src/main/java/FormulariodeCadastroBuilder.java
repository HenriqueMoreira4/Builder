import java.util.Date;
import java.util.Locale;

public class FormulariodeCadastroBuilder {

    private FormulariodeCadastro formulariodeCadastro;

    public FormulariodeCadastroBuilder() {
        formulariodeCadastro = new FormulariodeCadastro();
    }

    public FormulariodeCadastro build() {

        if(formulariodeCadastro.getCpf().equals("")){
            throw new IllegalArgumentException("CPF inválido");
        }
        if(formulariodeCadastro.getCpf().length() == 11){
            throw new IllegalArgumentException("CPF inválido, insira um cep com 11 digitos e apenas números");
        }
        if(formulariodeCadastro.getCelular().startsWith("9")){
            throw new IllegalArgumentException("digite o 9");
        }
        if(formulariodeCadastro.getEnderecoUF().trim().length() == 2){
            throw new IllegalArgumentException("invalido");
        }
        return formulariodeCadastro;
    }

    public FormulariodeCadastroBuilder setMatricula(int matricula) {
        formulariodeCadastro.setID(matricula);
        return this;
    }


    public FormulariodeCadastroBuilder setNome(String nome) {
        formulariodeCadastro.setNome(nome);
        return this;
    }

    public FormulariodeCadastroBuilder setDataNascimento(Date dataNascimento) {
        formulariodeCadastro.setDataNascimento(dataNascimento);
        return this;
    }

    public FormulariodeCadastroBuilder setNomeMae(String nomeMae) {
        formulariodeCadastro.setNomeMae(nomeMae);
        return this;
    }

    public FormulariodeCadastroBuilder setNomePai(String nomePai) {
        formulariodeCadastro.setNomePai(nomePai);
        return this;
    }

    public FormulariodeCadastroBuilder setCpf(String cpf) {
        formulariodeCadastro.setCpf(cpf);
        return this;
    }

    public FormulariodeCadastroBuilder setRg(String rg) {
        formulariodeCadastro.setRg(rg);
        return this;
    }

    public FormulariodeCadastroBuilder setEnderecoCidade(String enderecoCidade) {
        formulariodeCadastro.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public FormulariodeCadastroBuilder setEnderecoUF(String enderecoUF) {
        formulariodeCadastro.setEnderecoUF(enderecoUF);
        return this;
    }

    public FormulariodeCadastroBuilder setCep(String cep) {
        formulariodeCadastro.setCep(cep);
        return this;
    }

    public FormulariodeCadastroBuilder setEmail(String email) {
        formulariodeCadastro.setEmail(email);
        return this;
    }

    public FormulariodeCadastroBuilder setCelular(String celular) {
        formulariodeCadastro.setCelular(celular);
        return this;
    }

}