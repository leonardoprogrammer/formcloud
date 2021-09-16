package com.example.formcloud.util;

import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class Utils {


    public static Date getDataAtualSemHora() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    public static String tipoPessoa(String cpfCnpj) {
        String tmp = cpfCnpj != null ? Formatacao.remove_caracteres(cpfCnpj) : "";
        if (tmp.length() < 12) {
            return "F - Pessoa Física";
        } else {
            return "J - Pessoa Jurídica";
        }
    }

    public static String unaccent(String src) {
        if (src != null) {
            return Normalizer
                    .normalize(src, Normalizer.Form.NFD)
                    .replaceAll("[^\\p{ASCII}]", "");
        }
        return src;
    }

    public static boolean isNullOrEmpty(String value) {
        return value == null || "".equals(value);
    }

    public static boolean isNullOrEmpty(Character value) {
        return value == null || value.equals('\u0000');
    }

    public static boolean isNullOrEmpty(Map value) {
        return value == null || value.isEmpty();
    }

    public static boolean isNullOrEmpty(List value) {
        return value == null || value.isEmpty();
    }

    public static boolean isNullOrEmpty(Set value) {
        return value == null || value.isEmpty();
    }

    public static boolean isNullOrEmpty(Object[] value) {
        return value == null || value.length == 0;
    }

    public static boolean isNullOrZero(Integer value) {
        return value == null || value == 0;
    }

    public static boolean isNullOrVazia(List<Object> listObject) {
        return listObject == null || listObject.isEmpty();
    }

    public static boolean isNullOrZero(Double value) {
        return value == null || value == 0.0D;
    }
}
