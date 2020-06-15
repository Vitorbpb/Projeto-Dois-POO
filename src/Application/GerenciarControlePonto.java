package application;

import Entidades.Gerente;
import Entidades.Operador;
import Entidades.RegistroPonto;
import Entidades.Secretaria;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {

    public static void main(String[] args) throws InterruptedException {

        //Gerente - Instanciando
        Gerente gerente = new Gerente(
                1,
                "Gerente João",
                "gerenteJoao@hotmail.com",
                "arquivoX",
                "loginUserGerenteJoao",
                "1234567"
        );

        //Secretaria - Instanciando
        Secretaria secretaria = new Secretaria(
                2,
                "Secretaria Maria",
                "secretariaMaria123@outlook.com",
                "arquivosXsX",
                "19999999999",
                "55"
        );

        //Operador - Instanciando
        Operador operador = new Operador(2,
                "Operador Zé",
                "operadorZéOperador@outlook.com",
                "arquivoXyZ",
                19.00
        );

        //Gerente - Entrada
        RegistroPonto registroPontoGerente = new RegistroPonto(1,gerente,LocalDate.now());
        registroPontoGerente.setHoraEntrada(LocalDateTime.now());
        registroPontoGerente.apresentarRegistroPonto();

        //Simulando tempo entrada
        Thread.sleep(2000);

        //Secretária - Entrada
        RegistroPonto registroPontoSecretaria = new RegistroPonto(1,secretaria,LocalDate.now());
        registroPontoSecretaria.setHoraEntrada(LocalDateTime.now());
        registroPontoSecretaria.apresentarRegistroPonto();

        //Simulando tempo entrada
        Thread.sleep(3000);

        //Operador - Entrada
        RegistroPonto registroPontoOperador = new RegistroPonto(1,operador,LocalDate.now());
        registroPontoOperador.setHoraEntrada(LocalDateTime.now());
        registroPontoOperador.apresentarRegistroPonto();

        //Simulando tempo entrada
        Thread.sleep(2000);

        //Gerente - Registrando saída
        registroPontoGerente.setHoraSaida(LocalDateTime.now());
        registroPontoGerente.apresentarRegistroPonto();

        //Simulando tempo de saída
        Thread.sleep(5000);

        //Secretária - Registrando saída
        registroPontoSecretaria.setHoraSaida(LocalDateTime.now());
        registroPontoSecretaria.apresentarRegistroPonto();

        //Simulando tempo de saída

        Thread.sleep(4000);

        //Operador Registrando saída
        registroPontoOperador.setHoraSaida(LocalDateTime.now());
        registroPontoOperador.apresentarRegistroPonto();

        //Simulando tempo de saída
        Thread.sleep(6000);
    }
}