/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dionys
 */
public class Contrato {
    public String contrato;
    public String status;
    public String valorAdesao;
    public String dataAgendamento;
    
    public String getContrato(){
        return contrato;
    }
    
    public String getStatus(){
        return status;
    }

    public String getValorAdesao(){
        return valorAdesao;
    }

    public String getDataAgendamento(){
        return dataAgendamento;
    }
        
    public void setContrato(String param){
        contrato = param;
    }
    
    public void setStatus(String param){
        status = param;
    }

    public void setValorAdesao(String param){
        valorAdesao = param;
    }

    public void setDataAgendamento(String param){
        dataAgendamento = param;
    }
        
    
}
