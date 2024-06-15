package Gals;

// Classe que representa um erro sintático
public class SyntaticError extends AnalysisError
{
// Construtor que recebe uma mensagem e uma posição
    public SyntaticError(String msg, int position)
	 {
        super(msg, position); // Chama o construtor da classe pai
    }

// Construtor que recebe apenas uma mensagem
    public SyntaticError(String msg)
    {
        super(msg); // Chama o construtor da classe pai
    }
}
