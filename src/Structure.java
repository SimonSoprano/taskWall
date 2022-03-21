import java.util.List;

interface Structure {
    // zwraca dowolny element o podanym kolorze
    Block findBlockByColor(String color);

    // zwraca wszystkie elementy z danego materiału
    List findBlocksByMaterial(String material);

    //zwraca liczbę wszystkich elementów tworzących strukturę
    int count();
}
