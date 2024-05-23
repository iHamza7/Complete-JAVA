
enum Status {
    loading,
    error,
    saved
}

public class enumsand {
    public static void main(String[] args) {

        // Status[] ss = Status.values();
        Status s = Status.loading;

        switch (s) {
            case loading:
                System.out.println("Done loading data...");
                break;
            case error:
                System.out.println("error occurred...");
                break;
            case saved:
                System.out.println("Saved successfully");
                break;
            default:
                System.out.println("InValid Data");
                break;
        }

        // for (Status status : ss) {
        // System.out.println(status + " " + status.ordinal());
        // }
    }

}
