package com.example.formcloud.util;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Formatacao {
    private static DateFormat dateFormat;
    private static DateFormat dateFormatLenient;

    public Formatacao() {

    }

    public static String getValorFormatado(String mascara, String valor) {
        for(int i = 0; i < valor.length(); ++i) {
            mascara = mascara.replaceFirst("[#]", valor.substring(i, i + 1));
        }

        return mascara.replaceAll("[#]", "");
    }

    public static boolean valida_cpf(String cpf) {
        boolean digitos_iguais = true;
        if (cpf.length() != 11) {
            return false;
        } else {
            int i;
            for(i = 0; i < cpf.length() - 1; ++i) {
                if (cpf.charAt(i) != cpf.charAt(i + 1)) {
                    digitos_iguais = false;
                    break;
                }
            }

            if (digitos_iguais) {
                return false;
            } else {
                String numeros = cpf.substring(0, 9);
                String digitos = cpf.substring(9);
                int soma = 0;

                for(i = 10; i > 1; --i) {
                    soma += Integer.parseInt(String.valueOf(numeros.charAt(10 - i))) * i;
                }

                int resultado = soma % 11 < 2 ? 0 : 11 - soma % 11;
                if (resultado != Integer.parseInt(String.valueOf(digitos.charAt(0)))) {
                    return false;
                } else {
                    numeros = cpf.substring(0, 10);
                    soma = 0;

                    for(i = 11; i > 1; --i) {
                        soma += Integer.parseInt(String.valueOf(numeros.charAt(11 - i))) * i;
                    }

                    resultado = soma % 11 < 2 ? 0 : 11 - soma % 11;
                    return resultado == Integer.parseInt(String.valueOf(digitos.charAt(1)));
                }
            }
        }
    }

    public static boolean valida_cnpj(String cnpj) {
        boolean digitos_iguais = true;
        if (cnpj.length() != 14) {
            return false;
        } else {
            int i;
            for(i = 0; i < cnpj.length() - 1; ++i) {
                if (cnpj.charAt(i) != cnpj.charAt(i + 1)) {
                    digitos_iguais = false;
                    break;
                }
            }

            if (!digitos_iguais) {
                int tamanho = cnpj.length() - 2;
                String numeros = cnpj.substring(0, tamanho);
                String digitos = cnpj.substring(tamanho);
                int soma = 0;
                int pos = tamanho - 7;

                for(i = tamanho; i >= 1; --i) {
                    soma += Integer.parseInt(String.valueOf(numeros.charAt(tamanho - i))) * pos--;
                    if (pos < 2) {
                        pos = 9;
                    }
                }

                int resultado = soma % 11 < 2 ? 0 : 11 - soma % 11;
                if (resultado != Integer.parseInt(String.valueOf(digitos.charAt(0)))) {
                    return false;
                } else {
                    ++tamanho;
                    numeros = cnpj.substring(0, tamanho);
                    soma = 0;
                    pos = tamanho - 7;

                    for(i = tamanho; i >= 1; --i) {
                        soma += Integer.parseInt(String.valueOf(numeros.charAt(tamanho - i))) * pos--;
                        if (pos < 2) {
                            pos = 9;
                        }
                    }

                    resultado = soma % 11 < 2 ? 0 : 11 - soma % 11;
                    return resultado == Integer.parseInt(String.valueOf(digitos.charAt(1)));
                }
            } else {
                return false;
            }
        }
    }

    public static String limparCnpj(String cnpj) {
        cnpj = cnpj.replaceAll("\\D", "");
        return cnpj;
    }

    public static String limparCpf(String cpf) {
        cpf = cpf.replaceAll("\\D", "");
        return cpf;
    }

    public static String limparCep(String cep) {
        if (cep == null) {
            return cep;
        } else {
            cep = cep.replaceAll("-", "");
            cep = cep.replaceAll("\\.", "");
            return cep;
        }
    }

    public static String formatarCep(String cep) {
        return formatar(cep, "#####-###");
    }

    public static String formatar(String valor, String mascara) {
        if (valor == null) {
            return null;
        } else {
            String dado = "";

            int indMascara;
            for(indMascara = 0; indMascara < valor.length(); ++indMascara) {
                char c = valor.charAt(indMascara);
                if (Character.isDigit(c)) {
                    dado = dado + c;
                }
            }

            indMascara = mascara.length();
            int indCampo = dado.length();

            while(indCampo > 0 && indMascara > 0) {
                --indMascara;
                if (mascara.charAt(indMascara) == '#') {
                    --indCampo;
                }
            }

            String saida;
            for(saida = ""; indMascara < mascara.length(); ++indMascara) {
                saida = saida + (mascara.charAt(indMascara) == '#' ? dado.charAt(indCampo++) : mascara.charAt(indMascara));
            }

            return saida;
        }
    }

    public static String formatarCpf(String cpf) {
        while(cpf.length() < 11) {
            cpf = "0" + cpf;
        }

        return formatar(cpf, "###.###.###-##");
    }

    public static String formatarCnpj(String cnpj) {
        while(cnpj.length() < 14) {
            cnpj = "0" + cnpj;
        }

        return formatar(cnpj, "##.###.###/####-##");
    }

    public static String formatarCPFCNPJ(String valor) {
        if (!Utils.isNullOrEmpty(valor)) {
            String mask_pattern = "(\\d{3})(\\d{3})(\\d{3})(\\d{2})";
            String mask_replace = "$1.$2.$3-$4";
            if (valor.length() > 11) {
                mask_pattern = "(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})";
                mask_replace = "$1.$2.$3/$4-$5";
            }

            Pattern pattern = Pattern.compile(mask_pattern);
            Matcher matcher = pattern.matcher(valor);
            if (matcher.matches()) {
                valor = matcher.replaceAll(mask_replace);
            }
        }

        return valor;
    }

    public static String formatarNumero(Object valor, String mascara) {
        DecimalFormat df = new DecimalFormat(mascara);
        return df.format(valor);
    }

    public static String remove_caracteres(String valor) {
        String toReturn = "";
        if (!Utils.isNullOrEmpty(valor)) {
            toReturn = valor.replaceAll("\\D", "");
        }

        return toReturn;
    }

    public static String remove_caracteres_cpf_cnpj(String valor) {
        return valor.replaceAll("\\D", "");
    }

    public static String remove_naoCaracteres(String valor) {
        String toReturn = "";
        if (!Utils.isNullOrEmpty(valor)) {
            toReturn = valor.replaceAll("[^a-zA-Z0-9\\s]", "");
        }

        return toReturn;
    }

    public static String limparTelefone(String fone) {
        if (fone == null) {
            return fone;
        } else {
            fone = fone.replace("-", "");
            fone = fone.replace("(", "");
            fone = fone.replace(")", "");
            fone = fone.replace(" ", "");
            return fone.trim();
        }
    }

    public static String preencherComZeros(String numeroStr, int tamanhoCampo) {
        if (numeroStr.length() > tamanhoCampo) {
            throw new IllegalArgumentException("O numero contem mais posicoes que o esperado (" + tamanhoCampo + "):" + numeroStr.length());
        } else if (numeroStr.length() == tamanhoCampo) {
            return numeroStr;
        } else {
            StringBuffer numeroAjustado = new StringBuffer(tamanhoCampo);
            int repeat = tamanhoCampo - numeroStr.length();

            for(int i = 0; i < repeat; ++i) {
                numeroAjustado.append("0");
            }

            numeroAjustado.append(numeroStr);
            if (numeroAjustado.length() > tamanhoCampo) {
                throw new IllegalStateException("Tamanho de campo diferente do esperado.");
            } else {
                return numeroAjustado.toString();
            }
        }
    }

    public static String getDataHoraFormatada(Date valorData) {
        if (dateFormat == null) {
            dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm", new Locale("pt", "BR"));
        }

        return dateFormat.format(valorData);
    }

    public static String getHoraFormatada(Date valorData) {
        if (dateFormat == null) {
            dateFormat = new SimpleDateFormat("HH:mm", new Locale("pt", "BR"));
        }

        return dateFormat.format(valorData);
    }

    public static Date getDataLenient(String valorData, String pattern) throws ParseException {
        if (dateFormatLenient == null) {
            dateFormatLenient = new SimpleDateFormat(pattern, new Locale("pt", "BR"));
            dateFormatLenient.setLenient(Boolean.FALSE);
        }

        return dateFormatLenient.parse(valorData);
    }

    public static int compareDateString(String date1, String date2, String datePattern) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
        Date dt1 = sdf.parse(date1);
        Date dt2 = sdf.parse(date2);
        return dt1.compareTo(dt2);
    }

    public static Date getDataAndroid(String valorData, String pattern) throws ParseException {
        if (valorData.matches("(.*)T(.*)")) {
            valorData = valorData.replace("T", " ");
        }

        SimpleDateFormat sdf = new SimpleDateFormat(pattern, new Locale("pt", "BR"));
        return sdf.parse(valorData);
    }

    public static String formatarValorMonetario(Double value) {
        if (value == null) {
            value = 0.0D;
        }

        NumberFormat nf = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));
        return nf.format(value);
    }


}
