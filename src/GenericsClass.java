public class GenericsClass<T> implements IData<T>{
    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public GenericsClass(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }
}
