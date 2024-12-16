/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * List of phones, emails and other information how a person can be contacted.
 */
public class FlowPersonContacts {

    private List<FlowPhoneContact> phone = null;

    private List<FlowEmailContact> email = null;

    private List<FlowPushContact> push = null;

    private List<FlowCommonOttContact> facebook = null;

    private List<FlowCommonOttContact> line = null;

    private List<FlowCommonOttContact> viberBots = null;

    private List<FlowCommonOttContact> liveChat = null;

    private List<FlowCommonOttContact> instagram = null;

    private List<FlowCommonOttContact> telegram = null;

    private List<FlowCommonOttContact> appleBusinessChat = null;

    private List<FlowCommonPushContact> webpush = null;

    private List<FlowCommonOttContact> instagramDm = null;

    private List<FlowCommonOttContact> kakaoSangdam = null;

    /**
     * Sets phone.
     * <p>
     * Field description:
     * A list of person&#39;s phone numbers. Max 100 numbers per person.
     *
     * @param phone
     * @return This {@link FlowPersonContacts instance}.
     */
    public FlowPersonContacts phone(List<FlowPhoneContact> phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Adds and item into phone.
     * <p>
     * Field description:
     * A list of person&#39;s phone numbers. Max 100 numbers per person.
     *
     * @param phoneItem The item to be added to the list.
     * @return This {@link FlowPersonContacts instance}.
     */
    public FlowPersonContacts addPhoneItem(FlowPhoneContact phoneItem) {
        if (this.phone == null) {
            this.phone = new ArrayList<>();
        }
        this.phone.add(phoneItem);
        return this;
    }

    /**
     * Returns phone.
     * <p>
     * Field description:
     * A list of person&#39;s phone numbers. Max 100 numbers per person.
     *
     * @return phone
     */
    @JsonProperty("phone")
    public List<FlowPhoneContact> getPhone() {
        return phone;
    }

    /**
     * Sets phone.
     * <p>
     * Field description:
     * A list of person&#39;s phone numbers. Max 100 numbers per person.
     *
     * @param phone
     */
    @JsonProperty("phone")
    public void setPhone(List<FlowPhoneContact> phone) {
        this.phone = phone;
    }

    /**
     * Sets email.
     * <p>
     * Field description:
     * A list of person&#39;s email addresses. Max 100 emails per person.
     *
     * @param email
     * @return This {@link FlowPersonContacts instance}.
     */
    public FlowPersonContacts email(List<FlowEmailContact> email) {
        this.email = email;
        return this;
    }

    /**
     * Adds and item into email.
     * <p>
     * Field description:
     * A list of person&#39;s email addresses. Max 100 emails per person.
     *
     * @param emailItem The item to be added to the list.
     * @return This {@link FlowPersonContacts instance}.
     */
    public FlowPersonContacts addEmailItem(FlowEmailContact emailItem) {
        if (this.email == null) {
            this.email = new ArrayList<>();
        }
        this.email.add(emailItem);
        return this;
    }

    /**
     * Returns email.
     * <p>
     * Field description:
     * A list of person&#39;s email addresses. Max 100 emails per person.
     *
     * @return email
     */
    @JsonProperty("email")
    public List<FlowEmailContact> getEmail() {
        return email;
    }

    /**
     * Sets email.
     * <p>
     * Field description:
     * A list of person&#39;s email addresses. Max 100 emails per person.
     *
     * @param email
     */
    @JsonProperty("email")
    public void setEmail(List<FlowEmailContact> email) {
        this.email = email;
    }

    /**
     * Sets push.
     * <p>
     * Field description:
     * List of person&#39;s push registrations.
     *
     * @param push
     * @return This {@link FlowPersonContacts instance}.
     */
    public FlowPersonContacts push(List<FlowPushContact> push) {
        this.push = push;
        return this;
    }

    /**
     * Adds and item into push.
     * <p>
     * Field description:
     * List of person&#39;s push registrations.
     *
     * @param pushItem The item to be added to the list.
     * @return This {@link FlowPersonContacts instance}.
     */
    public FlowPersonContacts addPushItem(FlowPushContact pushItem) {
        if (this.push == null) {
            this.push = new ArrayList<>();
        }
        this.push.add(pushItem);
        return this;
    }

    /**
     * Returns push.
     * <p>
     * Field description:
     * List of person&#39;s push registrations.
     *
     * @return push
     */
    @JsonProperty("push")
    public List<FlowPushContact> getPush() {
        return push;
    }

    /**
     * Sets push.
     * <p>
     * Field description:
     * List of person&#39;s push registrations.
     *
     * @param push
     */
    @JsonProperty("push")
    public void setPush(List<FlowPushContact> push) {
        this.push = push;
    }

    /**
     * Sets facebook.
     * <p>
     * Field description:
     * A list of person&#39;s Messenger destinations.
     *
     * @param facebook
     * @return This {@link FlowPersonContacts instance}.
     */
    public FlowPersonContacts facebook(List<FlowCommonOttContact> facebook) {
        this.facebook = facebook;
        return this;
    }

    /**
     * Adds and item into facebook.
     * <p>
     * Field description:
     * A list of person&#39;s Messenger destinations.
     *
     * @param facebookItem The item to be added to the list.
     * @return This {@link FlowPersonContacts instance}.
     */
    public FlowPersonContacts addFacebookItem(FlowCommonOttContact facebookItem) {
        if (this.facebook == null) {
            this.facebook = new ArrayList<>();
        }
        this.facebook.add(facebookItem);
        return this;
    }

    /**
     * Returns facebook.
     * <p>
     * Field description:
     * A list of person&#39;s Messenger destinations.
     *
     * @return facebook
     */
    @JsonProperty("facebook")
    public List<FlowCommonOttContact> getFacebook() {
        return facebook;
    }

    /**
     * Sets facebook.
     * <p>
     * Field description:
     * A list of person&#39;s Messenger destinations.
     *
     * @param facebook
     */
    @JsonProperty("facebook")
    public void setFacebook(List<FlowCommonOttContact> facebook) {
        this.facebook = facebook;
    }

    /**
     * Sets line.
     * <p>
     * Field description:
     * A list of person&#39;s Line destinations.
     *
     * @param line
     * @return This {@link FlowPersonContacts instance}.
     */
    public FlowPersonContacts line(List<FlowCommonOttContact> line) {
        this.line = line;
        return this;
    }

    /**
     * Adds and item into line.
     * <p>
     * Field description:
     * A list of person&#39;s Line destinations.
     *
     * @param lineItem The item to be added to the list.
     * @return This {@link FlowPersonContacts instance}.
     */
    public FlowPersonContacts addLineItem(FlowCommonOttContact lineItem) {
        if (this.line == null) {
            this.line = new ArrayList<>();
        }
        this.line.add(lineItem);
        return this;
    }

    /**
     * Returns line.
     * <p>
     * Field description:
     * A list of person&#39;s Line destinations.
     *
     * @return line
     */
    @JsonProperty("line")
    public List<FlowCommonOttContact> getLine() {
        return line;
    }

    /**
     * Sets line.
     * <p>
     * Field description:
     * A list of person&#39;s Line destinations.
     *
     * @param line
     */
    @JsonProperty("line")
    public void setLine(List<FlowCommonOttContact> line) {
        this.line = line;
    }

    /**
     * Sets viberBots.
     * <p>
     * Field description:
     * A list of person&#39;s Viber Bots destinations.
     *
     * @param viberBots
     * @return This {@link FlowPersonContacts instance}.
     */
    public FlowPersonContacts viberBots(List<FlowCommonOttContact> viberBots) {
        this.viberBots = viberBots;
        return this;
    }

    /**
     * Adds and item into viberBots.
     * <p>
     * Field description:
     * A list of person&#39;s Viber Bots destinations.
     *
     * @param viberBotsItem The item to be added to the list.
     * @return This {@link FlowPersonContacts instance}.
     */
    public FlowPersonContacts addViberBotsItem(FlowCommonOttContact viberBotsItem) {
        if (this.viberBots == null) {
            this.viberBots = new ArrayList<>();
        }
        this.viberBots.add(viberBotsItem);
        return this;
    }

    /**
     * Returns viberBots.
     * <p>
     * Field description:
     * A list of person&#39;s Viber Bots destinations.
     *
     * @return viberBots
     */
    @JsonProperty("viberBots")
    public List<FlowCommonOttContact> getViberBots() {
        return viberBots;
    }

    /**
     * Sets viberBots.
     * <p>
     * Field description:
     * A list of person&#39;s Viber Bots destinations.
     *
     * @param viberBots
     */
    @JsonProperty("viberBots")
    public void setViberBots(List<FlowCommonOttContact> viberBots) {
        this.viberBots = viberBots;
    }

    /**
     * Sets liveChat.
     * <p>
     * Field description:
     * A list of person&#39;s Live Chat destinations.
     *
     * @param liveChat
     * @return This {@link FlowPersonContacts instance}.
     */
    public FlowPersonContacts liveChat(List<FlowCommonOttContact> liveChat) {
        this.liveChat = liveChat;
        return this;
    }

    /**
     * Adds and item into liveChat.
     * <p>
     * Field description:
     * A list of person&#39;s Live Chat destinations.
     *
     * @param liveChatItem The item to be added to the list.
     * @return This {@link FlowPersonContacts instance}.
     */
    public FlowPersonContacts addLiveChatItem(FlowCommonOttContact liveChatItem) {
        if (this.liveChat == null) {
            this.liveChat = new ArrayList<>();
        }
        this.liveChat.add(liveChatItem);
        return this;
    }

    /**
     * Returns liveChat.
     * <p>
     * Field description:
     * A list of person&#39;s Live Chat destinations.
     *
     * @return liveChat
     */
    @JsonProperty("liveChat")
    public List<FlowCommonOttContact> getLiveChat() {
        return liveChat;
    }

    /**
     * Sets liveChat.
     * <p>
     * Field description:
     * A list of person&#39;s Live Chat destinations.
     *
     * @param liveChat
     */
    @JsonProperty("liveChat")
    public void setLiveChat(List<FlowCommonOttContact> liveChat) {
        this.liveChat = liveChat;
    }

    /**
     * Sets instagram.
     * <p>
     * Field description:
     * A list of person&#39;s Instagram destinations.
     *
     * @param instagram
     * @return This {@link FlowPersonContacts instance}.
     */
    public FlowPersonContacts instagram(List<FlowCommonOttContact> instagram) {
        this.instagram = instagram;
        return this;
    }

    /**
     * Adds and item into instagram.
     * <p>
     * Field description:
     * A list of person&#39;s Instagram destinations.
     *
     * @param instagramItem The item to be added to the list.
     * @return This {@link FlowPersonContacts instance}.
     */
    public FlowPersonContacts addInstagramItem(FlowCommonOttContact instagramItem) {
        if (this.instagram == null) {
            this.instagram = new ArrayList<>();
        }
        this.instagram.add(instagramItem);
        return this;
    }

    /**
     * Returns instagram.
     * <p>
     * Field description:
     * A list of person&#39;s Instagram destinations.
     *
     * @return instagram
     */
    @JsonProperty("instagram")
    public List<FlowCommonOttContact> getInstagram() {
        return instagram;
    }

    /**
     * Sets instagram.
     * <p>
     * Field description:
     * A list of person&#39;s Instagram destinations.
     *
     * @param instagram
     */
    @JsonProperty("instagram")
    public void setInstagram(List<FlowCommonOttContact> instagram) {
        this.instagram = instagram;
    }

    /**
     * Sets telegram.
     * <p>
     * Field description:
     * A list of person&#39;s Telegram destinations.
     *
     * @param telegram
     * @return This {@link FlowPersonContacts instance}.
     */
    public FlowPersonContacts telegram(List<FlowCommonOttContact> telegram) {
        this.telegram = telegram;
        return this;
    }

    /**
     * Adds and item into telegram.
     * <p>
     * Field description:
     * A list of person&#39;s Telegram destinations.
     *
     * @param telegramItem The item to be added to the list.
     * @return This {@link FlowPersonContacts instance}.
     */
    public FlowPersonContacts addTelegramItem(FlowCommonOttContact telegramItem) {
        if (this.telegram == null) {
            this.telegram = new ArrayList<>();
        }
        this.telegram.add(telegramItem);
        return this;
    }

    /**
     * Returns telegram.
     * <p>
     * Field description:
     * A list of person&#39;s Telegram destinations.
     *
     * @return telegram
     */
    @JsonProperty("telegram")
    public List<FlowCommonOttContact> getTelegram() {
        return telegram;
    }

    /**
     * Sets telegram.
     * <p>
     * Field description:
     * A list of person&#39;s Telegram destinations.
     *
     * @param telegram
     */
    @JsonProperty("telegram")
    public void setTelegram(List<FlowCommonOttContact> telegram) {
        this.telegram = telegram;
    }

    /**
     * Sets appleBusinessChat.
     * <p>
     * Field description:
     * A list of person&#39;s Apple Business Chat destinations.
     *
     * @param appleBusinessChat
     * @return This {@link FlowPersonContacts instance}.
     */
    public FlowPersonContacts appleBusinessChat(List<FlowCommonOttContact> appleBusinessChat) {
        this.appleBusinessChat = appleBusinessChat;
        return this;
    }

    /**
     * Adds and item into appleBusinessChat.
     * <p>
     * Field description:
     * A list of person&#39;s Apple Business Chat destinations.
     *
     * @param appleBusinessChatItem The item to be added to the list.
     * @return This {@link FlowPersonContacts instance}.
     */
    public FlowPersonContacts addAppleBusinessChatItem(FlowCommonOttContact appleBusinessChatItem) {
        if (this.appleBusinessChat == null) {
            this.appleBusinessChat = new ArrayList<>();
        }
        this.appleBusinessChat.add(appleBusinessChatItem);
        return this;
    }

    /**
     * Returns appleBusinessChat.
     * <p>
     * Field description:
     * A list of person&#39;s Apple Business Chat destinations.
     *
     * @return appleBusinessChat
     */
    @JsonProperty("appleBusinessChat")
    public List<FlowCommonOttContact> getAppleBusinessChat() {
        return appleBusinessChat;
    }

    /**
     * Sets appleBusinessChat.
     * <p>
     * Field description:
     * A list of person&#39;s Apple Business Chat destinations.
     *
     * @param appleBusinessChat
     */
    @JsonProperty("appleBusinessChat")
    public void setAppleBusinessChat(List<FlowCommonOttContact> appleBusinessChat) {
        this.appleBusinessChat = appleBusinessChat;
    }

    /**
     * Sets webpush.
     * <p>
     * Field description:
     * A list of person&#39;s web push destinations.
     *
     * @param webpush
     * @return This {@link FlowPersonContacts instance}.
     */
    public FlowPersonContacts webpush(List<FlowCommonPushContact> webpush) {
        this.webpush = webpush;
        return this;
    }

    /**
     * Adds and item into webpush.
     * <p>
     * Field description:
     * A list of person&#39;s web push destinations.
     *
     * @param webpushItem The item to be added to the list.
     * @return This {@link FlowPersonContacts instance}.
     */
    public FlowPersonContacts addWebpushItem(FlowCommonPushContact webpushItem) {
        if (this.webpush == null) {
            this.webpush = new ArrayList<>();
        }
        this.webpush.add(webpushItem);
        return this;
    }

    /**
     * Returns webpush.
     * <p>
     * Field description:
     * A list of person&#39;s web push destinations.
     *
     * @return webpush
     */
    @JsonProperty("webpush")
    public List<FlowCommonPushContact> getWebpush() {
        return webpush;
    }

    /**
     * Sets webpush.
     * <p>
     * Field description:
     * A list of person&#39;s web push destinations.
     *
     * @param webpush
     */
    @JsonProperty("webpush")
    public void setWebpush(List<FlowCommonPushContact> webpush) {
        this.webpush = webpush;
    }

    /**
     * Sets instagramDm.
     * <p>
     * Field description:
     * A list of person&#39;s Instagram DM destinations.
     *
     * @param instagramDm
     * @return This {@link FlowPersonContacts instance}.
     */
    public FlowPersonContacts instagramDm(List<FlowCommonOttContact> instagramDm) {
        this.instagramDm = instagramDm;
        return this;
    }

    /**
     * Adds and item into instagramDm.
     * <p>
     * Field description:
     * A list of person&#39;s Instagram DM destinations.
     *
     * @param instagramDmItem The item to be added to the list.
     * @return This {@link FlowPersonContacts instance}.
     */
    public FlowPersonContacts addInstagramDmItem(FlowCommonOttContact instagramDmItem) {
        if (this.instagramDm == null) {
            this.instagramDm = new ArrayList<>();
        }
        this.instagramDm.add(instagramDmItem);
        return this;
    }

    /**
     * Returns instagramDm.
     * <p>
     * Field description:
     * A list of person&#39;s Instagram DM destinations.
     *
     * @return instagramDm
     */
    @JsonProperty("instagramDm")
    public List<FlowCommonOttContact> getInstagramDm() {
        return instagramDm;
    }

    /**
     * Sets instagramDm.
     * <p>
     * Field description:
     * A list of person&#39;s Instagram DM destinations.
     *
     * @param instagramDm
     */
    @JsonProperty("instagramDm")
    public void setInstagramDm(List<FlowCommonOttContact> instagramDm) {
        this.instagramDm = instagramDm;
    }

    /**
     * Sets kakaoSangdam.
     * <p>
     * Field description:
     * A list of person&#39;s Kakao Sangdam destinations.
     *
     * @param kakaoSangdam
     * @return This {@link FlowPersonContacts instance}.
     */
    public FlowPersonContacts kakaoSangdam(List<FlowCommonOttContact> kakaoSangdam) {
        this.kakaoSangdam = kakaoSangdam;
        return this;
    }

    /**
     * Adds and item into kakaoSangdam.
     * <p>
     * Field description:
     * A list of person&#39;s Kakao Sangdam destinations.
     *
     * @param kakaoSangdamItem The item to be added to the list.
     * @return This {@link FlowPersonContacts instance}.
     */
    public FlowPersonContacts addKakaoSangdamItem(FlowCommonOttContact kakaoSangdamItem) {
        if (this.kakaoSangdam == null) {
            this.kakaoSangdam = new ArrayList<>();
        }
        this.kakaoSangdam.add(kakaoSangdamItem);
        return this;
    }

    /**
     * Returns kakaoSangdam.
     * <p>
     * Field description:
     * A list of person&#39;s Kakao Sangdam destinations.
     *
     * @return kakaoSangdam
     */
    @JsonProperty("kakaoSangdam")
    public List<FlowCommonOttContact> getKakaoSangdam() {
        return kakaoSangdam;
    }

    /**
     * Sets kakaoSangdam.
     * <p>
     * Field description:
     * A list of person&#39;s Kakao Sangdam destinations.
     *
     * @param kakaoSangdam
     */
    @JsonProperty("kakaoSangdam")
    public void setKakaoSangdam(List<FlowCommonOttContact> kakaoSangdam) {
        this.kakaoSangdam = kakaoSangdam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlowPersonContacts flowPersonContacts = (FlowPersonContacts) o;
        return Objects.equals(this.phone, flowPersonContacts.phone)
                && Objects.equals(this.email, flowPersonContacts.email)
                && Objects.equals(this.push, flowPersonContacts.push)
                && Objects.equals(this.facebook, flowPersonContacts.facebook)
                && Objects.equals(this.line, flowPersonContacts.line)
                && Objects.equals(this.viberBots, flowPersonContacts.viberBots)
                && Objects.equals(this.liveChat, flowPersonContacts.liveChat)
                && Objects.equals(this.instagram, flowPersonContacts.instagram)
                && Objects.equals(this.telegram, flowPersonContacts.telegram)
                && Objects.equals(this.appleBusinessChat, flowPersonContacts.appleBusinessChat)
                && Objects.equals(this.webpush, flowPersonContacts.webpush)
                && Objects.equals(this.instagramDm, flowPersonContacts.instagramDm)
                && Objects.equals(this.kakaoSangdam, flowPersonContacts.kakaoSangdam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                phone,
                email,
                push,
                facebook,
                line,
                viberBots,
                liveChat,
                instagram,
                telegram,
                appleBusinessChat,
                webpush,
                instagramDm,
                kakaoSangdam);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class FlowPersonContacts {")
                .append(newLine)
                .append("    phone: ")
                .append(toIndentedString(phone))
                .append(newLine)
                .append("    email: ")
                .append(toIndentedString(email))
                .append(newLine)
                .append("    push: ")
                .append(toIndentedString(push))
                .append(newLine)
                .append("    facebook: ")
                .append(toIndentedString(facebook))
                .append(newLine)
                .append("    line: ")
                .append(toIndentedString(line))
                .append(newLine)
                .append("    viberBots: ")
                .append(toIndentedString(viberBots))
                .append(newLine)
                .append("    liveChat: ")
                .append(toIndentedString(liveChat))
                .append(newLine)
                .append("    instagram: ")
                .append(toIndentedString(instagram))
                .append(newLine)
                .append("    telegram: ")
                .append(toIndentedString(telegram))
                .append(newLine)
                .append("    appleBusinessChat: ")
                .append(toIndentedString(appleBusinessChat))
                .append(newLine)
                .append("    webpush: ")
                .append(toIndentedString(webpush))
                .append(newLine)
                .append("    instagramDm: ")
                .append(toIndentedString(instagramDm))
                .append(newLine)
                .append("    kakaoSangdam: ")
                .append(toIndentedString(kakaoSangdam))
                .append(newLine)
                .append("}")
                .toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        String lineSeparator = System.lineSeparator();
        String lineSeparatorFollowedByIndentation = lineSeparator + "    ";
        return o.toString().replace(lineSeparator, lineSeparatorFollowedByIndentation);
    }
}
