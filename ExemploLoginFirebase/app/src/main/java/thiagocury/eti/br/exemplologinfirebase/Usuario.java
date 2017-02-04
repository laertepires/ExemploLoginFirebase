package thiagocury.eti.br.exemplologinfirebase;

/**
 * Created by Alunos on 21/12/2016.
 */

public class Usuario {

    private String login;
    private String senha;

    public Usuario() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}//fecha classe
