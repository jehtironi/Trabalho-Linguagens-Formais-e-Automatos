package Gals;

// Definição da classe Token
public class Token
{
    // Atributos privados da classe
    private int id;
    private String lexeme;
    private int position;

    // Construtor da classe Token
    public Token(int id, String lexeme, int position)
    {
        this.id = id; // Inicializa o id
        this.lexeme = lexeme; // Inicializa o lexeme
        this.position = position; // Inicializa a position
    }

    // Método getter para id
    public final int getId()
    {
        return id;
    }

    // Método getter para lexeme
    public final String getLexeme()
    {
        return lexeme;
    }

    // Método getter para position
    public final int getPosition()
    {
        return position;
    }

    // Método para retornar a representação em string do Token
    public String toString()
    {
        return id+" ( "+lexeme+" ) @ "+position;
    };
}
