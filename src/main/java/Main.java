public class Main {

    private static final NoobServer SERVER = new NoobServer();
    private static final NoobClient CLIENT = new NoobClient();
    private static final int PORT = 6666;

    public static void main(String[] args) {

        try {
            SERVER.start(PORT);
            while(true);
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }

}
