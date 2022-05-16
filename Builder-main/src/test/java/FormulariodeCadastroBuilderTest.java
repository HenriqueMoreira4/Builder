import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormulariodeCadastroBuilderTest {



    @Test
    void retornarCpfInvalido() {
        try {
            FormulariodeCadastroBuilder formulariodeCadastroBuilder = new FormulariodeCadastroBuilder();
            FormulariodeCadastro formulariodeCadastro = formulariodeCadastroBuilder
                    .setNome("Aluno 3")
                    .setMatricula(3)
                    .setEmail("aluno3@email.com")
                    .setCpf("")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("CPF inválido", e.getMessage());
        }
    }
    @Test
    void retornarCepInvalido() {
        try {
            FormulariodeCadastroBuilder formulariodeCadastroBuilder = new FormulariodeCadastroBuilder();
            FormulariodeCadastro formulariodeCadastro = formulariodeCadastroBuilder
                    .setNome("Aluno 3")
                    .setMatricula(3)
                    .setEmail("aluno3@email.com")
                    .setCpf("55555555555")
                    .setRg("36010490")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("CPF inválido, insira um cep com 11 digitos e apenas números", e.getMessage());
        }
    }
    @Test
    void ExcecaoParaCep2() {
        try {
            FormulariodeCadastroBuilder formulariodeCadastroBuilder = new FormulariodeCadastroBuilder();
            FormulariodeCadastro formulariodeCadastro = formulariodeCadastroBuilder
                    .setNome("Aluno 6")
                    .setMatricula(6)
                    .setEmail("aluno6@email.com")
                    .setCpf("555555555555")
                    .setRg("555555")
                    .setCelular("9885858558")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("digite o 9", e.getMessage());
        }
    }
    @Test
    void testUF() {
        try {
            FormulariodeCadastroBuilder formulariodeCadastroBuilder = new FormulariodeCadastroBuilder();
            FormulariodeCadastro formulariodeCadastro = formulariodeCadastroBuilder
                    .setNome("Aluno 7")
                    .setMatricula(7)
                    .setEmail("aluno7@email.com")
                    .setCpf("555555555555")
                    .setRg("555555")
                    .setCelular("9885858558")
                    .setEnderecoUF("MGG")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("invalido", e.getMessage());
        }
    }
}