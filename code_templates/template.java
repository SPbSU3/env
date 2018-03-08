import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        // InputStream inputStream = new FileInputStream("a.in");
        InputStream inputStream = System.in;
        // OutputStream outputStream = new FileOutputStream("a.out");
        OutputStream outputStream = System.out;

        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Solver solver = new Solver();
        while (solver.solve(in, out));

        out.close();
    }

    static class Solver {
        boolean solve(InputReader in, PrintWriter out) {
            int n;
            try {
                n = in.nextInt();
            } catch (Exception e) {
                return false;
            }
            out.println(n);
            out.flush();
            return true;
        }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream));
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
