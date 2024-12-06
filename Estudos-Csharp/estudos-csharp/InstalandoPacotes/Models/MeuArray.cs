namespace InstalandoPacotes.Models;

public class MeuArray<T>
{
    private static int capacidade = 10;
    private int contador = 0;
    private T[] array = new T[capacidade]; // Array de 10 posições do tipo T (genérico) type

    public void AdicionarElementoArray(T elemento)
    {
        if (contador + 1 < 11)
        {
            array[contador] = elemento;
        }
        contador++;
    }

    public T this[int index]
    {
        get
        {
            return array[index];
        }
        set
        {
            array[index] = value;
        }
    }
}
