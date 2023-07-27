package br.com.project.projetos;

public class NotFoundException extends Exception {
    public NotFoundException(final String nome) {
        super("Aluno(a) " + nome + " não encontrado(a)!");
    }

}
