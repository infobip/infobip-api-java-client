package infobip.examples;

import infobip.api.client.PreviewSms;
import infobip.api.config.BasicAuthConfiguration;
import infobip.api.model.sms.mt.send.preview.Preview;
import infobip.api.model.sms.mt.send.preview.PreviewRequest;
import infobip.api.model.sms.mt.send.preview.PreviewResponse;

public class SmsPreviewExample extends Example{

    public static void main(String[] args) {

        PreviewSms client = new PreviewSms(new BasicAuthConfiguration(USERNAME, PASSWORD));

        PreviewRequest previewRequest = new PreviewRequest();
        previewRequest.setText("Artık Ulusal Dil Tanımlayıcısı ile Türkçe karakterli smslerinizi rahatlıkla iletebilirsiniz.");
        previewRequest.setLanguageCode("TR");
        previewRequest.setTransliteration("TURKISH");

        PreviewResponse previewResponse = client.execute(previewRequest);

        System.out.println("Original text: " + previewResponse.getOriginalText());
        System.out.println("Previews:");
        for (Preview preview : previewResponse.getPreviews()) {
            System.out.println("\t" + preview.getTextPreview());
            System.out.println("\tNumber of messages: " + preview.getMessageCount());
            System.out.println("\tCharacters remaining: " + preview.getCharactersRemaining());
            System.out.println("\tConfiguration: " + preview.getConfiguration().toString());
            System.out.println("\t------------------------------------------------");
        }
    }
}
