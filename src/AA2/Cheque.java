package AA2;

import java.util.Locale;
//Klesio Antonio do Nascimento

public class Cheque {
    private int valor;

    public Cheque(){
        this.setValor(valor);
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    private String getValorEntre100000E900000() {
        int resto = valor % 100000 / 10;
        int centenaMilhar = valor / 100000;
        int menosResto = valor % 10000;

        String nomecentenaMilhar = "";

        if (resto == 0) {

            switch (centenaMilhar) {
                case 1:
                    nomecentenaMilhar = "cem mil";
                    break;
                case 2:
                    nomecentenaMilhar = "duzentos mil";
                    break;
                case 3:
                    nomecentenaMilhar = "trezentos mil";
                    break;
                case 4:
                    nomecentenaMilhar = "quatrocentos mil";
                    break;
                case 5:
                    nomecentenaMilhar = "quinhentos mil";
                    break;
                case 6:
                    nomecentenaMilhar = "seiscentos mil";
                    break;
                case 7:
                    nomecentenaMilhar = "setecentos mil";
                    break;
                case 8:
                    nomecentenaMilhar = "oitocentos mil";
                    break;
                case 9:
                    nomecentenaMilhar = "novecentos mil";
                    break;
            }
        }

        if (menosResto < 1000)
            switch (centenaMilhar) {
                case 1:
                    nomecentenaMilhar = "cento mil";
                    break;
                case 2:
                    nomecentenaMilhar = "duzentos mil";
                    break;
                case 3:
                    nomecentenaMilhar = "trezentos mil";
                    break;
                case 4:
                    nomecentenaMilhar = "quatrocentos mil";
                    break;
                case 5:
                    nomecentenaMilhar = "quinhentos mil";
                    break;
                case 6:
                    nomecentenaMilhar = "seiscentos mil";
                    break;
                case 7:
                    nomecentenaMilhar = "setecentos mil";
                    break;
                case 8:
                    nomecentenaMilhar = "oitocentos mil";
                    break;
                case 9:
                    nomecentenaMilhar = "novecentos mil";
                    break;
            }

        if (resto != 0)
            switch (centenaMilhar) {
                case 1:
                    nomecentenaMilhar = "cento";
                    break;
                case 2:
                    nomecentenaMilhar = "duzentos";
                    break;
                case 3:
                    nomecentenaMilhar = "trezentos";
                    break;
                case 4:
                    nomecentenaMilhar = "quatrocentos";
                    break;
                case 5:
                    nomecentenaMilhar = "quinhentos";
                    break;
                case 6:
                    nomecentenaMilhar = "seiscentos";
                    break;
                case 7:
                    nomecentenaMilhar = "setecentos";
                    break;
                case 8:
                    nomecentenaMilhar = "oitocentos";
                    break;
                case 9:
                    nomecentenaMilhar = "novecentos";
                    break;
            }

        return nomecentenaMilhar;

    }

    private String getValorEntre10000E90000() {
        int resto = valor % 10000 / 10;
        int menosResto = (valor - (valor % 10000)) / 100000;
        int dezenaMilhar = valor / 10000 % 10;
        int dezenaMilharUni = valor / 1000;
        String nomeDezenaMilhar = "";

        if (resto == 0) {
            switch (dezenaMilhar) {
                case 1:
                    switch (dezenaMilharUni) {
                        case 10:
                            nomeDezenaMilhar = "dez mil";
                            break;
                        case 1:
                            nomeDezenaMilhar = "onze mil";
                            break;
                        case 2:
                            nomeDezenaMilhar = "doze mil";
                            break;
                        case 3:
                            nomeDezenaMilhar = "treze mil";
                            break;
                        case 4:
                            nomeDezenaMilhar = "quatorze mil";
                            break;
                        case 5:
                            nomeDezenaMilhar = "quinze mil";
                            break;
                        case 6:
                            nomeDezenaMilhar = "dezesseis mil";
                            break;
                        case 7:
                            nomeDezenaMilhar = "dezessete mil";
                            break;
                        case 8:
                            nomeDezenaMilhar = "dezoito mil";
                            break;
                        case 9:
                            nomeDezenaMilhar = "dezenove mil";
                    }
                    break;
                case 2:
                    nomeDezenaMilhar = "vinte mil";
                    break;
                case 3:
                    nomeDezenaMilhar = "trinta mil";
                    break;
                case 4:
                    nomeDezenaMilhar = "quarenta mil";
                    break;
                case 5:
                    nomeDezenaMilhar = "cinquenta mil";
                    break;
                case 6:
                    nomeDezenaMilhar = "sessenta mil";
                    break;
                case 7:
                    nomeDezenaMilhar = "setenta mil";
                    break;
                case 8:
                    nomeDezenaMilhar = "oitenta mil";
                    break;
                case 9:
                    nomeDezenaMilhar = "noventa mil";
            }
        }

        if (resto != 0 && valor > 100000) {

            dezenaMilharUni = valor / 1000 % 10 % 10;
            switch (dezenaMilhar) {
                case 1:
                    switch (dezenaMilharUni) {
                        case 0:
                            nomeDezenaMilhar = " e dez mil";
                            break;
                        case 1:
                            nomeDezenaMilhar = " e onze mil";
                            break;
                        case 2:
                            nomeDezenaMilhar = " e doze mil";
                            break;
                        case 3:
                            nomeDezenaMilhar = " e treze mil";
                            break;
                        case 4:
                            nomeDezenaMilhar = " e quatorze mil";
                            break;
                        case 5:
                            nomeDezenaMilhar = " e quinze mil";
                            break;
                        case 6:
                            nomeDezenaMilhar = " e dezesseis mil";
                            break;
                        case 7:
                            nomeDezenaMilhar = " e dezessete mil";
                            break;
                        case 8:
                            nomeDezenaMilhar = " e dezoito mil";
                            break;
                        case 9:
                            nomeDezenaMilhar = " e dezenove mil";
                    }
                    break;
                case 2:
                    nomeDezenaMilhar = " e vinte";
                    break;
                case 3:
                    nomeDezenaMilhar = " e trinta";
                    break;
                case 4:
                    nomeDezenaMilhar = " e quarenta";
                    break;
                case 5:
                    nomeDezenaMilhar = " e cinquenta";
                    break;
                case 6:
                    nomeDezenaMilhar = " e sessenta";
                    break;
                case 7:
                    nomeDezenaMilhar = " e setenta";
                    break;
                case 8:
                    nomeDezenaMilhar = " e oitenta";
                    break;
                case 9:
                    nomeDezenaMilhar = " e noventa";
            }
        }

        if (resto == 0 && valor > 100000) {
            dezenaMilharUni = valor / 1000 % 10 % 10;
            switch (dezenaMilhar) {
                case 1:
                    switch (dezenaMilharUni) {
                        case 0:
                            nomeDezenaMilhar = " e dez mil";
                            break;
                        case 1:
                            nomeDezenaMilhar = " e onze mil";
                            break;
                        case 2:
                            nomeDezenaMilhar = " e doze mil";
                            break;
                        case 3:
                            nomeDezenaMilhar = " e treze mil";
                            break;
                        case 4:
                            nomeDezenaMilhar = " e quatorze mil";
                            break;
                        case 5:
                            nomeDezenaMilhar = " e quinze mil";
                            break;
                        case 6:
                            nomeDezenaMilhar = " e dezesseis mil";
                            break;
                        case 7:
                            nomeDezenaMilhar = " e dezessete mil";
                            break;
                        case 8:
                            nomeDezenaMilhar = " e dezoito mil";
                            break;
                        case 9:
                            nomeDezenaMilhar = " e dezenove mil";
                    }
                    break;
                case 2:
                    nomeDezenaMilhar = " e vinte mil";
                    break;
                case 3:
                    nomeDezenaMilhar = " e trinta mil";
                    break;
                case 4:
                    nomeDezenaMilhar = " e quarenta mil";
                    break;
                case 5:
                    nomeDezenaMilhar = " e cinquenta mil";
                    break;
                case 6:
                    nomeDezenaMilhar = " e sessenta mil";
                    break;
                case 7:
                    nomeDezenaMilhar = " e setenta mil";
                    break;
                case 8:
                    nomeDezenaMilhar = " e oitenta mil";
                    break;
                case 9:
                    nomeDezenaMilhar = " e noventa mil";
            }
        }

        if (resto != 0 && valor < 100000)
            switch (dezenaMilhar) {
                case 1:
                    switch (dezenaMilharUni) {
                        case 10:
                            nomeDezenaMilhar = "dez mil";
                            break;
                        case 11:
                            nomeDezenaMilhar = "onze mil";
                            break;
                        case 12:
                            nomeDezenaMilhar = "doze mil";
                            break;
                        case 13:
                            nomeDezenaMilhar = "treze mil";
                            break;
                        case 14:
                            nomeDezenaMilhar = "quatorze mil";
                            break;
                        case 15:
                            nomeDezenaMilhar = "quinze mil";
                            break;
                        case 16:
                            nomeDezenaMilhar = "dezesseis mil";
                            break;
                        case 17:
                            nomeDezenaMilhar = "dezessete mil";
                            break;
                        case 18:
                            nomeDezenaMilhar = "dezoito mil";
                            break;
                        case 19:
                            nomeDezenaMilhar = "dezenove mil";
                    }
                    break;
                case 2:
                    nomeDezenaMilhar = "vinte mil";
                    break;
                case 3:
                    nomeDezenaMilhar = "trinta mil";
                    break;
                case 4:
                    nomeDezenaMilhar = "quarenta mil";
                    break;
                case 5:
                    nomeDezenaMilhar = "cinquenta mil";
                    break;
                case 6:
                    nomeDezenaMilhar = "sessenta mil";
                    break;
                case 7:
                    nomeDezenaMilhar = "setenta mil";
                    break;
                case 8:
                    nomeDezenaMilhar = "oitenta mil";
                    break;
                case 9:
                    nomeDezenaMilhar = "noventa mil";
            }

        if (resto != 0 && menosResto == 0 && valor < 100000)
            switch (dezenaMilhar) {
                case 1:
                    switch (dezenaMilharUni) {
                        case 10:
                            nomeDezenaMilhar = "dez mil";
                            break;
                        case 11:
                            nomeDezenaMilhar = "onze mil";
                            break;
                        case 12:
                            nomeDezenaMilhar = "doze mil";
                            break;
                        case 13:
                            nomeDezenaMilhar = "treze mil";
                            break;
                        case 14:
                            nomeDezenaMilhar = "quatorze mil";
                            break;
                        case 15:
                            nomeDezenaMilhar = "quinze mil";
                            break;
                        case 16:
                            nomeDezenaMilhar = "dezesseis mil";
                            break;
                        case 17:
                            nomeDezenaMilhar = "dezessete mil";
                            break;
                        case 18:
                            nomeDezenaMilhar = "dezoito mil";
                            break;
                        case 19:
                            nomeDezenaMilhar = "dezenove mil";
                    }
                    break;
                case 2:
                    nomeDezenaMilhar = "vinte";
                    break;
                case 3:
                    nomeDezenaMilhar = "trinta";
                    break;
                case 4:
                    nomeDezenaMilhar = "quarenta";
                    break;
                case 5:
                    nomeDezenaMilhar = "cinquenta";
                    break;
                case 6:
                    nomeDezenaMilhar = "sessenta";
                    break;
                case 7:
                    nomeDezenaMilhar = "setenta";
                    break;
                case 8:
                    nomeDezenaMilhar = "oitenta";
                    break;
                case 9:
                    nomeDezenaMilhar = "noventa";
            }

        return nomeDezenaMilhar;
    }

    private String getValorEntre1000E9000() {
        int milhar = valor / 1000 % 10;

        String nomeMilhar = "";

        if (valor < 10000)
            switch (milhar) {
                case 1:
                    nomeMilhar = "mil";
                    break;
                case 2:
                    nomeMilhar = "dois mil";
                    break;
                case 3:
                    nomeMilhar = "três mil";
                    break;
                case 4:
                    nomeMilhar = "quadro mil";
                    break;
                case 5:
                    nomeMilhar = "cinco mil";
                    break;
                case 6:
                    nomeMilhar = "seis mil";
                    break;
                case 7:
                    nomeMilhar = "sete mil";
                    break;
                case 8:
                    nomeMilhar = "oito mil";
                    break;
                case 9:
                    nomeMilhar = "nove mil";
                    break;
            }

        if (valor > 20000 && valor < 100000)
            switch (milhar) {
                case 1:
                    nomeMilhar = " e um mil";
                    break;
                case 2:
                    nomeMilhar = " e dois mil";
                    break;
                case 3:
                    nomeMilhar = " e três mil";
                    break;
                case 4:
                    nomeMilhar = " e quatro mil";
                    break;
                case 5:
                    nomeMilhar = " e cinco mil";
                    break;
                case 6:
                    nomeMilhar = " e seis mil";
                    break;
                case 7:
                    nomeMilhar = " e sete mil";
                    break;
                case 8:
                    nomeMilhar = " e oito mil";
                    break;
                case 9:
                    nomeMilhar = " e nove mil";
                    break;
            }

        if (valor > 100000 && valor < 110000 || valor > 120000) {
            switch (milhar) {
                case 1:
                    nomeMilhar = " e um mil";
                    break;
                case 2:
                    nomeMilhar = " e dois mil";
                    break;
                case 3:
                    nomeMilhar = " e três mil";
                    break;
                case 4:
                    nomeMilhar = " e quatro mil";
                    break;
                case 5:
                    nomeMilhar = " e cinco mil";
                    break;
                case 6:
                    nomeMilhar = " e seis mil";
                    break;
                case 7:
                    nomeMilhar = " e sete mil";
                    break;
                case 8:
                    nomeMilhar = " e oito mil";
                    break;
                case 9:
                    nomeMilhar = " e nove mil";
                    break;
            }
        }

        return nomeMilhar;
    }

    private String getValorEntre100E900() {
        int centena = valor % 1000 / 100;
        String nomeCentena = "";

        if (valor < 1000)
            switch (centena) {
                case 1:
                    if (valor == 100) {
                        nomeCentena = "cem";
                    } else
                        nomeCentena = "cento";
                    break;
                case 2:
                    nomeCentena = "duzentos";
                    break;
                case 3:
                    nomeCentena = "trezentos";
                    break;
                case 4:
                    nomeCentena = "quatrocentos";
                    break;
                case 5:
                    nomeCentena = "quinhentos";
                    break;
                case 6:
                    nomeCentena = "seiscentos";
                    break;
                case 7:
                    nomeCentena = "setecentos";
                    break;
                case 8:
                    nomeCentena = "oitocentos";
                    break;
                case 9:
                    nomeCentena = "novecentos";
                    break;
            }

        if (valor > 1000)
            switch (centena) {
                case 1:
                    if (valor == 100) {
                        nomeCentena = " e cem";
                    } else
                        nomeCentena = " e cento";
                    break;
                case 2:
                    nomeCentena = " e duzentos";
                    break;
                case 3:
                    nomeCentena = " e trezentos";
                    break;
                case 4:
                    nomeCentena = " e quatrocentos";
                    break;
                case 5:
                    nomeCentena = " e quinhentos";
                    break;
                case 6:
                    nomeCentena = " e seiscentos";
                    break;
                case 7:
                    nomeCentena = " e setecentos";
                    break;
                case 8:
                    nomeCentena = " e oitocentos";
                    break;
                case 9:
                    nomeCentena = " e novecentos";
                    break;
            }

        return nomeCentena;
    }

    private String getValorEntre10E90() {
        int dezena = valor % 100 / 10;
        int dezenaUnidade = valor % 10;
        String nomeDaDezena = "";

        if (valor < 100)
            switch (dezena) {
                case 1:
                    switch (dezenaUnidade) {
                        case 0:
                            nomeDaDezena = "dez";
                            break;
                        case 1:
                            nomeDaDezena = "onze";
                            break;
                        case 2:
                            nomeDaDezena = "doze";
                            break;
                        case 3:
                            nomeDaDezena = "treze";
                            break;
                        case 4:
                            nomeDaDezena = "quatorze";
                            break;
                        case 5:
                            nomeDaDezena = "quinze";
                            break;
                        case 6:
                            nomeDaDezena = "dezesseis";
                            break;
                        case 7:
                            nomeDaDezena = "dezessete";
                            break;
                        case 8:
                            nomeDaDezena = "dezoito";
                            break;
                        case 9:
                            nomeDaDezena = "dezenove ";
                    }
                    break;
                case 2:
                    nomeDaDezena = "vinte";
                    break;
                case 3:
                    nomeDaDezena = "trinta";
                    break;
                case 4:
                    nomeDaDezena = "quarenta";
                    break;
                case 5:
                    nomeDaDezena = "cinquenta";
                    break;
                case 6:
                    nomeDaDezena = "sessenta";
                    break;
                case 7:
                    nomeDaDezena = "setenta";
                    break;
                case 8:
                    nomeDaDezena = "oitenta";
                    break;
                case 9:
                    nomeDaDezena = "noventa";

            }

        if (valor > 100)
            switch (dezena) {
                case 1:
                    switch (dezenaUnidade) {
                        case 0:
                            nomeDaDezena = " e dez";
                            break;
                        case 1:
                            nomeDaDezena = " e onze";
                            break;
                        case 2:
                            nomeDaDezena = " e doze";
                            break;
                        case 3:
                            nomeDaDezena = " e treze";
                            break;
                        case 4:
                            nomeDaDezena = " e quatorze";
                            break;
                        case 5:
                            nomeDaDezena = " e quinze";
                            break;
                        case 6:
                            nomeDaDezena = " e dezesseis";
                            break;
                        case 7:
                            nomeDaDezena = " e dezessete";
                            break;
                        case 8:
                            nomeDaDezena = " e dezoito";
                            break;
                        case 9:
                            nomeDaDezena = " e dezenove";
                    }
                    break;
                case 2:
                    nomeDaDezena = " e vinte";
                    break;
                case 3:
                    nomeDaDezena = " e trinta";
                    break;
                case 4:
                    nomeDaDezena = " e quarenta";
                    break;
                case 5:
                    nomeDaDezena = " e cinquenta";
                    break;
                case 6:
                    nomeDaDezena = " e sessenta";
                    break;
                case 7:
                    nomeDaDezena = " e setenta";
                    break;
                case 8:
                    nomeDaDezena = " e oitenta";
                    break;
                case 9:
                    nomeDaDezena = " e noventa";
            }

        return nomeDaDezena;
    }

    private String getValorEntre1E09() {
        int unidade = valor % 100;

        String nomeUnidade = "";

        if (valor < 10) {
            unidade = unidade % 10;
            switch (unidade) {
                case 1:
                    nomeUnidade = "um";
                    break;
                case 2:
                    nomeUnidade = "dois";
                    break;
                case 3:
                    nomeUnidade = "três";
                    break;
                case 4:
                    nomeUnidade = "quatro";
                    break;
                case 5:
                    nomeUnidade = "cinco";
                    break;
                case 6:
                    nomeUnidade = "seis";
                    break;
                case 7:
                    nomeUnidade = "sete";
                    break;
                case 8:
                    nomeUnidade = "oito";
                    break;
                case 9:
                    nomeUnidade = "nove";

            }
        }

        if (valor > 20) {
            if (unidade > 10 && unidade < 20) {
                nomeUnidade = "";
            } else
                unidade = unidade % 10;
            switch (unidade) {
                case 1:
                    nomeUnidade = " e um";
                    break;
                case 2:
                    nomeUnidade = " e dois";
                    break;
                case 3:
                    nomeUnidade = " e três";
                    break;
                case 4:
                    nomeUnidade = " e quatro";
                    break;
                case 5:
                    nomeUnidade = " e cinco";
                    break;
                case 6:
                    nomeUnidade = " e seis";
                    break;
                case 7:
                    nomeUnidade = " e sete";
                    break;
                case 8:
                    nomeUnidade = " e oito";
                    break;
                case 9:
                    nomeUnidade = " e nove";
                    break;
            }
        }

        return nomeUnidade;
    }

    public String getValorPorExtenso() {
        String nomePorExteso;
        String real = "";
        String um = "um";

        if (valor <= 0 || valor > 1000000)
            return nomePorExteso = "";

        if (um.equals(getValorEntre1E09()))
            real = " real";
        else
            real = " reais";

        nomePorExteso = String.format("%s%s%s%s%s%s%s", getValorEntre100000E900000()
                , getValorEntre10000E90000(), getValorEntre1000E9000(), getValorEntre100E900()
                , getValorEntre10E90(), getValorEntre1E09(), real);

        return nomePorExteso.trim().toLowerCase(Locale.ROOT);
    }
}
