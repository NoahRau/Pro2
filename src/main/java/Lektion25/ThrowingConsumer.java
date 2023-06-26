package Lektion25;

public interface ThrowingConsumer<T, E extends Exception>  {
    void accept(T t) throws E;
}
