import com.google.gson.*;
import Modelos.*;
public class Main {
    public static void main(String[] args) {
        Gson gs = new Gson();
        ResultSet objeto = gs.fromJson(jsonstr(), Modelos.ResultSet.class);
        System.out.println(objeto.toString());

    }

    public static String jsonstr(){
        return "{\n" +
                "    \"ResultSet\": {\n" +
                "        \"totalResultsAvailable\": \"1827221\",\n" +
                "        \"totalResultsReturned\": 2,\n" +
                "        \"firstResultPosition\": 1,\n" +
                "        \"Result\": [\n" +
                "            {\n" +
                "                \"Title\": \"potato jpg\",\n" +
                "                \"Summary\": \"Kentang Si bungsu dari keluarga Solanum tuberosum L ini ternyata memiliki khasiat untuk mengurangi kerutan  jerawat  bintik hitam dan kemerahan pada kulit  Gunakan seminggu sekali sebagai\",\n" +
                "                \"Url\": \"http://www.aprenderaprogramar.com/spaw/uploads /images/potato.jpg\",\n" +
                "                \"ClickUrl\": \"http://www. aprenderaprogramar.com/spaw/uploads/images/potato.jpg\",\n" +
                "                \"RefererUrl\": \"http://www.mediaindonesia.com/mediaperempuan/index.php?ar_id=Nzkw\",\n" +
                "                \"FileSize\": 22630,\n" +
                "                \"FileFormat\": \"jpeg\",\n" +
                "                \"Height\": \"362\",\n" +
                "                \"Width\": \"532\",\n" +
                "                \"Thumbnail\": {\n" +
                "                    \"Url\": \"http://thm-a01.yimg.com/nimage/557094559c18f16a\",\n" +
                "                    \"Height\": \"98\",\n" +
                "                    \"Width\": \"145\"\n" +
                "                }\n" +
                "            },\n" +
                "            {\n" +
                "                \"Title\": \"potato jpg\",\n" +
                "                \"Summary\": \"Introduction of puneri aloo This is a traditional potato preparation flavoured with curry leaves and peanuts and can be eaten on fasting day  Preparation time   10 min\",\n" +
                "                \"Url\": \"http://www.infovisual.info/01/photo/potato.jpg\",\n" +
                "                \"ClickUrl\": \"http://www.infovisual.info/01/photo/potato.jpg\",\n" +
                "                \"RefererUrl\": \"http://aprenderaprogramar.com.com/puneri-aloo-indian-%20recipe\",\n" +
                "                \"FileSize\": 119398,\n" +
                "                \"FileFormat\": \"jpeg\",\n" +
                "                \"Height\": \"685\",\n" +
                "                \"Width\": \"1024\",\n" +
                "                \"Thumbnail\": {\n" +
                "                    \"Url\": \"http://thm-a01.yimg.com/nimage/7fa23212efe84b64\",\n" +
                "                    \"Height\": \"107\",\n" +
                "                    \"Width\": \"160\"\n" +
                "                }\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "}";
    };


}