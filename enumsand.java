
enum Status {
    loading,
    done,
    error,
    saved
}

public class enumsand {
    public static void main(String[] args) {

        Status[] ss = Status.values();

        for (Status status : ss) {
            System.out.println(status + "  this is value " + status.ordinal());
        }
    }

}
