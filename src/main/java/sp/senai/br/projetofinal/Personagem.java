/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.projetofinal;

/**
 *
 * @author aluno
 */
public class Personagem {
    
    private String nome;
    private Double pontosVida;
    private Double pontosMana;
    private Double pontosStamina;
    private Double forca;
    private Double energia;
    private Double agilidade;
    private Double vitalidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setAtributos(Double vida, Double mana, Double stamina, Double forca, Double energia, Double agilidade, Double vitalidade){
        this.pontosVida     = vida;
        this.pontosMana     = mana;
        this.pontosStamina  = stamina;
        this.forca          = forca;
        this.energia        = energia;
        this.agilidade      = agilidade;
        this.vitalidade     = vitalidade;        
    }

    public Double getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(Double pontosVida) {
        this.pontosVida = pontosVida;
    }

    public Double getPontosMana() {
        return pontosMana;
    }

    public void setPontosMana(Double pontosMana) {
        this.pontosMana = pontosMana;
    }

    public Double getPontosStamina() {
        return pontosStamina;
    }

    public void setPontosStamina(Double pontosStamina) {
        this.pontosStamina = pontosStamina;
    }

    public Double getForça() {
        return forca;
    }

    public void setForça(Double força) {
        this.forca = forca;
    }

    public Double getEnergia() {
        return energia;
    }

    public void setEnergia(Double energia) {
        this.energia = energia;
    }

    public Double getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(Double agilidade) {
        this.agilidade = agilidade;
    }

    public Double getVitalidade() {
        return vitalidade;
    }

    public void setVitalidade(Double vitalidade) {
        this.vitalidade = vitalidade;
    }
    
    public void consumirMana(Double mana){
        this.pontosMana -= mana;
    }
    
    public void consumirStamina(Double stamina){
        this.pontosStamina -= stamina;
    }
    
    public void sofrerDanoFisico(Double dano){
        this.pontosVida -= dano;
    }
    
    public void sofrerDanoMagico(Double dano){
        this.pontosVida -= dano;
    }
}
