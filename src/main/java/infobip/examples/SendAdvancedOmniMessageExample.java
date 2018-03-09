package infobip.examples;

import infobip.api.client.SendAdvancedOmniMessage;
import infobip.api.config.BasicAuthConfiguration;
import infobip.api.model.omni.Destination;
import infobip.api.model.omni.To;
import infobip.api.model.omni.send.*;

import java.util.Collections;
import java.util.List;

public class SendAdvancedOmniMessageExample extends Example {

    public static void main(String[] args) {
        OmniAdvancedRequest omniAdvancedRequest = new OmniAdvancedRequest();
        omniAdvancedRequest.setDestinations(getDestinations());
        omniAdvancedRequest.setScenarioKey("Your-scenario-key");
        omniAdvancedRequest.setSms(getSmsData());
        omniAdvancedRequest.setViber(getViberData());

        SendAdvancedOmniMessage client = new SendAdvancedOmniMessage(new BasicAuthConfiguration(USERNAME, PASSWORD));
        OmniResponse response = client.execute(omniAdvancedRequest);

        System.out.println(response);
    }

    public static List<Destination> getDestinations() {
        To to = new To();
        to.setPhoneNumber(TO);
        Destination destination = new Destination();
        destination.setTo(to);

        return Collections.singletonList(destination);
    }

    public static SmsData getSmsData() {
        SmsData smsData = new SmsData();
        smsData.setText("Artık Ulusal Dil Tanımlayıcısı ile Türkçe karakterli smslerinizi rahatlıkla iletebilirsiniz.");
        Language language = new Language();
        language.setLanguageCode("TR");
        smsData.setLanguage(language);
        smsData.setTransliteration("TURKISH");

        return smsData;
    }

    private static ViberData getViberData() {
        ViberData viberData = new ViberData();
        viberData.setText("Luke, I am your father!");

        return viberData;
    }

}
