import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int calculo = 0;

        for(int i = 1; i < 11; i++){
            calculo = i * a;
            System.out.println(i +" x " +a +" = " +calculo);
        }

        br.close();
    }
}
