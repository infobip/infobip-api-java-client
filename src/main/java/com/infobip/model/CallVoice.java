/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Voice name in which text would be synthesized. More info about available languages and voices can be found [here](https://www.infobip.com/docs/voice-and-video/outbound-calls#text-to-speech-voice-over-broadcast).
 */
public enum CallVoice {
    HODA("Hoda"),
    ZEINA("Zeina"),
    NAAYF("Naayf"),
    AISHA_BETA_("Aisha (beta)"),
    FAROOQ_BETA_("Farooq (beta)"),
    HUSSEIN_BETA_("Hussein (beta)"),
    AMAL_BETA_("Amal (beta)"),
    SAYAN_BETA_("Sayan (beta)"),
    SUSHMITA_BETA_("Sushmita (beta)"),
    IVAN("Ivan"),
    CONCHITA("Conchita"),
    HERENA("Herena"),
    HUIHUI("Huihui"),
    ZHIYU("Zhiyu"),
    YAOYAO("Yaoyao"),
    KANGKANG("Kangkang"),
    LIU_BETA_("Liu (beta)"),
    WANG_BETA_("Wang (beta)"),
    ZHANG_BETA_("Zhang (beta)"),
    LIN_BETA_("Lin (beta)"),
    AKEMI_BETA_("Akemi (beta)"),
    CHEN_BETA_("Chen (beta)"),
    HUANG_BETA_("Huang (beta)"),
    DANNY("Danny"),
    TRACY("Tracy"),
    HANHAN("Hanhan"),
    ZHIWEI("Zhiwei"),
    YATING("Yating"),
    MATEJ("Matej"),
    JAKUB("Jakub"),
    HELLE("Helle"),
    NAJA("Naja"),
    MADS("Mads"),
    RUBEN("Ruben"),
    LOTTE("Lotte"),
    HANNA("Hanna"),
    JOANNA("Joanna"),
    ZIRA("Zira"),
    IVY("Ivy"),
    KENDRA("Kendra"),
    KIMBERLY("Kimberly"),
    SALLI("Salli"),
    JOEY("Joey"),
    JUSTIN("Justin"),
    MATTHEW("Matthew"),
    BENJAMIN("Benjamin"),
    JESSICA("Jessica"),
    JANE("Jane"),
    GUY("Guy"),
    RUSSELL("Russell"),
    CATHERINE("Catherine"),
    NICOLE("Nicole"),
    HAYLEY("Hayley"),
    BRIAN("Brian"),
    HAZEL("Hazel"),
    AMY("Amy"),
    EMMA("Emma"),
    ROSIE("Rosie"),
    GEORGE("George"),
    HEATHER("Heather"),
    ALICE("Alice"),
    HEERA("Heera"),
    ADITI("Aditi"),
    RAVEENA("Raveena"),
    PRIYA("Priya"),
    RAVI("Ravi"),
    SEAN("Sean"),
    GERAINT("Geraint"),
    HEIDI("Heidi"),
    EVELIN_BETA_("Evelin (beta)"),
    HORTENSE("Hortense"),
    CELINE("Celine"),
    LEA("Lea"),
    MATHIEU("Mathieu"),
    JULIETTE("Juliette"),
    PICARD("Picard"),
    CAROLINE("Caroline"),
    HARMONIE("Harmonie"),
    CHANTAL("Chantal"),
    GUILLAUME("Guillaume"),
    VICKI("Vicki"),
    HANS("Hans"),
    STEFAN("Stefan"),
    MARLENE("Marlene"),
    HEDDA("Hedda"),
    ANGELA("Angela"),
    MICHAEL("Michael"),
    KARSTEN("Karsten"),
    STEFANOS("Stefanos"),
    SOPHIA_BETA_("Sophia (beta)"),
    DINESH_BETA_("Dinesh (beta)"),
    LEELA_BETA_("Leela (beta)"),
    ASAF("Asaf"),
    AADITA("Aadita"),
    KALPANA("Kalpana"),
    HEMANT("Hemant"),
    SZABOLCS("Szabolcs"),
    DORA("Dora"),
    KARL("Karl"),
    INDAH_BETA_("Indah (beta)"),
    ARIF_BETA_("Arif (beta)"),
    REZA_BETA_("Reza (beta)"),
    ANDIKA("Andika"),
    NURUL_BETA_("Nurul (beta)"),
    GIANNA_BETA_("Gianna (beta)"),
    COSIMO("Cosimo"),
    CARLA("Carla"),
    BIANCA("Bianca"),
    GIORGIO("Giorgio"),
    LUCIA("Lucia"),
    TAKUMI("Takumi"),
    HARUKA("Haruka"),
    ICHIRO("Ichiro"),
    MIZUKI("Mizuki"),
    AYUMI("Ayumi"),
    SHASHANK_BETA_("Shashank (beta)"),
    NAMRATHA_BETA_("Namratha (beta)"),
    SEOYEON("Seoyeon"),
    HEAMI("Heami"),
    SUMI_BETA_("Sumi (beta)"),
    JINA_BETA_("Jina (beta)"),
    HIMCHAN_BETA_("Himchan (beta)"),
    MINHO_BETA_("Minho (beta)"),
    RIZWAN("Rizwan"),
    VISHNU_BETA_("Vishnu (beta)"),
    KIRTI_BETA_("Kirti (beta)"),
    HULDA("Hulda"),
    LIV("Liv"),
    EWA("Ewa"),
    PAULINA("Paulina"),
    MAJA("Maja"),
    JACEK("Jacek"),
    JAN("Jan"),
    CRISTIANO("Cristiano"),
    HELIA("Helia"),
    INES("Ines"),
    ABRIELLE_BETA_("Abrielle (beta)"),
    HENRIQUES_BETA_("Henriques (beta)"),
    JERALDO_BETA_("Jeraldo (beta)"),
    JACINDA_BETA_("Jacinda (beta)"),
    CAMILA("Camila"),
    RICARDO("Ricardo"),
    DANIEL("Daniel"),
    VITORIA("Vitoria"),
    HELOISA("Heloisa"),
    CARMEN("Carmen"),
    ANDREI("Andrei"),
    MAXIM("Maxim"),
    EKATERINA("Ekaterina"),
    PAVEL("Pavel"),
    TATYANA("Tatyana"),
    IRINA("Irina"),
    FILIP("Filip"),
    LADO("Lado"),
    MIGUEL("Miguel"),
    LINDA("Linda"),
    ENRIQUE("Enrique"),
    JUANA("Juana"),
    PABLO("Pablo"),
    GABRIELA_BETA_("Gabriela (beta)"),
    LUPE("Lupe"),
    LAURA("Laura"),
    PENELOPE("Penelope"),
    HILDA("Hilda"),
    RAUL("Raul"),
    MIA("Mia"),
    HEDVIG("Hedvig"),
    ASTRID("Astrid"),
    VALLUVAR("Valluvar"),
    GANESH_BETA_("Ganesh (beta)"),
    SHRUTI_BETA_("Shruti (beta)"),
    CHITRA("Chitra"),
    VIJAY_BETA_("Vijay (beta)"),
    SAMANTHA_BETA_("Samantha (beta)"),
    NATCHAYA_BETA_("Natchaya (beta)"),
    PATTARA("Pattara"),
    SEDA("Seda"),
    FILIZ("Filiz"),
    ULYANA("Ulyana"),
    AN("An"),
    LIEN_BETA_("Lien (beta)"),
    QUAN_BETA_("Quan (beta)"),
    MAI_BETA_("Mai (beta)"),
    TUAN_BETA_("Tuan (beta)"),
    GWYNETH("Gwyneth");

    private final String value;

    CallVoice(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static CallVoice fromValue(String value) {
        for (CallVoice enumElement : CallVoice.values()) {
            if (enumElement.value.equals(value)) {
                return enumElement;
            }
        }
        throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
    }
}
