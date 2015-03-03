package io.card.payment.i18n.locales;

import java.util.HashMap;
import java.util.Map;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;

// Class autogenerated!  Do not modify.
// Generated on 2014-12-10 11:29:25.142847 via script:
// /Users/twhipple/Documents/buffalo/lib-i18n/i18n/script/generate_android_i18n.py -java_src_path src/ -java_gen_path gen/ -stringkey_path io/card/payment/i18n/ -strings_path ../strings/projects/card.io/strings/ --strict

public class LocalizedStringsFR implements SupportedLocale<StringKey> {

    private static Map<StringKey, String> mDisplay = new HashMap<StringKey, String>();
    private static Map<String, String> mAdapted = new HashMap<String, String>();

    @Override
    public String getName() {
        return "fr";
    }

    @Override
    public String getAdaptedDisplay(StringKey key, String country) {
        String adaptedKey = key.toString() + "|" + country;
        if (mAdapted.containsKey(adaptedKey)) {
            return mAdapted.get(adaptedKey);
        } else {
            return mDisplay.get(key);
        }
    }

    public LocalizedStringsFR() {
        mDisplay.put(StringKey.CANCEL, "Annuler");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        mDisplay.put(StringKey.CARDTYPE_VISA, "Visa");
        mDisplay.put(StringKey.DONE, "OK");
        mDisplay.put(StringKey.ENTRY_CVV, "Crypto.");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "Code postal");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "Date d’expiration");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "MM/AA");
        mDisplay.put(StringKey.SCAN_GUIDE, "Maintenez la carte à cet endroit.\nElle va être automatiquement scannée.");
        mDisplay.put(StringKey.KEYBOARD, "Clavier…");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "Nº de carte");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "Carte");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "Cet appareil ne peut pas utiliser l’appareil photo pour lire les numéros de carte.");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "L’appareil photo n’est pas disponible.");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Une erreur s’est produite en ouvrant l’appareil photo.");

        // no adapted_translations found
    }
}
