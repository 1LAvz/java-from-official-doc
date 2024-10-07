package lavz.generics;

public class BoxWithoutGen {
    private Object object;

    public void set(Object object) { this.object = object; }
    public Object get() { return object; }


    public static void main(String[] args) {
        BoxWithoutGen box = new BoxWithoutGen();

        String myName = "Lucas AVanzi";
        box.set(myName);

        System.out.println(box.get());
    }
}
