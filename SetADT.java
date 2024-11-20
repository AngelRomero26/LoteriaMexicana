package Colecciones;


public interface SetADT<T>{

    //add-anade un elemento, ignorando duplicados
    public void add(T element);


    //addAll- anade elemetnos de un conjutno a otro 
    public void addAll(SetADT<T> set);

    //removeRandom* elimina devolviendo un elemento de manera aleatoria
    public T removeRandom();

    //remove- elimina y devuelve un elemento especificado del conjunto
    public T remove(T element);

    //union- devuelve la union de un conjunto y del parametro
    public SetADT<T> union(SetADT<T> set);

    //contains- devuelve true si el conjunto contiene un parametro
    public boolean conntains(T target);

    //equals- devuelve true si el conjutno y el parametro contienen exactamente lo mismos valores
    public boolean equals(SetADT<T> set);

    //devuelve true si el conjunto no contienen ningun elemento
    public boolean isEmpty();

    //size- devuelve el numero de elemento de un conjunto
    public int size();

    //iterator- proporciona un medio de iterar a traves de la coleccion
    public Iterator<T> iteratror();

    //toString- devuelve la representacin del conjunto en forma de caracteres
    public String toString();


}