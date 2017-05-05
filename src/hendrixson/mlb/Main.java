package hendrixson.mlb;

import java.io.*;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {
        URL baseballLinscoreUrl = new URL("http://gd2.mlb.com/components/game/mlb/year_2017/month_05/day_05/gid_2017_05_05_nyamlb_chnmlb_1/linescore.json");
        InputStream is = baseballLinscoreUrl.openStream();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String jsonString = readAll(br);
            System.out.println(jsonString);
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }
    }

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }
}
