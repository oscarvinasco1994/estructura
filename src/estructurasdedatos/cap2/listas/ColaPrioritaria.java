/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;

/**
 *
 * @author tusk
 */
public class ColaPrioridad {

    private Cola normal;
    private Cola empresarial;
    private Cola prioritaria;

    public void crearcolas() {
        this.normal = new Cola();
        this.empresarial = new Cola();
        this.prioritaria = new Cola();
    }

    public void hacercola(int cedula, int prioridad) {
        if (prioridad == 0) {
            if (normal.size() < empresarial.size()) {
                this.normal.encolar(cedula);
            } else {
                this.empresarial.encolar(cedula);
            }
        } else {

           if (prioridad ==1){
            this.prioritaria.encolar(cedula);
            }
        }

    }

    public void listar() {
        System.out.println("cola normal:");
        normal.listarr();
        System.out.println("   ");
        System.out.println("cola empresarial");
        empresarial.listarr();
        System.out.println("    ");
        System.out.println("cola prioritaria");
        prioritaria.listarr();

    }

    public void atender() {
        
        for (int i = 0; i <= prioritaria.size(); i++) {
            prioritaria.desencolar();
        }
        if (prioritaria.size() == 0) {
            normal.desencolar();
            empresarial.desencolar();
        }
    }
}
