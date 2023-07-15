/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.projetofinal;

/**
 *
 * @author aluno
 */
public class Batalha {
    
    private int qtdTurnoLimite;
    private int qtdTurnoAtual;
    
    private Personagem personagemUm;
    private Personagem personagemDois;
    
    private Ataque ataqueUm;
    private Ataque ataqueDois;
    
    private int personagemUmVitorias;
    private int personagemDoisVitorias;
    
    public boolean emAndamento = true;

    public int getQtdTurnoLimite() {
        return qtdTurnoLimite;
    }

    public void setQtdTurnoLimite(int qtdTurnoLimite) {
        this.qtdTurnoLimite = qtdTurnoLimite;
    }

    public int getQtdTurnoAtual() {
        return qtdTurnoAtual;
    }

    public void setQtdTurnoAtual(int qtdTurnoAtual) {
        this.qtdTurnoAtual = qtdTurnoAtual;
    }

    public Personagem getPersonagemUm() {
        return personagemUm;
    }

    public void setPersonagemUm(Personagem personagemUm) {
        this.personagemUm = personagemUm;
    }

    public Personagem getPersonagemDois() {
        return personagemDois;
    }

    public void setPersonagemDois(Personagem personagemDois) {
        this.personagemDois = personagemDois;
    }

    public int getPersonagemUmVitorias() {
        return personagemUmVitorias;
    }

    public void setPersonagemUmVitorias(int personagemUmVitorias) {
        this.personagemUmVitorias = personagemUmVitorias;
    }

    public int getPersonagemDoisVitorias() {
        return personagemDoisVitorias;
    }

    public void setPersonagemDoisVitorias(int personagemDoisVitorias) {
        this.personagemDoisVitorias = personagemDoisVitorias;
    }
    
    public void ataquePersonagemUm()
    {
        this.personagemUm.consumirMana(this.ataqueUm.getRequisitoMana());
        this.personagemUm.consumirStamina(this.ataqueUm.getRequisitoStamina());

        this.personagemDois.sofrerDanoFisico(this.ataqueUm.getDanoFisico());
        this.personagemDois.sofrerDanoMagico(this.ataqueUm.getDanoMagico());
        
        System.out.println("Personagem 1 atacou > personagem 2");
    }
    
    public void ataquePersonagemDois()
    {
        this.personagemDois.consumirMana(this.ataqueDois.getRequisitoMana());
        this.personagemDois.consumirStamina(this.ataqueDois.getRequisitoStamina());

        this.personagemUm.sofrerDanoFisico(this.ataqueDois.getDanoFisico());
        this.personagemUm.sofrerDanoMagico(this.ataqueDois.getDanoMagico());
        
        System.out.println("Personagem 2 atacou > personagem 1");
    }

    public void setAtaqueUm(Ataque ataqueUm) {
        this.ataqueUm = ataqueUm;
    }

    public void setAtaqueDois(Ataque ataqueDois) {
        this.ataqueDois = ataqueDois;
    }
    
    
}
