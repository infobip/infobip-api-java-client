package infobip.examples;

import infobip.api.model.nc.query.NumberContextResponse;
import infobip.api.model.nc.query.NumberContextResponseDetails;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DeserializeNumberContextExample {

    public static void main(String[] args) {

        String responseBody =
                "{\n" +
                "   \"results\":[\n" +
                "      {\n" +
                "         \"to\":\"41793026727\",\n" +
                "         \"mccMnc\":\"22801\",\n" +
                "         \"originalNetwork\":{\n" +
                "            \"networkPrefix\":\"79\",\n" +
                "            \"countryPrefix\":\"41\"\n" +
                "         },\n" +
                "         \"ported\":false,\n" +
                "         \"roaming\":false,\n" +
                "         \"status\":{\n" +
                "            \"groupId\":2,\n" +
                "            \"groupName\":\"UNDELIVERABLE\",\n" +
                "            \"id\":9,\n" +
                "            \"name\":\"UNDELIVERABLE_NOT_DELIVERED\",\n" +
                "            \"description\":\"Message sent not delivered\"\n" +
                "         },\n" +
                "         \"error\":{\n" +
                "            \"groupId\":1,\n" +
                "            \"groupName\":\"HANDSET_ERRORS\",\n" +
                "            \"id\":27,\n" +
                "            \"name\":\"EC_ABSENT_SUBSCRIBER\",\n" +
                "            \"description\":\"Absent Subscriber\",\n" +
                "            \"permanent\":false\n" +
                "         }\n" +
                "      }\n" +
                "   ]\n" +
                "}";

        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();
        NumberContextResponse numberContextResponse = gson.fromJson(responseBody, NumberContextResponse.class);

        for (NumberContextResponseDetails result : numberContextResponse.getResults()) {
            System.out.println("Phone number: " + result.getTo());
            System.out.println("MccMnc: " + result.getMccMnc());
            System.out.println("Original country prefix: " + result.getOriginalNetwork().getCountryPrefix());
            System.out.println("Original network prefix: " + result.getOriginalNetwork().getNetworkPrefix());
            System.out.println("Serving MSC: " + result.getServingMSC());
            System.out.println("------------------------------------------------");
        }
    }
}