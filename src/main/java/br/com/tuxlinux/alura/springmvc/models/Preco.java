package br.com.tuxlinux.alura.springmvc.models;

import javax.persistence.Embeddable;
import java.math.BigDecimal;

/**
 * Created by deyve on 21/06/17.
 */

@Embeddable
public class Preco {

    private BigDecimal valor;
    private TipoPreco tipo;

    // Getters and Setters

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public TipoPreco getTipo() {
        return tipo;
    }

    public void setTipo(TipoPreco tipo) {
        this.tipo = tipo;
    }
}
