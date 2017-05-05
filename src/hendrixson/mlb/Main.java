package hendrixson.mlb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {
        URL baseballLinscoreUrl = new URL("http://gd2.mlb.com/components/game/mlb/year_2017/month_05/day_05/gid_2017_05_05_nyamlb_chnmlb_1/linescore.json");
        InputStream is = baseballLinscoreUrl.openStream();
        try {
            BufferedReader br = new BufferedReader(is);
        }
    }
}
